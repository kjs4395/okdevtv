package com.okdevtv.java;

/**
 * Hello world!
 *
 */
public class App implements AppInterface 
{
	private static String msg;
    public static void main( String[] args )
    {
       msg = "Hello World";
       print(msg);
    }
    private static void print(String s) {
		System.out.println(s);
	}
	public String getString() {
		return null;
	}
}
