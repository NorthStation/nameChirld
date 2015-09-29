package com.huawei_bp_it.salaryCalculate.biz.impl;

import java.util.Scanner;

import com.huawei_bp_it.salaryCalculate.biz.ISalaryService;


/**
 * ���㹤�����˰��
 * 
 * @author Administrator
 * 
 */
public class SalaryServiceImpl implements ISalaryService {

	/**
	 * �ĸ�ǰ��ͨ�����ʼ��������ӦӦ���ɵ�˰
	 * 
	 * * ��ʽ:
	 * (�ܹ��ʣ�-������һ��-�������}X˰��-�ٿ���=��������˰�� ����
	 * 
	 * ���ܹ���5105ԪΪ��������һ��105Ϊ��
	 * {5105-105-3500}X0.03-0=45Ԫ ����
	 * 
	 * 2011��9��1����������7�������۽�˰�ʣ� ����
	 * ȫ��Ӧ��˰���ö� 					˰�� ����۳�����Ԫ��
	 * ȫ��Ӧ��˰�����1500Ԫ 			3% 		0 ����
	 * ȫ��Ӧ��˰���1500Ԫ��4500Ԫ 		10% 	105 ����
	 * ȫ��Ӧ��˰���4500Ԫ��9000Ԫ 		20% 	555 ����
	 * ȫ��Ӧ��˰���9000Ԫ��35000Ԫ 	25% 	1005 ����
	 * ȫ��Ӧ��˰���35000Ԫ��55000Ԫ 	30% 	2755
	 * ȫ��Ӧ��˰���55000Ԫ��80000Ԫ 	35% 	5505 ����
	 * ȫ��Ӧ��˰���80000Ԫ 			45% 	13505
	 * 
	 * @param salary ˰ǰ����
	 * @param insurance ����һ��
	 * @return Ӧ��˰��
	 */
	public Double calcTaxBeforeReform(Double salary, Double insurance){
		//Ӧ��˰��
		Double applyTax = 0.0;
		//˰�����������
		Double baseAT = 0.0;
		//�洢��ʱֵ
		Double tempAT = 0.0;
		Integer tempBase = 0;
		if(null != salary && salary > 0){
			baseAT = salary - insurance - 3500;
			if (baseAT > 80000){
				tempAT = (baseAT - 80000) * 0.45 - 13505;
				tempBase = 80000;
				applyTax += tempAT;
			}
			if (baseAT > 55000) {
				if(tempBase == 80000){
					tempAT = (tempBase - 55000) * 0.35; 
				}else {
					tempAT = (baseAT - 55000) * 0.35 - 5505;
				}
				tempBase = 55000;
				applyTax += tempAT;
			}
			if (baseAT > 35000) {
				if(tempBase == 55000){
					tempAT = (tempBase - 35000) * 0.30;
				}else {
					tempAT = (baseAT - 35000) * 0.30 - 2755;
				}
				tempBase = 35000;
				applyTax += tempAT;
				
			}
			if (baseAT > 9000) {
				if(tempBase == 35000){
					tempAT = (tempBase - 9000) * 0.25;
				}else {
					tempAT = (baseAT - 9000) * 0.25 - 1005;
				}
				tempBase = 9000;
				applyTax += tempAT;
				
			}
			if (baseAT > 4500) {
				if(tempBase == 9000){
					tempAT = (tempBase - 4500) * 0.20;
				}else {
					tempAT = (baseAT - 4500) * 0.20 - 555;
				}
				tempBase = 4500;
				applyTax += tempAT;
			}
			if (baseAT > 1500){
				if(tempBase == 4500){
					tempAT = (tempBase - 1500) * 0.10;
				}else {
					tempAT = (baseAT - 1500) * 0.10 - 105;
				}
				tempBase = 1500;
				applyTax += tempAT;
			}
			if(baseAT > 0){
				if(tempBase == 1500){
					tempAT = tempBase * 0.03;
				}else {
					tempAT = baseAT * 0.03;
				}
				tempBase = 0;
				applyTax += tempAT;
			}
			if(baseAT <= 0){
				applyTax += tempAT;
			}
		}
		System.out.println("�ĸ�ǰ˰ǰн��Ϊ��"+salary +"ʱӦ��˰���Ϊ��\t"+applyTax);
		return applyTax;
	}
	
	/**
	 * �ĸ�ǰ��ͨ���õ���˰ǰ���ʼ����˰�����ù���
	 * @param salary ˰ǰ����
	 * @param insurance ����һ��
	 * @return ˰����
	 */
	public Double calcActureSalaryBeforeReform(Double salary, Double insurance){
		Double AT = this.calcTaxBeforeReform(salary, insurance);
		Double afterATSalary = salary - AT;
		System.out.println("�ĸ�ǰ˰ǰн��Ϊ��"+salary +"ʱ��˰�����ǣ�\t"+(afterATSalary - insurance));
		return afterATSalary;
	}
	
	/**
	 * �ĸ��Ӧ��˰��
	 * @param salary
	 * @param insurance
	 * @return
	 */
	public Double calcTaxAfterReform(Double salary, Double insurance){
		Double applyTax = 0.0;
		Double baseAT;
		if(null != salary && salary >0){
			baseAT = salary - insurance -3500;
			if(baseAT <=0){
				applyTax = 0.0;
			}else if(baseAT < 1500){
				applyTax = baseAT * 0.03;
			}else if (baseAT < 4500) {
				applyTax = baseAT * 0.10 - 105;
			}else if (baseAT < 9000) {
				applyTax = baseAT * 0.20 - 555;
			}else if (baseAT < 35000) {
				applyTax = baseAT * 0.25 - 1005;
			}else if (baseAT < 55000) {
				applyTax = baseAT * 0.30 - 2755;
			}else if (baseAT < 80000) {
				applyTax = baseAT * 0.35 - 5505;
			}else {
				applyTax = baseAT * 0.45 - 13505;
			}
		}
		System.out.println("�ĸ��˰ǰн��Ϊ��"+salary +"ʱӦ��˰���Ϊ��\t"+applyTax);
		return applyTax;
	}
	
	/**
	 * �ĸ��˰����
	 * @param salary
	 * @param insurance
	 * @return
	 */
	public Double calcActureSalaryAfterReform(Double salary, Double insurance){
		Double AT = this.calcTaxAfterReform(salary, insurance);
		Double afterATSalary = salary - AT;
		System.out.println("�ĸ��˰ǰн��Ϊ��"+salary +"ʱ��˰�����ǣ�\t"+(afterATSalary - insurance));
		return afterATSalary;
	}
	
	public static void main(String[] args) {
		//��ͨ����һ��
		Double insurance = 379.7;
		Scanner scanner = new Scanner(System.in);
		SalaryServiceImpl salaryServiceImpl = new SalaryServiceImpl();
		Double salary;
		String choose;
		for (;;) {
			System.out.println("��ѡ��ĸ�ǰ���Ǹĸ�󣺡�1���ĸ�ǰ\t��2���ĸ��\t���������˳�ϵͳ");
			choose = scanner.nextLine();
			for(;;){
				if("1".equals(choose)){
					System.err.println("��¼������˰ǰ���ʣ�");
					salary = scanner.nextDouble();
					salaryServiceImpl.calcActureSalaryBeforeReform(salary, insurance);
				}else if ("2".equals(choose)) {
					System.err.println("��¼������˰ǰ���ʣ�");
					salary = scanner.nextDouble();
					salaryServiceImpl.calcActureSalaryAfterReform(salary, insurance);
				}else {
					break;
				}
			}
		}
	}
}
