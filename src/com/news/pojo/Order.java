package com.news.pojo;

public class Order {
    private String shopId;

    private String shopUser;

    private String shopPrice;

    private String shopid;

    private Integer id;

    private String relateName;

    private String number;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getShopUser() {
        return shopUser;
    }

    public void setShopUser(String shopUser) {
        this.shopUser = shopUser == null ? null : shopUser.trim();
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice == null ? null : shopPrice.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRelateName() {
        return relateName;
    }

    public void setRelateName(String relateName) {
        this.relateName = relateName == null ? null : relateName.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
}