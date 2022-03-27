package com.greatlearning.oopsassignment.service;

public class HrDepartment extends SuperDepartment {

	protected String deptName = "Hr Department ";
	protected String todaysWork = "Fill today’s worksheet and mark your attendance";
	protected String deadline = "Complete by EOD ";
	protected String activity = "team Lunch";

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

	public String doActivity() {
		return activity;
	}

}
