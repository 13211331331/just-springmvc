package cn.iszt.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nedee
 * @Project: just-springmvc
 * @Package cn.iszt.springmvc.demo.controller
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/20 10:24
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
@Controller
public class TestController {

    @RequestMapping("test")
    public String ss(){
        return "test";
    }


    @RequestMapping("index")
    public String aa(){
        return "aa";
    }
}
