package com.yt.ziroom.controller;

import com.yt.ziroom.domain.Keys;
import com.yt.ziroom.service.RoomService;
import com.yt.ziroom.utils.JsonResult;
import com.yt.ziroom.utils.ParseArr;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "列表")
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @ApiOperation("获取所有")
    @GetMapping("/getAll")
    public JsonResult getAll(){
        JsonResult jsonResult=new JsonResult();
        jsonResult.setCode(1);
        jsonResult.setInfo(roomService.getAll());
        return jsonResult;
    }
    @ApiOperation("根据id获取")
    @GetMapping("/{id}")
    public JsonResult getById(@PathVariable Integer id){
        JsonResult jsonResult=new JsonResult();
        jsonResult.setCode(1);
        jsonResult.setInfo(roomService.getById(id));
        return jsonResult;
    }
    @ApiOperation("搜索款条件查询")
    @GetMapping("/select/{key}")
    public JsonResult getByKey(@PathVariable String key){

        JsonResult jsonResult=new JsonResult();
        jsonResult.setCode(1);
        jsonResult.setInfo(roomService.getByKey(key));
        return jsonResult;
    }
    @ApiOperation("获取图片")
    @GetMapping("/getImgs/{id}")
    public JsonResult getImgsById(@PathVariable Integer id){

        JsonResult jsonResult=new JsonResult();
        jsonResult.setCode(1);
        jsonResult.setInfo(roomService.getImgsById(id));
        return jsonResult;
    }
    @ApiOperation("获取中介信息")
    @GetMapping("/getOrder/{id}")
    public JsonResult getOrder(@PathVariable Integer id){

        JsonResult jsonResult=new JsonResult();
        jsonResult.setCode(1);
        jsonResult.setInfo(roomService.getOrder(id));
        return jsonResult;
    }
    @GetMapping ("/select")
    public JsonResult getByKeyList(@RequestParam String keys){
        List<Integer> keylist=new ParseArr().parselist(keys);
        System.out.println(keylist);

        return null;
    }

}
