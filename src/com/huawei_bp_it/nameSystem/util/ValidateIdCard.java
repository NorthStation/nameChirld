package com.huawei_bp_it.nameSystem.util;

import java.util.Scanner;

/**
 * TODO 校验身份证信息
 * 
 * @author Administrator
 * @since 2015年1月6日23:05:46
 * 
 */
public class ValidateIdCard {

	//余数为？第十八位就对应数
	public static final String REMAINDER_0 = "1";
	public static final String REMAINDER_1 = "0";
	public static final String REMAINDER_2 = "X";
	public static final String REMAINDER_3 = "9";
	public static final String REMAINDER_4 = "8";
	public static final String REMAINDER_5 = "7";
	public static final String REMAINDER_6 = "6";
	public static final String REMAINDER_7 = "5";
	public static final String REMAINDER_8 = "4";
	public static final String REMAINDER_9 = "3";
	public static final String REMAINDER_10 = "2";
	
	/**
	 * TODO 计算身份证是否正确
	 * 
	 * 第一步：
	 * 	将身份证号码的第1位数字与7相乘；
	 * 	将身份证号码的第2位数字与9相乘；
	 * 	将身份证号码的第3位数字与10相乘；
	 * 	将身份证号码的第4位数字与5相乘；
	 * 	将身份证号码的第5位数字与8相乘；
	 * 	将身份证号码的第6位数字与4相乘；
	 * 	将身份证号码的第7位数字与2相乘；
	 * 	将身份证号码的第8位数字与1相乘；
	 * 	将身份证号码的第9位数字与6相乘；
	 * 	将身份证号码的第10位数字与3相乘；
	 * 	将身份证号码的第11位数字与7相乘；
	 * 	将身份证号码的第12位数字与9相乘；
	 * 	将身份证号码的第13位数字与10相乘；
	 * 	将身份证号码的第14位数字与5相乘；
	 * 	将身份证号码的第15位数字与8相乘；
	 * 	将身份证号码的第16位数字与4相乘；
	 * 	将身份证号码的第17位数字与2相乘。
	 * 
	 * 第二步：将第一步身份证号码1~17位相乘的结果求和，全部加起来。
	 * 
	 * 第三步：用第二步计算出来的结果除以11，
	 * 这样就会出现余数为0，余数为1，余数为2，
	 * 余数为3，余数为4，余数为5，余数为6，余数为7，
	 * 余数为8，余数为9，余数为10共11种可能性。
	 * 
	 * 第四步：
	 * 如果余数为0，那对应的最后一位身份证的号码为1；
	 * 如果余数为1，那对应的最后一位身份证的号码为0；
	 * 如果余数为2，那对应的最后一位身份证的号码为X；
	 * 如果余数为3，那对应的最后一位身份证的号码为9；
	 * 如果余数为4，那对应的最后一位身份证的号码为8；
	 * 如果余数为5，那对应的最后一位身份证的号码为7；
	 * 如果余数为6，那对应的最后一位身份证的号码为6；
	 * 如果余数为7，那对应的最后一位身份证的号码为5；
	 * 如果余数为8，那对应的最后一位身份证的号码为4；
	 * 如果余数为9，那对应的最后一位身份证的号码为3；
	 * 如果余数为10，那对应的最后一位身份证的号码为2。
	 * 
	 * @param idCard 身份证号
	 * @param charCount  身份证长度
	 * @return
	 */
	public static boolean validateIdCard(String idCard,int charCount) {
		boolean isValid = false;
		if(null != idCard){
			//存储身份证每一位字符信息
			Character[] ch = new Character[18];
			//用于存储身份证的每一位数
			int[] idCardIndex = new int[17];
			//用于存储计算之和
			int sum = 0;
			//余数
			int remainder;
			//身体证最后一位字符
			String endChar ;
			if(charCount == 18 && 18 == idCard.length()){
				
				//将前17位存储起来
				for(int i = 0; i < idCard.length(); i++){
					ch[i] = idCard.charAt(i);
					if(i != idCard.length()-1 && Character.isDigit(ch[i])){
						idCardIndex[i] = Integer.parseInt(ch[i].toString());
					}
				}
				endChar = ch[17].toString();
				
				//执行计算操作
				idCardIndex[0] = 7 * idCardIndex[0];
				idCardIndex[1] = 9 * idCardIndex[1];
				idCardIndex[2] = 10 * idCardIndex[2];
				idCardIndex[3] = 5 * idCardIndex[3];
				idCardIndex[4] = 8 * idCardIndex[4];
				idCardIndex[5] = 4 * idCardIndex[5];
				idCardIndex[6] = 2 * idCardIndex[6];
				idCardIndex[7] = 1 * idCardIndex[7];
				idCardIndex[8] = 6 * idCardIndex[8];
				idCardIndex[9] = 3 * idCardIndex[9];
				idCardIndex[10] = 7 * idCardIndex[10];
				idCardIndex[11] = 9 * idCardIndex[11];
				idCardIndex[12] = 10 * idCardIndex[12];
				idCardIndex[13] = 5 * idCardIndex[13];
				idCardIndex[14] = 8 * idCardIndex[14];
				idCardIndex[15] = 4 * idCardIndex[15];
				idCardIndex[16] = 2 * idCardIndex[16];
				//得到其和
				for (int i : idCardIndex) {
					sum += i;
				}
				//得到余数
				remainder = sum % 11;
				switch (remainder) {
					case 0:
						if(REMAINDER_0.equals(endChar)){
							isValid = true;
						}
						break;
					case 1:
						if(REMAINDER_1.equals(endChar)){
							isValid = true;
						}
						break;
					case 2:
						if(REMAINDER_2.equals(endChar)){
							isValid = true;
						}
						break;
					case 3:
						if(REMAINDER_3.equals(endChar)){
							isValid = true;
						}
						break;
					case 4:
						if(REMAINDER_4.equals(endChar)){
							isValid = true;
						}
						break;
					case 5:
						if(REMAINDER_5.equals(endChar)){
							isValid = true;
						}
						break;
					case 6:
						if(REMAINDER_6.equals(endChar)){
							isValid = true;
						}
						break;
					case 7:
						if(REMAINDER_7.equals(endChar)){
							isValid = true;
						}
						break;
					case 8:
						if(REMAINDER_8.equals(endChar)){
							isValid = true;
						}
						break;
					case 9:
						if(REMAINDER_9.equals(endChar)){
							isValid = true;
						}
						break;
					case 10:
						if(REMAINDER_10.equals(endChar)){
							isValid = true;
						}
						break;
	
					default:
						isValid = false;
						break;
				}
				
			}else if (charCount == 15) {
				
			}else {
				isValid = false;
			}
		}
		return isValid;
	}
	
	/**
	 * TODO 测试
	 */
	public static void main(String[] args) {
		System.out.println("请输入身份证：");
		Scanner scanner = new Scanner(System.in);
		String idCard = scanner.nextLine();
		if(validateIdCard(idCard, 18)){
			System.out.println("有效身份证。");
		}else {
			System.err.println("无效证号");
		}
	}
}
