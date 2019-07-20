package dto;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chichenglong
 * @date 2019/6/21 12:35
 */
public class UserAccountDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键id")
    private String id;
    @ApiModelProperty(
            value = "创建时间",
            example = "2018-08-18 18:18:18"
    )
    @JSONField(
            format = "yyyy-MM-dd HH:mm:ss"
    )
    private Date createTime;
    @ApiModelProperty(
            value = "修改时间",
            example = "2018-08-18 18:18:18"
    )
    @JSONField(
            format = "yyyy-MM-dd HH:mm:ss"
    )
    private Date updateTime;

    @ApiModelProperty(value="账户ID")
    private String accountId;

    @ApiModelProperty(value="帐号类型：1手机号；2邮箱；3自定义用户名；4第三方token")
    private Byte loginType;

    @ApiModelProperty(value="登录名称")
    private String loginName;

    @ApiModelProperty(value="登录密码")
    private String password;

    @ApiModelProperty(value="账户状态;0不可用;1可用")
    private Byte statusCode;

    @ApiModelProperty(value="账户来源;1注册;2管理添加;3导入")
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Byte getLoginType() {
        return loginType;
    }

    public void setLoginType(Byte loginType) {
        this.loginType = loginType;
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
}
