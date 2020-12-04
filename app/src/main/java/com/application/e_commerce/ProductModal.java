package com.application.e_commerce;

public class ProductModal {
    private String producatName, productQty, productPrice;
    private Integer imageUrl;

    public ProductModal(String producatName, String productQty, String productPrice, Integer imageUrl) {
        this.producatName = producatName;
        this.productQty = productQty;
        this.productPrice = productPrice;
        this.imageUrl = imageUrl;
    }

    public String getProducatName() {
        return producatName;
    }

    public void setProducatName(String producatName) {
        this.producatName = producatName;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
