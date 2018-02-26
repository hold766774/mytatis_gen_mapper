package com.dudu.controller;

import com.dudu.core.dto.Result;
import com.dudu.core.utils.ResultUtils;
import com.dudu.domain.User;
import com.dudu.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size){

        PageHelper.startPage(page, size);
        List<User> userList = userService.findAll();
//用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(userList);
        return ResultUtils.success(pageInfo);
    }
}
