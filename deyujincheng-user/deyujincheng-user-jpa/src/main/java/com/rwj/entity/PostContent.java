package com.rwj.entity;


import java.util.Date;

/**
 * @author chichenglong
 * @date 2019/6/18 20:50
 */
public class PostContent {

    private String id;

    private Date createTime;

    private Date updateTime;

    /** 账户ID */
    private String content;


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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
