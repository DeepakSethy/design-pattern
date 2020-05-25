package com.test.rest.factory;

import java.util.Collection;

public abstract class Message {
	public abstract String getContent();
	
	public void addDefaultHeaders() {
	}
	
	public void encrypt() {
		
	}
}
