package com.ben.java8;

import java.util.ArrayList;
import java.util.Optional;

public class FilteringEmployeeWhoseNameBenaka {

	public static void main(String[] args) 
	{
		
		ArrayList<Employee> employeeDB = new ArrayList<Employee>();
		employeeDB.add(new Employee("Benaka",01,"Development","S/O LokeshBabu MR M N Kote Gubbi(Tq) Tumkur",(long) 100000));
		employeeDB.add(new Employee("Arun",02,"Development","No 48 Saraswathi puram Hydrabad",(long)60000));
		employeeDB.add(new Employee("Lakkappa",03,"Development","No 89 laxmi puram Belgum",(long)120000));
		employeeDB.add(new Employee("Meghana",04,"HR","No 60 halle market Mysore",(long)80000));
		employeeDB.add(new Employee("Shivappa",05,"Manager","No 101 firozabad Hindupur",(long)200000));
		employeeDB.add(new Employee("Harish",06,"IT","No 120 chanai Tamilnadu",(long)176000));
		
		Optional<Employee> findFirst = employeeDB.stream().filter(e->e.getEname()=="Benaka").findFirst();
		Employee e=findFirst.get();
        System.out.println(e.getEname()+"  :"+e.getDeptNo()+" :"+e.getSalary()+" :"+e.getAddress());
	}

}
