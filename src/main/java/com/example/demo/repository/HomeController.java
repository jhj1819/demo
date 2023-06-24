package com.example.demo.repository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //기본페이지 요청
    @GetMapping("/") //기본주소 요청이 오면 아래 메소드가 호출이 된다
    public String index(){
        return "index"; //index라는 html파일을 띄우겠다
        //template(리소스에 있음) 폴더의 index.html을 찾아감...
    }
}
