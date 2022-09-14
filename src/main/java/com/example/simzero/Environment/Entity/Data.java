package com.example.simzero.Environment.Entity;

public class Data {
    private String name; // 数据名称
    private String industry; // 数据所属产业
    private String owner; // 数据持有人
    private Double holdingCost; // 持有成本
    private Boolean isVerified; // 数据是否被认证（合规） True 认证 False 未认证

    /**Getter**/
    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public String getOwner() {
        return owner;
    }

    public Double getHoldingCost() {
        return holdingCost;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    /**Setter**/
    public void setName(String name) {
        this.name = name;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setHoldingCost(Double holdingCost) {
        this.holdingCost = holdingCost;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    /**Constructor**/
    public Data(String name, String industry, String owner, Double holdingCost, Boolean isVerified) {
        this.name = name;
        this.industry = industry;
        this.owner = owner;
        this.holdingCost = holdingCost;
        this.isVerified = isVerified;
    }

    /**Printer**/
    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", owner='" + owner + '\'' +
                ", holdingCost=" + holdingCost +
                ", isVerified=" + isVerified +
                '}';
    }
}

