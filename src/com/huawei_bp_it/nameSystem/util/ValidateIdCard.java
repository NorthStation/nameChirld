package com.huawei_bp_it.nameSystem.util;

import java.util.Scanner;

/**
 * TODO У�����֤��Ϣ
 * 
 * @author Administrator
 * @since 2015��1��6��23:05:46
 * 
 */
public class ValidateIdCard {

	//����Ϊ����ʮ��λ�Ͷ�Ӧ��
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
	 * TODO �������֤�Ƿ���ȷ
	 * 
	 * ��һ����
	 * 	�����֤����ĵ�1λ������7��ˣ�
	 * 	�����֤����ĵ�2λ������9��ˣ�
	 * 	�����֤����ĵ�3λ������10��ˣ�
	 * 	�����֤����ĵ�4λ������5��ˣ�
	 * 	�����֤����ĵ�5λ������8��ˣ�
	 * 	�����֤����ĵ�6λ������4��ˣ�
	 * 	�����֤����ĵ�7λ������2��ˣ�
	 * 	�����֤����ĵ�8λ������1��ˣ�
	 * 	�����֤����ĵ�9λ������6��ˣ�
	 * 	�����֤����ĵ�10λ������3��ˣ�
	 * 	�����֤����ĵ�11λ������7��ˣ�
	 * 	�����֤����ĵ�12λ������9��ˣ�
	 * 	�����֤����ĵ�13λ������10��ˣ�
	 * 	�����֤����ĵ�14λ������5��ˣ�
	 * 	�����֤����ĵ�15λ������8��ˣ�
	 * 	�����֤����ĵ�16λ������4��ˣ�
	 * 	�����֤����ĵ�17λ������2��ˡ�
	 * 
	 * �ڶ���������һ�����֤����1~17λ��˵Ľ����ͣ�ȫ����������
	 * 
	 * ���������õڶ�����������Ľ������11��
	 * �����ͻ��������Ϊ0������Ϊ1������Ϊ2��
	 * ����Ϊ3������Ϊ4������Ϊ5������Ϊ6������Ϊ7��
	 * ����Ϊ8������Ϊ9������Ϊ10��11�ֿ����ԡ�
	 * 
	 * ���Ĳ���
	 * �������Ϊ0���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ1��
	 * �������Ϊ1���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ0��
	 * �������Ϊ2���Ƕ�Ӧ�����һλ���֤�ĺ���ΪX��
	 * �������Ϊ3���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ9��
	 * �������Ϊ4���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ8��
	 * �������Ϊ5���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ7��
	 * �������Ϊ6���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ6��
	 * �������Ϊ7���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ5��
	 * �������Ϊ8���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ4��
	 * �������Ϊ9���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ3��
	 * �������Ϊ10���Ƕ�Ӧ�����һλ���֤�ĺ���Ϊ2��
	 * 
	 * @param idCard ���֤��
	 * @param charCount  ���֤����
	 * @return
	 */
	public static boolean validateIdCard(String idCard,int charCount) {
		boolean isValid = false;
		if(null != idCard){
			//�洢���֤ÿһλ�ַ���Ϣ
			Character[] ch = new Character[18];
			//���ڴ洢���֤��ÿһλ��
			int[] idCardIndex = new int[17];
			//���ڴ洢����֮��
			int sum = 0;
			//����
			int remainder;
			//����֤���һλ�ַ�
			String endChar ;
			if(charCount == 18 && 18 == idCard.length()){
				
				//��ǰ17λ�洢����
				for(int i = 0; i < idCard.length(); i++){
					ch[i] = idCard.charAt(i);
					if(i != idCard.length()-1 && Character.isDigit(ch[i])){
						idCardIndex[i] = Integer.parseInt(ch[i].toString());
					}
				}
				endChar = ch[17].toString();
				
				//ִ�м������
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
				//�õ����
				for (int i : idCardIndex) {
					sum += i;
				}
				//�õ�����
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
	 * TODO ����
	 */
	public static void main(String[] args) {
		System.out.println("���������֤��");
		Scanner scanner = new Scanner(System.in);
		String idCard = scanner.nextLine();
		if(validateIdCard(idCard, 18)){
			System.out.println("��Ч���֤��");
		}else {
			System.err.println("��Ч֤��");
		}
	}
}
