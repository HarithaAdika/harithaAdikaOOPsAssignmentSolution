package com.greatlearning.oopsassignment.service;

public class SuperDepartment {

	private String deptName = "Super Department ";
	private String todaysWork = "No Work as of now";
	private String deadline = "Nil";
	protected String isHoliday = "Today is not a holiday";

	public String departmentName() {
		return deptName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return deadline;
	}

	public String isTodayAHoliday() {
		return isHoliday;
	}

}
