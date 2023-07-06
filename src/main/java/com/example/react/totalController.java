package com.example.react;
import java.util.Date;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
public class totalController {
     @RequestMapping(value="/getNow", method=RequestMethod.GET)
   public String getNow(){
       return "현재 시간은" + new Date() + "입니다.";
   }
}
