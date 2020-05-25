package com.test.rest.abstfactory;

import com.test.rest.abstfactory.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory{

	@Override
	public Instance createInstance(Capacity capacity) {
		return new EC2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}
	
}
