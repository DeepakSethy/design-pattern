package com.test.rest.factory;

public class TextMessageCreator extends MessageCreator {

	@Override
	public TextMessage createMessage() {
		return new TextMessage();
	}
	
}
