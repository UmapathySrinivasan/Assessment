package com.umapathy.hiberneatDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
	@Id
		private int empId;
		private String empName;
		private String job;
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}


}
