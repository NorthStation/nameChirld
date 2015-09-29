package com.huawei_bp_it.nameSystem.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.huawei_bp_it.nameSystem.exception.DAOException;


/**
 * 工厂工具类
 * 
 * @author 李锻锋
 * @date 2013年11月17日14:40:37
 *
 */
public class FactoryUtil {
	//静态块用于加载存有实现类的权限定名的配置文件
		private static Properties pro=new Properties(); 
		
		/*
		 * 静态块
		 */
		static{
			InputStream is = null ;
			try {
				//加载配置文件
				is=FactoryUtil.class.getResourceAsStream("./factory.properties");
				pro.load(is);
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (IOException e) {				
				e.printStackTrace();
			} finally{
				try {
					 //关闭流
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/*
		 * 提供静态的方法以供外界直接调用 
		 * 
		 * @param className
		 * @return
		 */
		public static Object getClassInstance(String className) throws DAOException{
			//获得配置文件中的全限定名
			String fullName=pro.getProperty(className);
			Object obj = null ;
			try {
				//通过反射获得对象
				obj = Class.forName(fullName).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
				throw new DAOException(e.getMessage());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				throw new DAOException(e.getMessage());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				throw new DAOException(e.getMessage());
			}
			//返回对象
			return obj;
		}
}
