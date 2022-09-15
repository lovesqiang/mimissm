package com.qiang.pojo;

public class Shop {
    private Integer shopId;

    private String shopName;

    private String shopIntroduce;

    private Double shopPrice;

    private String shopImage;

    private Integer shopCount;

    private String shopDate;

    private Integer shopTypeid;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopIntroduce() {
        return shopIntroduce;
    }

    public void setShopIntroduce(String shopIntroduce) {
        this.shopIntroduce = shopIntroduce == null ? null : shopIntroduce.trim();
    }

    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage == null ? null : shopImage.trim();
    }

    public Integer getShopCount() {
        return shopCount;
    }

    public void setShopCount(Integer shopCount) {
        this.shopCount = shopCount;
    }

    public String getShopDate() {
        return shopDate;
    }

    public void setShopDate(String shopDate) {
        this.shopDate = shopDate == null ? null : shopDate.trim();
    }

    public Integer getShopTypeid() {
        return shopTypeid;
    }

    public void setShopTypeid(Integer shopTypeid) {
        this.shopTypeid = shopTypeid;
    }
}