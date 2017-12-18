package com.xjtushilei.MyBatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getall")
    public List<User> getall(@RequestParam(value = "page", defaultValue = "5") int page,
                             @RequestParam(value = "pagesize", defaultValue = "1") int pagesize) {
        PageHelper.startPage(page, pagesize);
        PageInfo<User> p = new PageInfo<>(userService.getall());
        System.out.println(p.getTotal());
        return p.getList();

    }

    @RequestMapping("/getById")
    public User getById(Integer id) {
        return userService.getById(id);
    }

    @RequestMapping("/getNameById")
    public String getNameById(Integer id) {
        return userService.getNameById(id);
    }

}
