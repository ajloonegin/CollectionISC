package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ir.freeland.collection.model.Address;
import ir.freeland.collection.model.Product;

public class ListSort {

	public static void main(String[] args) {

		Address address1=new Address(17,"arak","iran");
		Address address2=new Address(18,"ghom","iran");
		Address address3=new Address(2,"karaj","iran");
		Address address4=new Address(8,"tehran","iran");
		
		List<Address> addressList = new ArrayList<>();
		addressList.add(address1);
		addressList.add(address2);
		addressList.add(address3);
		addressList.add(address2);

		System.out.println( addressList );
		
	
		
		Collections.sort(addressList, new Comparator<Address>() {
			@Override
			public int compare(Address o1, Address o2) {
				return o1.getStreet() - o2.getStreet();
			}
			
		});
		
		Collections.sort(addressList, new SortAddressByStreet());
		
		int found = Collections.binarySearch(addressList, address2);
		System.out.println( addressList.get(found) );
	}
}
