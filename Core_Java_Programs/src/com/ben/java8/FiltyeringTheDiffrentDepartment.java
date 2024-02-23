package com.ben.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltyeringTheDiffrentDepartment {

	public static void main(String[] args) 
	{
		ArrayList<Employee> employeeDB = new ArrayList<Employee>();
		employeeDB.add(new Employee("Benaka",01,"Development","S/O LokeshBabu MR M N Kote Gubbi(Tq) Tumkur",(long) 100000));
		employeeDB.add(new Employee("Arun",02,"Development","No 48 Saraswathi puram Hydrabad",(long)60000));
		employeeDB.add(new Employee("Lakkappa",03,"Development","No 89 laxmi puram Belgum",(long)120000));
		employeeDB.add(new Employee("Meghana",04,"HR","No 60 halle market Mysore",(long)80000));
		employeeDB.add(new Employee("Shivappa",05,"Manager","No 101 firozabad Hindupur",(long)200000));
		employeeDB.add(new Employee("Harish",06,"IT","No 120 chanai Tamilnadu",(long)176000));
		
		List<String> collect = employeeDB.stream().flatMap(e->Stream.of(e.getDeptNo())).distinct().collect(Collectors.toList());
		for(String e : collect)
		{
			System.out.println(e);
		}
	}

}
