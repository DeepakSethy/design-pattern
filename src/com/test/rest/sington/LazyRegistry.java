package com.test.rest.sington;

/**
 * this class demonstrates singleton pattern using double checked locking or
 * classing singleton this is also a lazy initializing singleton although this
 * implementation solves the multi-threading issue with lazy initialization
 * using the volatile and double checked locking , the volatile keyword is
 * guaranteed to work only after JVMS starting with version 1.5 and later.
 * 
 * @author HA1145
 *
 */
public class LazyRegistry {
	
	/**
	 * private constructor to prevent instantiation outside this class and prevent subclassing
	 */
	private LazyRegistry() {

	}

	/**
	 * the instance use of volatile
	 */
	private static volatile LazyRegistry INSTANCE;

	/**
	 * this method implements the double check locking
	 * @return
	 */
	public static LazyRegistry getInstance() {
		if (INSTANCE == null) {
			synchronized (LazyRegistry.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazyRegistry();
				}
			}
		}
		return INSTANCE;
	}
}
