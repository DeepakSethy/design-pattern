package com.test.rest.abstfactory;

public interface ResourceFactory {
	Instance createInstance(Instance.Capacity capacity);
	Storage createStorage(int capMib);
}
