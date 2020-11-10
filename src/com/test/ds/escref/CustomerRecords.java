package com.test.ds.escref;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;

	public CustomerRecords(Map<String, Customer> records) {
		this.records = new HashMap<String, Customer>();
	}

	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}

	public Map<String, Customer> getCustomers() {
		//return new HashMap<String, Customer>(this.records);
		return Collections.unmodifiableMap(this.records);
	}

	@Override
	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}
}
