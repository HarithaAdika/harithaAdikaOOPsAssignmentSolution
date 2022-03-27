package com.greatlearning.oopsassignment.service;

public class AdminDepartment extends SuperDepartment {
	protected String deptName = "Admin Department ";
	protected String todaysWork = "Complete your documents Submission";
	protected String deadline = "Complete by EOD ";

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

}
