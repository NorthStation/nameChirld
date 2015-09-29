package com.huawei_bp_it.salaryCalculate.vo;

/**
 * TODO 工资待遇
 * 
 * @author Administrator
 * 
 */
public class SalaryVO {

	private Long salaryId;

	// 总收入
	private Double income;

	// 税前工资
	private Double salaryBeforTax;
	// 税后工资
	private Double salaryAfterTax;
	// 应纳税额
	private Double tax;
	// 五险一金
	private Double fiveInsurance;

	// 其它福利
	private Double walfare;

	// 所属月份
	private int month;

	public Long getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(Long salaryId) {
		this.salaryId = salaryId;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Double getSalaryBeforTax() {
		return salaryBeforTax;
	}

	public void setSalaryBeforTax(Double salaryBeforTax) {
		this.salaryBeforTax = salaryBeforTax;
	}

	public Double getSalaryAfterTax() {
		return salaryAfterTax;
	}

	public void setSalaryAfterTax(Double salaryAfterTax) {
		this.salaryAfterTax = salaryAfterTax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getFiveInsurance() {
		return fiveInsurance;
	}

	public void setFiveInsurance(Double fiveInsurance) {
		this.fiveInsurance = fiveInsurance;
	}

	public Double getWalfare() {
		return walfare;
	}

	public void setWalfare(Double walfare) {
		this.walfare = walfare;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
