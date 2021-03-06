package de.iweinzierl.easyprofiles.persistence;

import com.google.common.base.MoreObjects;
import com.orm.dsl.Table;

@Table
public class WifiSettings {

    private Long id;

    private boolean wifiEnabled;
    private boolean wifiHotspotEnabled;

    public WifiSettings() {
        this.wifiEnabled = true;
        this.wifiHotspotEnabled = false;
    }

    public WifiSettings(boolean wifiEnabled, boolean wifiHotspotEnabled) {
        this.wifiEnabled = wifiEnabled;
        this.wifiHotspotEnabled = wifiHotspotEnabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }

    public void setWifiEnabled(boolean wifiEnabled) {
        this.wifiEnabled = wifiEnabled;
    }

    public boolean isWifiHotspotEnabled() {
        return wifiHotspotEnabled;
    }

    public void setWifiHotspotEnabled(boolean wifiHotspotEnabled) {
        this.wifiHotspotEnabled = wifiHotspotEnabled;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("wifiEnabled", wifiEnabled)
                .add("wifiHotspotEnabled", wifiHotspotEnabled)
                .toString();
    }
}
