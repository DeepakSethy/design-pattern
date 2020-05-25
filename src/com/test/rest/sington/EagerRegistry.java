package com.test.rest.sington;

public class EagerRegistry {
	/**
	 * By Making constructor private we prevent object instantiation outside of this class
	 * & this will also prevent inheritance 
	 */
	private EagerRegistry() {
		
	}
	
	/**
	 * the single instance. Eagerly initialized singleton
	 */
	private static final EagerRegistry INSTANCE = new EagerRegistry();
	
	
	/**
	 * this method returns the singleton instance to outside world
	 * @return
	 */
	public static EagerRegistry getInstance() {
		return INSTANCE;
	}
}
