package com.example.demo.repository;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor // UserController클래스가 MemberService클래스의 자원을 사용하는 권한 생김(?)
public class UserController {
    //생성자 주입
    private  final  UserService userService;


    @GetMapping("/user/save") //이 주소 요청받으면
    public String saveForm(){
        return "save";          //이 파일 열음
    }
    @PostMapping("/user/save")
    public String save(User user){
        System.out.println("UserController.save");
        userService.save(user);
        return "index";
    }
}
