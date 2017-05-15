package com.vsked.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vsked.service.CarrierSer;

@Controller
public class CarrierController {
	
	@Autowired
	CarrierSer carrierSer;
	
	@GetMapping("carrierListPage")
	public String carrierListPage(){
		return "carrierList";
	}
	
	@PostMapping("carrierListData")
	@ResponseBody
	public String carrierListData(HttpServletRequest req){
		return carrierSer.carrierList(req);
	}
}
