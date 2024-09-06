package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ir.freeland.collection.model.Address;
import ir.freeland.collection.model.Person;

public class ListCreate {
	public static void main(String[] args) {
		
		Address address1=new Address(17,"arak","iran");
		Address address2=new Address(18,"ghom","iran");
		Address address3=new Address(2,"karaj","iran");
		Address address4=new Address(8,"tehran","iran");

		Person alireza = new Person("Alireza", "fattahi", 48, address1); 
		Person roham = new Person("Roham", "kabir", 10, address2);
		Person arefeh = new Person("Arefeh", "ajloo", 15, address3);
		Person radmeher = new Person("Radmehr", "rezaee", 12, address4);
		
		
		//Solution 1
		List<Person> persons = new ArrayList<>();		
		persons.add(alireza);
		persons.add(roham);
		persons.add(arefeh);
		
		//Solution 2
		Person[] presonsArray = {alireza,roham,arefeh,radmeher};
		List personss= Arrays.asList(presonsArray);


		
		persons.remove(0);
		persons.remove(1);
		System.out.println(persons);
		
		
		

		
	}
}
