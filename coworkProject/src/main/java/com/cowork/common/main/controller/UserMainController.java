package com.cowork.common.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserMainController {
	@GetMapping("userMain")
	public String userMain() {
		return "common/main/userMain";
	}
	
	@GetMapping("adminMain")
	public String adminMain() {
		return "admin/left/adminLeftSideBar";
	}
	
}
