package com.yh.mybatisgeneter.model;

import java.math.BigDecimal;
import java.util.Date;

public class Closeorder {
    private Integer id;

    private Integer uid;

    private Integer roomId;

    private Integer quoteId;

    private Integer companyId;

    private BigDecimal createPrice;

    private Date createTime;

    private BigDecimal endPrice;

    private Date endTime;

    private Integer dir;

    private Date oCreateTime;

    private Date oUpdateTime;

    private Integer version;

    private Integer closenum;

    private BigDecimal gal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getCreatePrice() {
        return createPrice;
    }

    public void setCreatePrice(BigDecimal createPrice) {
        this.createPrice = createPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(BigDecimal endPrice) {
        this.endPrice = endPrice;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public Date getoCreateTime() {
        return oCreateTime;
    }

    public void setoCreateTime(Date oCreateTime) {
        this.oCreateTime = oCreateTime;
    }

    public Date getoUpdateTime() {
        return oUpdateTime;
    }

    public void setoUpdateTime(Date oUpdateTime) {
        this.oUpdateTime = oUpdateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getClosenum() {
        return closenum;
    }

    public void setClosenum(Integer closenum) {
        this.closenum = closenum;
    }

    public BigDecimal getGal() {
        return gal;
    }

    public void setGal(BigDecimal gal) {
        this.gal = gal;
    }
}