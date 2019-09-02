package com.rwj.controller;

import com.rwj.api.RemotePostContentService;
import com.rwj.deyujincheng.common.model.ResponseDataModel;
import com.rwj.dto.PostContentDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/ccl")
@Api(value = "ccl", tags={"动态内容"})
public class PostController {

    @Resource
    private RemotePostContentService remotePostContentService;

    @ApiOperation(value = "按ID查询动态内容", notes = "暂无")
    @RequestMapping(value = "/getById", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ApiResponses({
            @ApiResponse(code = 2000000, message = "操作成功"),
            @ApiResponse(code = 1111111, message = "系统异常"),
            @ApiResponse(code = 2222222, message = "必填项为空，请检查"),
            @ApiResponse(code = 3333333, message = "数据格式有误，请检查"),
            @ApiResponse(code = 4444444, message = "系统繁忙，请重试"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "动态内容ID主键", required = true, dataType = "int", paramType = "query")})
    public ResponseDataModel getById(int id) {
        ResponseDataModel result = ResponseDataModel.success();
        PostContentDTO dto = remotePostContentService.getById(id);
        result.setData(dto);
        return result;
    }



    @ApiOperation(value = "新增动态内容", notes = "暂无")
    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ApiResponses({
            @ApiResponse(code = 2000000, message = "操作成功",response = PostContentDTO.class),
            @ApiResponse(code = 1111111, message = "系统异常"),
            @ApiResponse(code = 2222222, message = "必填项为空，请检查"),
            @ApiResponse(code = 3333333, message = "数据格式有误，请检查"),
            @ApiResponse(code = 4444444, message = "系统繁忙，请重试"),
    })
    public ResponseDataModel insert(@RequestBody PostContentDTO dto) {
        ResponseDataModel result = ResponseDataModel.success();
        remotePostContentService.insert(dto);
        result.setData(dto);
        ConcurrentHashMap chm = new ConcurrentHashMap();
        chm.put("dsfds","fdafd");
        return result;
    }


}
