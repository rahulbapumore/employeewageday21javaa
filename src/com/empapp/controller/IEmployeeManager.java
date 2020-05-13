package com.empapp.controller;
import com.empapp.model.Employee;

public interface IEmployeeManager
{
  //public boolean isEmployeePresent(Employee e);
//  public boolean isParttimeDone(Employee e); 
  public int calculateDailyWage(Employee e);
  public int calculateMonthlyWage(Employee e);
}
