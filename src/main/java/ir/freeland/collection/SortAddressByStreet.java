package ir.freeland.collection;

import java.util.Comparator;

import ir.freeland.collection.model.Address;


public class SortAddressByStreet implements Comparator<Address> {
	@Override
	public int compare(Address o1, Address o2) {
		return o1.getStreet() - o2.getStreet();
	}
}
