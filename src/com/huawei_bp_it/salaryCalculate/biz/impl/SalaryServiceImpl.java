package com.huawei_bp_it.salaryCalculate.biz.impl;

import java.util.Scanner;

import com.huawei_bp_it.salaryCalculate.biz.ISalaryService;


/**
 * 计算工资相关税率
 * 
 * @author Administrator
 * 
 */
public class SalaryServiceImpl implements ISalaryService {

	/**
	 * 改革前：通过工资计算出所对应应缴纳的税
	 * 
	 * * 工式:
	 * (总工资）-（五险一金）-（免征额）}X税率-速扣数=个人所得税。 　　
	 * 
	 * 以总工资5105元为例，五险一金105为例
	 * {5105-105-3500}X0.03-0=45元 　　
	 * 
	 * 2011年9月1日起调整后的7级超额累进税率： 　　
	 * 全月应纳税所得额 					税率 速算扣除数（元）
	 * 全月应纳税额不超过1500元 			3% 		0 　　
	 * 全月应纳税额超过1500元至4500元 		10% 	105 　　
	 * 全月应纳税额超过4500元至9000元 		20% 	555 　　
	 * 全月应纳税额超过9000元至35000元 	25% 	1005 　　
	 * 全月应纳税额超过35000元至55000元 	30% 	2755
	 * 全月应纳税额超过55000元至80000元 	35% 	5505 　　
	 * 全月应纳税额超过80000元 			45% 	13505
	 * 
	 * @param salary 税前工资
	 * @param insurance 五险一金
	 * @return 应纳税额
	 */
	public Double calcTaxBeforeReform(Double salary, Double insurance){
		//应纳税额
		Double applyTax = 0.0;
		//税务基本起征点
		Double baseAT = 0.0;
		//存储临时值
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
		System.out.println("改革前税前薪资为："+salary +"时应缴税款额为：\t"+applyTax);
		return applyTax;
	}
	
	/**
	 * 改革前：通过得到的税前工资计算出税后所得工资
	 * @param salary 税前工资
	 * @param insurance 五险一金
	 * @return 税后工资
	 */
	public Double calcActureSalaryBeforeReform(Double salary, Double insurance){
		Double AT = this.calcTaxBeforeReform(salary, insurance);
		Double afterATSalary = salary - AT;
		System.out.println("改革前税前薪资为："+salary +"时的税后工资是：\t"+(afterATSalary - insurance));
		return afterATSalary;
	}
	
	/**
	 * 改革后：应纳税额
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
		System.out.println("改革后税前薪资为："+salary +"时应缴税款额为：\t"+applyTax);
		return applyTax;
	}
	
	/**
	 * 改革后：税后工资
	 * @param salary
	 * @param insurance
	 * @return
	 */
	public Double calcActureSalaryAfterReform(Double salary, Double insurance){
		Double AT = this.calcTaxAfterReform(salary, insurance);
		Double afterATSalary = salary - AT;
		System.out.println("改革后税前薪资为："+salary +"时的税后工资是：\t"+(afterATSalary - insurance));
		return afterATSalary;
	}
	
	public static void main(String[] args) {
		//软通五险一金
		Double insurance = 379.7;
		Scanner scanner = new Scanner(System.in);
		SalaryServiceImpl salaryServiceImpl = new SalaryServiceImpl();
		Double salary;
		String choose;
		for (;;) {
			System.out.println("请选择改革前还是改革后：【1】改革前\t【2】改革后\t【……】退出系统");
			choose = scanner.nextLine();
			for(;;){
				if("1".equals(choose)){
					System.err.println("请录入您的税前工资：");
					salary = scanner.nextDouble();
					salaryServiceImpl.calcActureSalaryBeforeReform(salary, insurance);
				}else if ("2".equals(choose)) {
					System.err.println("请录入您的税前工资：");
					salary = scanner.nextDouble();
					salaryServiceImpl.calcActureSalaryAfterReform(salary, insurance);
				}else {
					break;
				}
			}
		}
	}
}
