//AbcEmployeeMgr.java  BridgelabzEmpolyeeMgr.java  IEmployeeManager.java
package com.empapp.test;
import com.empapp.model.Employee;
import com.empapp.controller.BridgelabzEmployeeMgr;
import com.empapp.controller.AbcEmployeeMgr;
import com.empapp.controller.IEmployeeManager;



class EmployeeDwTest
{
  public static void main(String... args)
  {
	Employee brlzEmp =  new Employee();
	brlzEmp.setId(1);
	brlzEmp.setIsPresent();
	brlzEmp.setDoneParttime();
	
        Employee abcEmp =  new Employee();
        brlzEmp.setId(2);
        brlzEmp.setIsPresent();
        brlzEmp.setDoneParttime();

	IEmployeeManager blem = new BridgelabzEmployeeMgr();
	IEmployeeManager abcem = new AbcEmployeeMgr();
	
	System.out.println("Dailywage for Employee from bridgelabz company with id = "+ brlzEmp.getId() + " is "+blem.calculateDailyWage(brlzEmp));
        System.out.println("Monthly wage for Employee from bridgelabz company with id = "+ brlzEmp.getId() + " is "+blem.calculateMonthlyWage(brlzEmp));
             
        System.out.println("Dailywage for Employee from ABC company with id = "+ abcEmp.getId() + " is "+abcem.calculateDailyWage(abcEmp));
        System.out.println("Monthly wage for Employee from ABC company with id = "+ abcEmp.getId() + " is "+abcem.calculateMonthlyWage(abcEmp));


	
  }
}
