package lesson2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class Start {
	public static void main(String[] args) {

		Employee sysEngineer = new Employee("John", "Connor", "Manager");
		IdCard card = new IdCard(123);
		try {
			card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sysEngineer.setIdCard(card);
		Room room101 = new Room(101);
		Room room321 = new Room(321);
		sysEngineer.setRoom(room101);
		sysEngineer.setRoom(room321);
		System.out.println(sysEngineer.getName() + " работает в должности " + sysEngineer.getPosition());
		System.out.println("Удостовирение действует до " + sysEngineer.getIdCard().getDateExpire());
		System.out.println("Может находиться в помещеньях:");
		Iterator iter = sysEngineer.getRoom().iterator();
		while (iter.hasNext()) {
			System.out.println(((Room) iter.next()).getNumber());
		}
		Department programmersDepartment = new Department("Программисты");
		programmersDepartment.addEmployee(sysEngineer);
		System.out.println("Относится к отделу "+sysEngineer.getDepartment().getName());
		// изменяем должность
		sysEngineer.setPosition("Сторож");
		// смотрим ранее занимаемые должности:
		System.out.println("В прошлом работал как:");
		iter = sysEngineer.getPastPosition().iterator();
		while(iter.hasNext()){
			System.out.println( ((PastPosition) iter.next()).getName());
		}
		Employee director = new Employee("Федор", "Дубов", "Директор");
		Menu menu = new Menu();
		Employee employees[] = new Employee[10];
		employees[0]= sysEngineer;
		employees[1] = director;
		Menu.showEmployees(employees);
		System.out.println("В отделе "+sysEngineer.getDepartment().getName()+" работает "
				+sysEngineer.getDepartment().getPersonCount()+" человек.");
	}
}
