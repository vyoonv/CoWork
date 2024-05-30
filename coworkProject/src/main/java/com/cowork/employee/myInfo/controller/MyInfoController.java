package com.cowork.employee.myInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("myInfo")
public class MyInfoController {

	@GetMapping("myInfoUpdate")
	public String myInfoUpdate() {
		return "employee/myInfo/myInfoUpdate";
	}
	
	@GetMapping("pwUpdate")
	public String myInfoPwUpdate() {
		return "employee/myInfo/myInfoPwUpdate";
	}
	
}
