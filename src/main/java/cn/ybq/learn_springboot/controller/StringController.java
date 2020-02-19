package cn.ybq.learn_springboot.controller;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/string")
public class StringController {

    String name="aaa";
    String pwd="ccc";
    @PutMapping("/a")
    public String getName(){
        return name;
    }
    @PutMapping("/b")
    public String getPwd(){
        return pwd;
    }
}
