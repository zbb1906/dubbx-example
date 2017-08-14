package com.ybveg.govx.system.model.po.sys;

public class MenuMoudle {

    private String menuId;

    private String moudleId;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMoudleId() {
        return moudleId;
    }

    public void setMoudleId(String moudleId) {
        this.moudleId = moudleId == null ? null : moudleId.trim();
    }
}