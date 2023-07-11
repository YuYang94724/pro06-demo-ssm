package com.atguigu.imperial.court.service.impl;

import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.entity.EmpExample;
import com.atguigu.imperial.court.mapper.EmpMapper;
import com.atguigu.imperial.court.service.EmpService;
import com.atguigu.imperial.court.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public Emp getEmpByLogin(String loginAccount, String loginPassword) {

        String encodePassword = MD5Util.encode(loginPassword);

        EmpExample empExample = new EmpExample();
        empExample.createCriteria()
                .andLoginAccountEqualTo(loginAccount)
                .andLoginPasswordEqualTo(encodePassword);
        List<Emp> empList = empMapper.selectByExample(empExample);

        if (empList != null && empList.size() > 0) {
            return empList.get(0);
        }

        return null;
    }
}
