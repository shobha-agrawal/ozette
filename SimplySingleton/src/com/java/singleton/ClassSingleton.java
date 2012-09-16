package com.java.singleton;

/**
 * @author shobha
 * This class implements a Singleton class. This is thread-safe as we 
 * are having a static object.
 * http://www.javaworld.com/javaworld/jw-04-2003/jw-0425-designpatterns.html
 */
public class ClassSingleton {

	private static ClassSingleton instance = new ClassSingleton();
	
	private ClassSingleton(){
	}

	public static ClassSingleton getInstance(){
		return instance;
	}
}
