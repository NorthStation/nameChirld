package com.huawei_bp_it.salaryCalculate.action;

import java.util.List;

import com.huawei_bp_it.salaryCalculate.biz.impl.SalaryServiceImpl;
import com.huawei_bp_it.salaryCalculate.vo.SalaryVO;

/**
 * ¹¤×ÊAction 
 * @author Administrator
 *
 */
public class IncomeAction {
	
	public SalaryVO getSalaryVO(){
		SalaryVO income = null;
		SalaryServiceImpl salaryServiceImpl = new SalaryServiceImpl();
		//salaryServiceImpl.calcActureSalaryAfterReform(1, 1);
		return income;
	}
	
	public List<SalaryVO> getSalaryList(){
		List<SalaryVO> salaryList = null;
		return salaryList;
	}

}
