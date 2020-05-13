package com.empapp.controller;
import com.empapp.model.Employee;

public class BridgelabzEmployeeMgr implements IEmployeeManager
{
   public static final int workingHours = 11;
   public static final int hourlyWage = 20;


  @Override
  public int calculateDailyWage(Employee e)
  {
	if(e.getIsPresent() == true)
   	{
	    if(e.getDoneParttime() == true)
	    {
		return (hourlyWage * workingHours + hourlyWage * workingHours );
	    }
	    else
	    {
		return (hourlyWage * workingHours );
	    }
	}
	return 0;
  }
  
  @Override
  public int calculateMonthlyWage(Employee e)
  {
	
	if(e.getIsPresent() == true)
        {
            if(e.getDoneParttime() == true)
            {
	            return ((hourlyWage*workingHours + hourlyWage * workingHours)*hourlyWage);
            }
            else
            {
                    return (hourlyWage * workingHours * hourlyWage);
            }
        }
	return 0;

	
  }

}