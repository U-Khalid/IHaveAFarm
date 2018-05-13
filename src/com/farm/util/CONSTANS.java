package com.farm.util;

public class CONSTANS {
	// 登录错误
	public static final class LOGINERROR {
		public static final String _1 = "验证码错误！";
		public static final String _2 = "账户或密码错误！";
		public static final String _3 = "账户过期，请进行续费！";
		public static final String _4 = "账户已被锁定，请联系管理员进行解锁！";
		public static final String _5 = "";

	}
	//用户类型
	public static final class ROLETYPE {
		public static final int Admin = 1;//管理员
		public static final int CompanyAdmin= 2;//公司用户
		public static final int DeviceUser = 3;//设备用户

	}
	//用户状态
	public static final class USERSTATE {
		public static final int Lock = 1;//锁定
		public static final int Normal= 0;//正常

	}
	public static final class path {
		public static final String FRONT_SYSTEM = "Front/";
		public static final String MANAGE_SYSTEM = "Manage/";
	}
	public static final class CONTENT {
		
	}

	
	public static final class file_path {
		public static final String IMAGE_PATH = "C:\\Users\\Administrator\\Desktop\\IHaveAFarm\\Image\\";
	
	}
}
