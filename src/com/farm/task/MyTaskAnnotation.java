package com.farm.task;
/*package winder.patrol.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

*//** 
 * 基于注解的定时器 
 * @author hj 
 *//*  
@Component
public class MyTaskAnnotation {
	
	 *//** 
     * cron表达式：* * * * * *（共6位，使用空格隔开，具体如下） 
     * cron表达式：*(秒0-59) *(分钟0-59) *(小时0-23) *(日期1-31) *(月份1-12或是JAN-DEC) *(星期1-7或是SUN-SAT) 
     *//*  
	*//**  
     * 定时计算。每天凌晨 01:00 执行一次  
     *//*    
    @Scheduled(cron = "0 0 10 * * *")   
    public void show(){  
        System.out.println("Annotation：is show run");  
    }  
      
    *//**  
     * 心跳更新。启动时执行一次，之后每隔2秒执行一次  
     *//*    
    @Scheduled(fixedRate = 1000*2)   
    public void print(){  
        System.out.println("Annotation：print run");  
    }  
}
*/