package com.rwj.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * @author chichenglong
 * @date 2019/6/18 20:50
 */
public class UserAccount {

    private String id;

    private Date createTime;

    private Date updateTime;
    /** 账户ID */
    private String accountId;

    private Byte loginType;

    /** 登录名称 */
    private String loginName;

    /** 登录密码 */
    private String password;

    /** 账户状态;0不可用;1可用 */
    private Byte statusCode;

    /** 账户来源;1注册;2管理添加;3导入 */
    private Byte sourcesCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Byte statusCode) {
        this.statusCode = statusCode;
    }

    public Byte getSourcesCode() {
        return sourcesCode;
    }

    public void setSourcesCode(Byte sourcesCode) {
        this.sourcesCode = sourcesCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getLoginType() {
        return loginType;
    }

    public void setLoginType(Byte loginType) {
        this.loginType = loginType;
    }


    @Override
    public String toString() {
        return "UserAccount{" +
                "id='" + id + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", accountId='" + accountId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", statusCode=" + statusCode +
                ", sourcesCode=" + sourcesCode +
                '}';
    }
}
