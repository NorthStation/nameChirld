package com.huawei_bp_it.salaryCalculate.vo;

/**
 * TODO ���ʴ���
 * 
 * @author Administrator
 * 
 */
public class SalaryVO {

	private Long salaryId;

	// ������
	private Double income;

	// ˰ǰ����
	private Double salaryBeforTax;
	// ˰����
	private Double salaryAfterTax;
	// Ӧ��˰��
	private Double tax;
	// ����һ��
	private Double fiveInsurance;

	// ��������
	private Double walfare;

	// �����·�
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
