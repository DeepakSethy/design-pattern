package com.test.rest.sington;

/**
 * Singleton pattern using lazy initialization holder class. this ensures that
 * we have a lazy initialization with out worrying about synchronization.
 * 
 * @author HA1145
 *
 */
public class LazyInitializationRegistry {
	/**
	 * Private Constructor to prevent instantiation outside of this class 
	 * this also prevents inheritance.
	 */
	private LazyInitializationRegistry() {
	}

	/**
	 * This class provides with the initialization on demand holder pattern
	 * @author HA1145
	 *
	 */
	private static class RegistryHolder {
		static final LazyInitializationRegistry INSTANCE = new LazyInitializationRegistry();
	}

	/**
	 * This method provides the singleton instance. The use of {@Link RegistryHolder}
	 * @author HA1145
	 *
	 */
	public static LazyInitializationRegistry getInstance() {
		return RegistryHolder.INSTANCE;
	}
}
