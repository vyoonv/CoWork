package com.cowork.admin.addr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("admin/addr")
public class AdminAddrController {
	
	@GetMapping("")
	public String adminAddrMain() {
		return "admin/addr/addrMain";
	}

}