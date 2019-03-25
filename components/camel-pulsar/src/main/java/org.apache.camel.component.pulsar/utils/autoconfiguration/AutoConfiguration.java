package org.apache.camel.component.pulsar.utils.autoconfiguration;

import org.apache.camel.component.pulsar.configuration.AdminConfiguration;
import org.apache.pulsar.client.admin.PulsarAdmin;
import org.apache.pulsar.client.admin.PulsarAdminException;
import org.apache.pulsar.client.admin.Tenants;
import org.apache.pulsar.common.policies.data.TenantInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AutoConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutoConfiguration.class);


    private PulsarAdmin pulsarAdmin;
    private AdminConfiguration adminConfiguration;

    public AutoConfiguration(PulsarAdmin pulsarAdmin) {
        setPulsarAdmin(pulsarAdmin);
    }

    public AutoConfiguration(){}

    public void ensureNameSpaceAndTenant(String path) {
        if(pulsarAdmin != null && adminConfiguration != null && adminConfiguration.isAutoCreateAllowed()) {
            PulsarPath pulsarPath = new PulsarPath(path);
            if (pulsarPath.isAutoConfigurable()) {
                String tenant = pulsarPath.getTenant();
                String namespace = pulsarPath.getNamespace();
                try {
                    ensureTenant(tenant);
                    ensureNameSpace(tenant, namespace);
                } catch (PulsarAdminException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
    }

    private void ensureNameSpace(String tenant, String namespace) throws PulsarAdminException {
        List<String> namespaces = pulsarAdmin.namespaces().getNamespaces(tenant);
        if (!namespaces.contains(namespace)) {
            pulsarAdmin.namespaces().createNamespace(namespace, adminConfiguration.getClusters());
        }
    }

    private void ensureTenant(String tenant) throws PulsarAdminException {
        Tenants tenants1 = pulsarAdmin.tenants();
        List<String> tenants = tenants1.getTenants();
        if (!tenants.contains(tenant)) {
            TenantInfo tenantInfo = new TenantInfo();
            tenantInfo.setAllowedClusters(adminConfiguration.getClusters());
            pulsarAdmin.tenants().createTenant(tenant, tenantInfo);
        }
    }

    public PulsarAdmin getPulsarAdmin() {
        return pulsarAdmin;
    }

    public void setPulsarAdmin(PulsarAdmin pulsarAdmin) {
        this.pulsarAdmin = pulsarAdmin;
        adminConfiguration = (AdminConfiguration) pulsarAdmin.getClientConfigData();
    }
}
