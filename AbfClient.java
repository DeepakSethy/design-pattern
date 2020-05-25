package com.test.rest.abstfactory;

import com.test.rest.abstfactory.Instance.Capacity;

public class AbfClient {
	private ResourceFactory factory;
	
	public AbfClient(ResourceFactory factory) {
		this.factory = factory ;
	}
	
	public Instance createServer(Instance.Capacity capacity, int capMib) {
		Instance instance = factory.createInstance(capacity);
		Storage storage = factory.createStorage(capMib);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
		AbfClient aws = new AbfClient(new AwsResourceFactory());
		Instance i1 = aws.createServer(Capacity.MICRO, 20480);
		i1.start();
		i1.stop();
	}
}
