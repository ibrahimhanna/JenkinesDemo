package com.example.JenkinesDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class Hello   
{  
 
@GetMapping(value = "/hello")  
public String hello()   
{  
    System.out.print("hello world");
      return "hello welcome to java";
}  
}  