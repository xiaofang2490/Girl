package com.zl.controller;

import com.zl.domain.Girl;
import com.zl.domain.Result;
import com.zl.repository.GirlRepository;
import com.zl.service.GirlService;
import com.zl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ef on 2018/6/11.
 */
@RestController
public class GirlController {

    private  final  static Logger logger = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询女生列表
     * @return
     */
    @GetMapping(value = "girls")
    public  List<Girl> girlList(){
        logger.info("-------------girls-----------------");
        return  girlRepository.findAll();
    }

    /**
     * 新增一个女生
     * @return
     */
    @PostMapping(value = "girls")
    public Result<Girl> create(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setAge(girl.getAge());
        girl.setName(girl.getName());
        return ResultUtil.success(girlRepository.save(girl));
    }


    @GetMapping(value = "girls/getAge/{id}")
    public  void  getAge(@PathVariable("id") Integer id){

    }











//    @GetMapping(value = "findOne/{id}")
//    public Girl findOne(@PathVariable("id") Integer id){
//        return  girlRepository.findOne(id);
//    }

    @PutMapping(value = "girls/{id}")
    public Girl  girlUpdate(@PathVariable("id") Integer id,
                            @RequestParam("age") Integer age,
                            @RequestParam("name") String name){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setName(name);
       return girlRepository.save(girl);
    }

    //删除
//    @DeleteMapping(value = "girls/{id}")
//    public void girlDelete(@PathVariable("id") Integer id){
//        girlRepository.delete(id);
//    }

    @GetMapping(value = "/girls/age/{age}")
    public  List<Girl> age(@PathVariable("age") Integer age){
        return  girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public  void  girlTwo(){
        girlService.insertTwo();
    }

}
