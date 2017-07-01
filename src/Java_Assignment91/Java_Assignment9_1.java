package Java_Assignment91;
/*
 * This class will master the following concepts:
 * HashMap
 * Key and Value Pairing and Separation
 * Problem Statement :
 * Create an application having a Generic HashMap with Empcode as key and EmpName as value.
 * Expected Output:
 * Display only EmpNames as output.
*/
import java.util.*;

public class Java_Assignment9_1 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> EmployeeInfo=new HashMap<Integer,String>(); //  creating the EmployeeInfo hash map
		
		EmployeeInfo.put(1001,"Amit Bishoi");     // Populating 1st employee information in hash map
		EmployeeInfo.put(1002,"Vijay Parija");    // Populating 2nd employee information in hash map 
		EmployeeInfo.put(1003,"Rahul Mahunta");   // Populating 3rd employee information in hash map 
		EmployeeInfo.put(1004,"Raju Nanda");      // Populating 4th employee information in hash map
		EmployeeInfo.put(1005,"Ram Shetty");      // Populating 5th employee information in hash map
		
		System.out.println("Employee Names are:\n"); // Printing a label at starting of the console
		
		//Below for loop is used to print the Employee Name
		for(Map.Entry<Integer,String> m:EmployeeInfo.entrySet())
		{  
			System.out.println(m.getValue());  
		}  

	}

}
