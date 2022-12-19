package com.jlc.miscellaneous;

public class ClassNotFoundExceptionExample {
	public static void main(String[] args) {

        try {
        	// same project should be available not other project.

            Class.forName("com.test.sn.Demo");//com.javaguides.corejava.Demo

            ClassLoader.getSystemClassLoader().loadClass("com.test.sn.Demo");

            
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
       
    }

}
