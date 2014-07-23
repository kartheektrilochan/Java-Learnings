package com.hcl.poc.controller;

import java.util.List;

import com.hcl.poc.service.StubtabService;
import com.poc.dao.entity.Stubtab;

public class StubtabController {
	
	private StubtabService stubtabservice;
	
	public StubtabController(){
		super();
		stubtabservice=new StubtabService();
	}
	
	public void getFullDetails()
	{
		List<Stubtab> stublist=stubtabservice.findAll();
		System.out.println(stublist.size());
	}
	public static void main(String[] args) {
		StubtabController controller=new StubtabController();
		controller.getFullDetails();
	}

}
