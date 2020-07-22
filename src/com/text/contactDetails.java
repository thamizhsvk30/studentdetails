package com.text;

import com.org.EmpDetails;
import com.org.StuDocs;

public class contactDetails {
	public static void main(String[] args) {
		StuDocs s = new StuDocs();
		s.stuAddress();
		s.stuName();
		EmpDetails e = new EmpDetails();
		e.empName();
		e.empAddress();
	}

}
