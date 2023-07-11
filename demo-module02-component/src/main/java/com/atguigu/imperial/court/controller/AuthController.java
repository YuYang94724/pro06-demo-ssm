package com.atguigu.imperial.court.controller;

import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.service.EmpService;
import com.atguigu.imperial.court.util.ImperialCourtConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class AuthController {

    @Autowired
    private EmpService empService;
    @PostMapping("/auth/login")
    public String doLogin(
            @RequestParam("loginAccount") String loginAccount
            , @RequestParam("loginPassword") String loginPassword
            , HttpSession httpSession, Model model){

        Emp emp = empService.getEmpByLogin(loginAccount, loginPassword);

        if (emp == null) {

            model.addAttribute("message", ImperialCourtConst.LOGIN_FAILED_MESSAGE);

            return "index";

        }else {
            httpSession.setAttribute("loginInfo", emp);
            return "target";
        }
    }



}
