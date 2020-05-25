package com.test.rest.factory;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public JSONMessage createMessage() {
		return new JSONMessage();
	}

}
