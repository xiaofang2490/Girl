package com.zl.handle;

import com.zl.domain.Result;
import com.zl.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ef on 2018/6/12.
 */
@ControllerAdvice
public class ExceptionHandle {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e){
        return ResultUtil.error(100,e.getMessage());
    }
}
