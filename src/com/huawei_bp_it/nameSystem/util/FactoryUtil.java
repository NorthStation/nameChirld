package com.huawei_bp_it.nameSystem.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.huawei_bp_it.nameSystem.exception.DAOException;


/**
 * ����������
 * 
 * @author ��ͷ�
 * @date 2013��11��17��14:40:37
 *
 */
public class FactoryUtil {
	//��̬�����ڼ��ش���ʵ�����Ȩ�޶����������ļ�
		private static Properties pro=new Properties(); 
		
		/*
		 * ��̬��
		 */
		static{
			InputStream is = null ;
			try {
				//���������ļ�
				is=FactoryUtil.class.getResourceAsStream("./factory.properties");
				pro.load(is);
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (IOException e) {				
				e.printStackTrace();
			} finally{
				try {
					 //�ر���
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/*
		 * �ṩ��̬�ķ����Թ����ֱ�ӵ��� 
		 * 
		 * @param className
		 * @return
		 */
		public static Object getClassInstance(String className) throws DAOException{
			//��������ļ��е�ȫ�޶���
			String fullName=pro.getProperty(className);
			Object obj = null ;
			try {
				//ͨ�������ö���
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
			//���ض���
			return obj;
		}
}
