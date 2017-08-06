package com.test.dto;

import java.util.Date;

/**
 * 项目名称：${MODULE_NAME}
 * 包名：com.test.dto
 * 类名称：QueryItemVo.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 21:25
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 21:25
 * 修改备注：
 */
public class QueryItemVo {
    private String type; // 只支持A，B，C三个值
    private String itemName; // 随意

    private String periodFrom;
    private String periodTo;

    private String priceWithTaxFrom;
    private String priceWithTaxTo;

    private Integer limit;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(String periodFrom) {
        this.periodFrom = periodFrom;
    }

    public String getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(String periodTo) {
        this.periodTo = periodTo;
    }

    public String getPriceWithTaxFrom() {
        return priceWithTaxFrom;
    }

    public void setPriceWithTaxFrom(String priceWithTaxFrom) {
        this.priceWithTaxFrom = priceWithTaxFrom;
    }

    public String getPriceWithTaxTo() {
        return priceWithTaxTo;
    }

    public void setPriceWithTaxTo(String priceWithTaxTo) {
        this.priceWithTaxTo = priceWithTaxTo;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
