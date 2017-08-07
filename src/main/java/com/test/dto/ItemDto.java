package com.test.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目名称：ex-example
 * 包名：com.test.dto
 * 类名称：ItemDto.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 20:43
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 20:43
 * 修改备注：
 */
public class ItemDto implements Serializable {
    private String id; // UUID
    private String businessId; // 业务主键（需要检查不重复）
    private String type; // 只支持A，B，C三个值
    private String standardItemIdentification; // 随意
    private String sellersItemIdentification; // 随意
    private String itemName; // 随意
    private Date period; // 时间格式，输入格式为201703类似
    private String unitCode; // EA
    private String currencyID; // CNY
    private String receiptID; // 随意
    private String comment; // 大文本
    private String department; // 随意
    private Double priceWithTax; // 金钱格式
    private Integer quantity; // 数量
    private Double amount; // 总金额
    private String createTime; // 创建人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStandardItemIdentification() {
        return standardItemIdentification;
    }

    public void setStandardItemIdentification(String standardItemIdentification) {
        this.standardItemIdentification = standardItemIdentification;
    }

    public String getSellersItemIdentification() {
        return sellersItemIdentification;
    }

    public void setSellersItemIdentification(String sellersItemIdentification) {
        this.sellersItemIdentification = sellersItemIdentification;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getPriceWithTax() {
        return priceWithTax;
    }

    public void setPriceWithTax(Double priceWithTax) {
        this.priceWithTax = priceWithTax;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
