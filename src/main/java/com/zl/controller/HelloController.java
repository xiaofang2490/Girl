package com.zl.controller;

import com.zl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ef on 2018/6/11.
 */
@RestController
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;


//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public  String say(){
        return girlProperties.getName();
    }

}
