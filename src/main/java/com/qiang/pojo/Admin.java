package com.qiang.pojo;

public class Admin {
    private Integer adminId;

    private String adninName;

    private String adminPassword;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdninName() {
        return adninName;
    }

    public void setAdninName(String adninName) {
        this.adninName = adninName == null ? null : adninName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }
}