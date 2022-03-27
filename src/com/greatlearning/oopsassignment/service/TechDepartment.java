package com.greatlearning.oopsassignment.service;

public class TechDepartment extends SuperDepartment {

	protected String deptName = " Tech Department ";
	protected String todaysWork = "Complete coding of module 1";
	protected String deadline = "Complete by EOD ";
	protected String techStackInfo = "core Java";

	@Override
	public String departmentName() {
		return deptName;
	}

	@Override
	public String getTodaysWork() {
		return todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		return deadline;
	}

	public String getTechStackInformation() {
		return techStackInfo;
	}

}
