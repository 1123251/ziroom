package com.yt.ziroom.controller;

import com.yt.ziroom.service.AttributeService;
import com.yt.ziroom.utils.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attr")
@Api(tags = "租房页面")
@CrossOrigin
public class AttributeController {

    @Autowired
    AttributeService attributeService;

    @GetMapping("/show")
    @ResponseBody
    @ApiOperation("初始化列表")
    public JsonResult show(){

        return attributeService.show();
    }
}
