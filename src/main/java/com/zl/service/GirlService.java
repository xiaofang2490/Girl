package com.zl.service;

import com.zl.repository.GirlRepository;
import com.zl.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * Created by ef on 2018/6/11.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transient
    public  void  insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setName("一一");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(20);
        girlB.setName("二二");
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws  Exception{
//        Girl girl = girlRepository.findOne(id);

    }
}
