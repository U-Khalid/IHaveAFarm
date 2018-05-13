package com.farm.util;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;



/**
 * @author:LinHaiZhen
 * @date:2016年11月25日 下午2:55:31
 * @Description:工具类，提供静态的工具函数
 */
public class Utils {
	
	/**
	 * 函数名称：CreateRanNumber
	 * 功能描述：生成随机数
	 * 参数说明：
	 * 返回值：String
	 * 备注：
	 * 
	 * 作者：ariclee		时间：2016年7月5日下午2:28:16
	 */
	public static String CreateRanNumber(int length) {
		String SecurityNumber = "";
		for (int i = 0; i < length; i++) {
			java.util.Random random = new java.util.Random();	// 定义随机类
			int result = random.nextInt(10);		// 返回[0,10)集合中的整数，注意不包括10
			SecurityNumber = SecurityNumber + Integer.toString(result);
		}
		return SecurityNumber;
	}
	
	public static String getId() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		return df.format(new Date(System.currentTimeMillis())) + UUID.randomUUID();// new Date()为获取当前系统时间
	}
	
	/**
	 * @author:LinHaiZhen
	 * @date:2016年11月25日 下午2:46:52
	 * @Description:获取当前时间(yyyy-MM-dd HH:mm:ss)
	 */
	public static String getNowTime() {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(new Date(System.currentTimeMillis()));// new Date()为获取当前系统时间
	}
	
	/**
	 * @author:LinHaiZhen
	 * @date:2016年11月25日 下午2:46:52
	 * @Description:获取当前时间（yyyy-MM-dd）
	 */
	public static String getNowTimeDate() {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		return df.format(new Date(System.currentTimeMillis()));// new Date()为获取当前系统时间
	}
	
	/**
	 * @author:LinHaiZhen
	 * @date:2016年11月25日 下午2:46:35
	 * @Description:获取唯一令牌
	 */
	public static String getTokens(){
		
		return UUID.randomUUID().toString();
		
	}
	
	/**
	 * @author:LinHaiZhen
	 * @date:2016年12月2日 下午1:11:52
	 * @Description:拿到day天前的日期
	 */
	public static String getBeforeTime(int day){
		String paramStartDate = "";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date dateNow = new Date();
		Date dateBefore = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(dateNow);
		cal.add(Calendar.DAY_OF_MONTH, -day);
		dateBefore = cal.getTime();
		paramStartDate = sdf.format(dateBefore);
		
		return paramStartDate;
	}
	
	/**
	 * @author:LinHaiZhen
	 * @date:2016年12月2日 下午1:11:52
	 * @Description:拿到day天后的日期
	 */
	public static String getAfterTime(int day){
		String paramStartDate = "";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date dateNow = new Date();
		Date dateAfter = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(dateNow);
		cal.add(Calendar.DAY_OF_MONTH, day);
		dateAfter = cal.getTime();
		paramStartDate = sdf.format(dateAfter);
		
		return paramStartDate;
	}
	
	
	
	
	 /**
     * 获取当前日期是星期几
     * 
     * @param dt
     * @return 当前日期是星期几
     */
    public static String getWeekOfDate(String date) {
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        try {
			cal.setTime(sdf.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
    
    /**
     * @author:LinHaiZhen
     * @throws ParseException 
     * @date:2016年12月2日 下午7:52:28
     * @Description:计算date到现在的时间差(天)
     */
    public static long getTimeDiff(String time) throws ParseException{
    	
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
    	java.util.Date now = df.parse(getNowTimeDate());   
    	java.util.Date date=df.parse(time);   
    	long l=now.getTime()-date.getTime();   
    	long day=l/(24*60*60*1000);   
    	
    	return day;
    }
    
    /**
     * @author:LinHaiZhen
     * @date:2016年12月5日 下午6:13:54
     * @Description:计算在str字符串中ch字符的个数
     */
    public static int countStringNum(String str,String ch){
    			
    	return str.length() - str.replaceAll(ch,"").length();
    }
    
    public static boolean writeFile(InputStream in,String filename) {
    	boolean result = false;
		try {
			int len = 0;
			byte buffer[] = new byte[1024];
//			File f = new File(filename);
//			if(!f.exists())
//			{
//				f.mkdirs();
//			}
			FileOutputStream out = new FileOutputStream(filename); // 向upload目录中写入文件
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			in.close();
			out.close();
			result = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
    }
    
    /**
     * 
     * 函数名称：getTimeAfterByTime
     * 功能描述：根据传入时间，月数计算时间
     * 参数说明：时间 ，月数
     * 返回值：String
     * 备注：
     * 
     * 作者：joker		时间：2016年12月23日下午7:52:55
     * @throws ParseException 
     */
    public static String getTimeAfterByTime(String time,int num) throws ParseException {
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
    	Date date = df.parse(time);
    	Date dateAfter = new Date();
    	Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, num);
		dateAfter = cal.getTime();
		return df.format(dateAfter);
    }
    
    /**
     * 
     * 函数名称：removeFront
     * 功能描述：String 去除前面字符
     * 参数说明：
     * 返回值：String
     * 备注：
     * 
     * 作者：joker		时间：2017年1月4日下午2:31:03
     */
    public static String removeFront(String total,String key) {
    	int a = total.indexOf(key);
    	return total.substring(a);
    }
    
    /**
     * @author:LinHaiZhen
     * @date:2017年1月6日 下午7:24:23
     * @Description:获取smartUpload文件上传的文件类型（jpg/png...）
     */
    /*public static String getSmartUploadFileType(SmartFile file){
    	String data[] = file.getFileName().split("\\.");  
    	return data[1];
    }*/
    
    
    /**
     * @author:LinHaiZhen
     * @date:2017年1月6日 下午8:07:35
     * @Description:获取文件名称
     * @param:name--文件名   type--文件类型（jpg/png..）
     */
    public static String getFileName(String name,String type){
		//为防止文件覆盖的现象发生，要为上传文件产生一个唯一的文件名
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy_MM_dd_HHmmss");
		String time = sdf2.format(new java.util.Date());
    	return time+"_"+name+"."+type;
    }
    
    /**
     * 
     * 函数名称：toMapFlag
     * 功能描述：
     * 参数说明：
     * 返回值：Map<String,Object>
     * 备注：
     * 
     * 作者：joker		时间：2017年5月17日下午8:41:00
     */
    public static Map<String,Object> toMapFlag(int flag) {
    	Map<String,Object> map = new HashMap<>();
    	map.put("flag", flag);
    	map.put("msg", flag!=0?"操作成功！":"操作失败！");
    	return map;
    }
    
    
    public static Map<String,Object> toMapPage(Page page) {
    	Map<String,Object> map =  new HashMap<>();
		map.put("page", page);
    	return map;
    }
    
    public static Map<String,Object> toMapPageAndObject(Page page,Object obj) {
    	Map<String,Object> map =  new HashMap<>();
		map.put("page", page);
		map.put("obj", obj);
    	return map;
    }
    
    public static Map<String,Object> toMapPageAndObjectAndType(Page page,Object obj,int type) {
    	Map<String,Object> map =  new HashMap<>();
		map.put("page", page);
		map.put("obj", obj);
		map.put("type", type);
    	return map;
    }
    public static Map<String,Object> toMapArrayAndString(String user_account,Object obj) {
    	Map<String,Object> map =  new HashMap<>();
		map.put("user_account", user_account);
		map.put("items", obj);
    	return map;
    }
    public static Map<String,Object> toMapArrayAnddoubleString(int user_id,String place_name,Object obj) {
    	Map<String,Object> map =  new HashMap<>();
		map.put("user_id", user_id);
		map.put("place_name", place_name);
		map.put("items", obj);
    	return map;
    }
    
    
    /**
	 * @function：compareDate
	 * @Description：比较两个时间大小，true表示data1大，false表示data2大；
	 * @author：lgy
	 * @time：2017年3月10日下午6:30:05
	 */
	public static boolean compareDate(String date1, String data2) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		boolean flag = false;
		try {
			flag = df.parse(date1).getTime() >= df.parse(data2).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 通过url获取访问结果字符串
	 * @param url
	 * @return
	 */
	 public static String SendGET(String url){
	        String result="";//访问返回结果
	        BufferedReader read=null;//读取访问结果
	         
	        try {
	         //创建url
	         URL realurl=new URL(url);
	         //打开连接
	         URLConnection connection=realurl.openConnection();
	          
	                  //建立连接
	                  connection.connect();
	            
	                  // 定义 BufferedReader输入流来读取URL的响应
	                  read = new BufferedReader(new InputStreamReader(
	                          connection.getInputStream(),"UTF-8"));
	                  String line;//循环读取
	                  while ((line = read.readLine()) != null) {
	                      result += line;
	                  }
	        } catch (IOException e) {
	         e.printStackTrace();
	        }finally{
	         if(read!=null){//关闭流
	          try {
	           read.close();
	          } catch (IOException e) {
	           e.printStackTrace();
	          }
	         }
	        }
	          
	        return result; 
	      }
	/**
	 * 根据请求获取ip地址
	 * @param request
	 * @return
	 */
	 public static  String getIpAddr(HttpServletRequest request) {
	        String ip = request.getHeader("x-forwarded-for");
	        System.out.println("x-forwarded-for ip: " + ip);
	        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
	            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
	            if (ip.indexOf(",") != -1) {
	                ip = ip.split(",")[0];
	            }
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("Proxy-Client-IP");
	            System.out.println("Proxy-Client-IP ip: " + ip);
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("WL-Proxy-Client-IP");
	            System.out.println("WL-Proxy-Client-IP ip: " + ip);
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("HTTP_CLIENT_IP");
	            System.out.println("HTTP_CLIENT_IP ip: " + ip);
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
	            System.out.println("HTTP_X_FORWARDED_FOR ip: " + ip);
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("X-Real-IP");
	            System.out.println("X-Real-IP ip: " + ip);
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getRemoteAddr();
	            System.out.println("getRemoteAddr ip: " + ip);
	        }
	        System.out.println("获取客户端ip: " + ip);
	        return ip;
	    }
}
