package com.rwj.deyujincheng.common;
/**
 * 
  * @ClassName: StatusCodeApi
  * @Description: 错误码对照表
  * @author 郝瑞龙
  *
 */
public enum StatusCodeApi {
	SUCESS							 ("2000000","操作成功"),
	FAIL  							 ("1111111","系统异常"),
	EMPTY_ERROR 						 ("2222222","必填项为空,请检查"),
	FORMAT_ERROR						 ("3333333","数据格式有误,请检查"),
	MUCH_ERROR						 ("4444444","网络繁忙,当前用户较多,请重试"),
	NOT_FIND_ERROR					 ("5555555","不存在"),
	IS_EXIT_ERROR						 ("6666666","重复错误"),
	NOT_LOGIN_ERROR        ("7777777","帐号没有登录!"),
	ROLE_ERROR        ("888888","权限错误"),
	STATUS_ERROR        ("999999","状态错误"),
	
	 /**用户中心：用户相关错误状态码01开头*/
	USER_PASSWORD_ERROR  		     ("2060101","用户状态无效"),
	USER_STATUS_ERROR  		     ("2060102","用户状态无效"),
	USER_SEND_CODE_ERROR      		  ("2060103","发送验证码错误"),
	USER_CODE_ERROR  		     ("2060104","验证码无效"),
    USER_RELATION_NOT_FIND  		     ("2060105","用户没有关联信息"),
	USER_IS_CREATED                 ("2060106","该患者已经创建"),
	USER_PHONE_IS_EXIT                 ("2060107","用户手机号重复"),
    
	/**药厂相关错误状态码02开头*/
    COMPANY_NAME_IS_EXIT		("2060201","药厂名重复"),
    COMPANY_STATUS_ERROR		("2060202","药厂状态无效"),
    COMPANY_HAS_MEDICINE		("2060203","该药厂下有药品不可删除"),
    
    
    /**医院相关错误状态码03开头*/
	HOSPITAL_NAME_IS_EXIT		("2060301","医院名重复"),
	HOSPITAL_STATUS_ERROR		("2060302","医院状态无效"),
	HOSPITAL_HAS_DEPARTMENT		("2060303","该医院下有科室不可删除"),
	HOSPITAL_HAS_DOCTOR		("2060304","该医院下有关联医生"),
	
	/**医院科室错误状态码04开头*/
	DEPARTMENT_NAME_IS_EXIT		("2060401","科室名重复"),
	DEPARTMENT_STATUS_ERROR		("2060402","科室状态无效"),
	DEPARTMENT_HAS_DOCTOR		("2060403","该科室下有医生不可删除"),

	/**药品错误状态码05开头**/
	BASIC_MEDICINE_STOCK_ERROR    ("2060501","药品库存不足"),
	BASIC_MEDICINE_IN_GROUP      ("2060502","药品已经绑定分组"),
	
	
	/**药店错误状态码06开头**/
	BASIC_PHARMACY_NOT_FIND     ("2060601","药店不存在"),
	
	
	
	
	
	
	
	
	
    
	/**订单相关：用户相关错误状态码02开头*/
	ORDER_USER_NOT_FIND		("2060201","该用户不存在"),
	ORDER_NOT_FIND		("2060202","该订单不存在"),

	/**项目相关：项目相关错误状态码03开头*/
	ORDER_PROJECT_NOT_FIND		("2060301","该项目不存在"),
	ORDER_PROJECT_CHECK_NOT_FIND		("2060302","该项目筛选期不存在"),
	ORDER_PROJECT_INTO_NOT_FIND		("2060303","该项目入组期不存在"),
	ORDER_PROJECT_CURE_NOT_FIND		("2060304","该项目治疗期不存在"),
	ORDER_PROJECT_END_NOT_FIND		("2060305","该项目结束期不存在"),
	
	/**财务相关错误状态码04开头*/
	FINANCE_COMMISSION_SETING("2060401","已存在"),
	FINANCE_UN_RATE("2060402","未找到对应分润比例"),
	FINANCE_DEAL_CODE_EXIST("2060403","已存在"),
	FINANCE_UN_FROM("2060404","表单已提交"),
	FINANCE_UN_HOSPITAL("2060405","医院不存在"),
	FINANCE_UN_DEAL_TYPE("2060406","未知的交易类型"),
	FINANCE_UN_COMMISSION("2060407","数据不存在"),
	FINANCE_UN_ACCOUNT("2060408","用户信息不存在"),
	ACCOUNT_LACK("2060409","账户余额不足"),
	APPLY_NOEXIST("2060410","申请记录不存在"),
	COMMISSION_SETING_NOEXIST("2060411","修改项不存在")
	;

	
	private String code ;
	private String title;
	StatusCodeApi(String code, String title) {
        this.code = code;
        this.title = title;
    }
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public static String getNameByCode(String code){
		StatusCodeApi[] enums = StatusCodeApi.values();
		for(StatusCodeApi enu:enums){
			if(enu.getCode().equals(code)){
				return enu.getTitle();
			}
		}
		return "";
	}
}
