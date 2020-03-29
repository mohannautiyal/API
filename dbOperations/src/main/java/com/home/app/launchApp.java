
package com.home.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.home.db.empDAO;
import com.home.entity.emp;

public class launchApp {

	public static void main(String[] args) {
		
		emp insertEmp = new emp(1234, "Madan", "Test Lead", 123, "Tech", 50000, null, 5467);
		empDAO.insertRecords(insertEmp);
				
		List<emp> employeeDetails = new ArrayList<emp>();
		employeeDetails = empDAO.getRecords();
		Iterator<emp> itr = employeeDetails.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

				
	}

}
