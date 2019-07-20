package com.rwj.deyujincheng.common.model;

import com.rwj.deyujincheng.common.StatusCodeApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;


/**
  * @ClassName: ResponseDataModel
  * @Description: 响应结果数据对象
  * @author 郝瑞龙
 */
@ApiModel(value = "ResponseDataModel", description = "响应结果数据对象")
public class ResponseDataModel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public ResponseDataModel() {}
	
	
	@ApiModelProperty(value = "接口返回状态码")  
	private String statusCode ; 
	
	@ApiModelProperty(value = "返回数据")  
	private Object data ;
	

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	} 
	
	public static ResponseDataModel success(){
		ResponseDataModel rdm = new ResponseDataModel();
		rdm.setStatusCode(StatusCodeApi.SUCESS.getCode());
		return rdm;
	}
	public static ResponseDataModel fail(){
		ResponseDataModel rdm = new ResponseDataModel();
		rdm.setStatusCode(StatusCodeApi.FAIL.getCode());
		return rdm;
	}
	
	private void basicError(){
		this.setStatusCode(StatusCodeApi.FAIL.getCode());
	}
	
	public void analyseException(Exception e){
		String message = e.getMessage();
		try {
			String apiStatusCode = message.substring(message.lastIndexOf(":")+1,message.length()).trim();
			/**为空直接返回默认错误**/
			if (StringUtils.isBlank(apiStatusCode)) {
				this.basicError();
			}
			/**判断是否自定义错误**/
			if(7 == apiStatusCode.length()){
				this.setStatusCode(apiStatusCode);
			}else{
				this.basicError();
			}
		} catch (Exception e2) {
			this.basicError();
		}
		
	}
}
