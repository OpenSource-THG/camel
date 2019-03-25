package org.apache.camel.component.pulsar.utils.autoconfiguration;

import org.junit.Test;

import static org.junit.Assert.*;


public class PulsarPathTest {

    @Test
    public void noTenant() {
        PulsarPath pulsarPath = new PulsarPath("topic");
        assertFalse(pulsarPath.isAutoConfigurable());
    }

    @Test
    public void defaultPersistence() {
        PulsarPath pulsarPath = new PulsarPath("tenant/namespace/topic");
        assertTrue(pulsarPath.isAutoConfigurable());
        assertEquals("tenant", pulsarPath.getTenant());
        assertEquals("tenant/namespace", pulsarPath.getNamespace());
    }

    @Test
    public void persistent() {
        PulsarPath pulsarPath = new PulsarPath("persistent://tenant/namespace/topic");
        assertTrue(pulsarPath.isAutoConfigurable());
        assertEquals("tenant", pulsarPath.getTenant());
        assertEquals("tenant/namespace", pulsarPath.getNamespace());
    }

    @Test
    public void nonPersistent() {
        PulsarPath pulsarPath = new PulsarPath("non-persistent://tenant/namespace/topic");
        assertTrue(pulsarPath.isAutoConfigurable());
        assertEquals("tenant", pulsarPath.getTenant());
        assertEquals("tenant/namespace", pulsarPath.getNamespace());
    }
}
