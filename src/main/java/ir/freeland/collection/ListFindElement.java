package ir.freeland.collection;

import java.util.ArrayList;
import java.util.List;

import ir.freeland.collection.model.Address;
import ir.freeland.collection.model.Customer;
import ir.freeland.collection.model.Person;

public class ListFindElement {
	public static void main(String[] args) {

		Address address1=new Address(17,"arak","iran");
		Address address2=new Address(18,"ghom","iran");
		Address address3=new Address(2,"karaj","iran");
		Address address4=new Address(8,"tehran","iran");

		Person alireza = new Person("Alireza", "fattahi", 48, address1); 
		Person roham = new Person("Roham", "kabir", 10, address2);
		Person arefeh = new Person("Arefeh", "ajloo", 15, address3);
		Person radmeher = new Person("Radmehr", "rezaee", 12, address4);
		
		
		List<Person> personList = new ArrayList<>();
		personList.add(alireza);
		personList.add(roham);
		personList.add(arefeh);

		// first approach use for
		for (Person p : personList) {
			if (p.getName().equals("Alireza")) {
				System.out.println("find it!");
			}
		}

		//indexOf and contains use objects.equal
		Person hossein = new Person("hossein", "akbari", 42, address4);
		personList.contains(hossein); 
		
		Person negar = new Person("negar", "ajloo", 26, address3);
		personList.add(negar);
		System.out.println ( personList.indexOf(negar) ) ; 

	}
}
