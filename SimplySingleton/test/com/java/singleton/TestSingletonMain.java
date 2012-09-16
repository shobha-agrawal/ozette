package com.java.singleton;

import org.apache.log4j.Logger;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestSingletonMain extends TestCase {
	
	private static Logger log = Logger.getLogger(TestSingletonMain.class);
	
	public void testUnique(){
		ClassSingleton firstSingletonObj = ClassSingleton.getInstance();
		log.debug("Got the first singleton object");
		ClassSingleton secSingletonObj = ClassSingleton.getInstance();
		log.debug("Got the second singleton object");
		
		log.debug("Checking for equality of two objects");
		Assert.assertEquals(true,firstSingletonObj == secSingletonObj);
		
	}
}
