package com.Mesfer.com.Mesfer.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller takes path of req_path 
@RestController
public class AppConfiguration{

    //create req_path 
   @RequestMapping("/hello")

   public String hello(){
       return "Hello world";
   }
}