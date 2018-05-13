package com.farm.task;
/*package winder.patrol.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Winder.Patrol.Po.XunLuoInfoVo;
import Winder.Patrol.Service.UserService;
import winder.patrol.dao.UniuserMapper;
import winder.patrol.dao.UserpatrolMapper;
import winder.patrol.po.Uniuser;
import winder.patrol.threadClass.Userpatrolthread;




public class MyTask {
	*//** 
	 * 基于xml的定时器 
	 * @author hj 
	 *//*  
	@Autowired
	private UserService userService; 
	
	@Autowired
	private UniuserMapper uniuserMapper;
	
	@Autowired
	private  UserpatrolMapper userpatrolMapper; 
	
	
	public static   List<XunLuoInfoVo>   xunLuoInfoVolist= null;
	
	public static   List<Uniuser> uniuserlist =null;
	    public void show() throws Exception{  
	    	
	    	Intimepushinfo();//闹铃
	        System.out.println("XMl:is show run");  
	    }  
	    
	    *//**
	     *  // 定时任务  向手机端推送 个人信息 以透传方式
	     *  1. 在springmvc 配置文件中添加定时任务   即开始调用print（） 函数
	     *     （1）执行 pushUserWeekDutyservice()函数 目的初始化全局变量xunLuoInfoVolist(封装了所有用户当前排班信息)
	     *     （2） 即启动一个线程   ： 每一秒 执行一个任务 即 透传推送一个用户信息 给手机端
	     * @throws Exception
	     *//*
	  
	   
	    public void print() throws Exception{  
	    	
	    	// xunLuoInfoVolist =  userService.pushUserWeekDutyservice();
	    	// System.out.println("xunLuoInfoVolist.size="+xunLuoInfoVolist.size());
	    	 //ClockThread clockThread = new ClockThread();  
	        // clockThread.start();  
	    	// userService.geTuiDuty(xunLuoInfoVolist);
	         //  System.out.println("end");  
	    
	    	userService.usercurpatrol();//  班次状态更新
	    	//userpatrolMapper.updateStaeidfortask("0");
	    	System.out.println("updateStaeidfortaskprint");
	        //System.out.println("XMl:print run");  
	    }
	    public void updateuserprotal(XunLuoInfoVo xunLuoInfoVo) throws Exception
	    {
	    	
	    	System.out.println("updateStaeidfortask");  
	    }
	    // 实时更新当天的班次状态
	public  void  startupateUserpatrolStatus() throws Exception{
		
		uniuserlist =uniuserMapper.getUniuserInfo();
		Userpatrolthread userpatrolthread =new  Userpatrolthread();
		userpatrolthread.start();
	}
	
	*//**
	 * @throws Exception 
	 * 
	 *//*
	public  void  Intimepushinfo() throws Exception{
		try{

			userService.InTimealarmPush();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
*/