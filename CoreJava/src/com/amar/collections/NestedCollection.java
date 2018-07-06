package com.amar.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class StaffBean {
	private int empId;
	
	private String firstName;
	
	private String lastName;
	
	public StaffBean(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return this.empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(obj != this) {
			return false;
		} else {
			StaffBean staff = (StaffBean) obj;
			return this.firstName.equals(staff.getFirstName()) && 
					this.lastName.equals(staff.lastName) ? true : false;
		}
	}
	
	@Override
	public String toString() {
		return "StaffBean [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}

public class NestedCollection {

	public static void main(String[] args) {
		List<StaffBean> allStaffs = new ArrayList<>();
		List<StaffBean> duplicateStaff = new ArrayList<>();
		Map<Integer, List<StaffBean>> org = getMap();
		org.values().forEach((list) -> {
			list.forEach((sb) -> {
				if(!allStaffs.contains(sb)){
					allStaffs.add(sb);	
				}else {
					duplicateStaff.add(sb);
				}
			});
		} );
	}

	static Map<Integer, List<StaffBean>> getMap() {
		Map<Integer, List<StaffBean>> map = new HashMap<>();
		for(int orgId = 100; orgId < 1000; orgId += 100) {
			List<StaffBean> list = new ArrayList<>();
			
		}
		
		return map;
	}
}
