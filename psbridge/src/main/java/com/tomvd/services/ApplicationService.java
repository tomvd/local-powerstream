package com.tomvd.services;

import org.eclipse.paho.client.mqttv3.MqttException;

public interface ApplicationService {
    void setSl(ServiceLocator sl);
    boolean isOnline();
    void publishJsonState(String id, String json) throws MqttException;
    Integer getGridPower();
    Boolean getSmartEnabled();
    Integer getSoc();
    Boolean getChargerEnabled();
    void setCharger(Boolean enabled);
}
