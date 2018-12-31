package design;

import databases.ConnectToMongoDB;

import java.util.ArrayList;
import java.util.List;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo(200);
		EmployeeInfo emp2 = new EmployeeInfo("Salma", 202);
		EmployeeInfo emp3 = new EmployeeInfo("Taslima", 203, 51);
		EmployeeInfo emp4 = new EmployeeInfo("Mominul", 205, 35, 2000);

		emp1.setName("Joynal");
		emp1.setEmployeeID(209);
		emp1.setSalary(8700);

		emp2.setEmployeeAge(55);
		emp2.setSalary(7500);

		emp3.setSalary(3000);


		System.out.println(emp1.getName() + " " + emp1.getEmployeeID() + " " + emp1.getEmployeeAge() + " " + emp1.getSalary());


		List<EmployeeInfo> list = new ArrayList<>();
		list.add(0, emp1);
		list.add(1, emp2);
		List list1 = list;

		EmployeeInfo.calculateEmployeeBonus(115000,7);
		EmployeeInfo.calculateEmployeePension(50000);


		ConnectToMongoDB mon = new ConnectToMongoDB();
		mon.insertIntoMongoDBforemp(list1, "List of fortune Employee");


		List<EmployeeInfo> emp = mon.readEmployeeListFromMongoDB("List of fortune Employee");
		for (EmployeeInfo person : emp) {
			System.out.println(person.getName() + " " + person.getEmployeeID());


		}

	}
}









