package com.rwj.controller;

import com.rwj.api.RemoteUserAccountService;
import com.rwj.deyujincheng.common.model.ResponseDataModel;
import dto.UserAccountDTO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chichenglong
 * @date 2019/6/20 16:28
 */
@RestController
@RequestMapping("/ccl")
@Api(value = "ccl", tags={"测试-测试"})
public class TestController {

    @Resource
    private RemoteUserAccountService remoteUserAccountService;

    @ApiOperation(value = "测试", notes = "暂无")
    @RequestMapping(value = "/getUserById", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ApiResponses({
            @ApiResponse(code = 2000000, message = "操作成功"),
            @ApiResponse(code = 1111111, message = "系统异常"),
            @ApiResponse(code = 2222222, message = "必填项为空，请检查"),
            @ApiResponse(code = 3333333, message = "数据格式有误，请检查"),
            @ApiResponse(code = 4444444, message = "系统繁忙，请重试"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户表ID主键", required = true, dataType = "String", paramType = "query")})
    public ResponseDataModel getUserById(String id){

        ResponseDataModel result = ResponseDataModel.success();
        UserAccountDTO dto = remoteUserAccountService.getById(id);
        result.setData(dto);
        return result;
    }

    @ApiOperation(value = "提交测试", notes = "暂无")
    @RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ApiResponses({
            @ApiResponse(code = 2000000, message = "操作成功"),
            @ApiResponse(code = 1111111, message = "系统异常"),
            @ApiResponse(code = 2222222, message = "必填项为空，请检查"),
            @ApiResponse(code = 3333333, message = "数据格式有误，请检查"),
            @ApiResponse(code = 4444444, message = "系统繁忙，请重试"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户表ID主键", required = true, dataType = "String", paramType = "query")})
    public ResponseDataModel getUser(String id){
        ResponseDataModel result = ResponseDataModel.success();
        UserAccountDTO dto = remoteUserAccountService.getById(id);
        result.setData(dto);
        return result;
    }
}
