package com.notebookpractice;

/* Java program to demonstrate overriding when 
superclass method does not declare an exception
*/

class Parent {
  void m1()
  {
      System.out.println("From parent m1()");
  }

  void m2()
  {
      System.out.println("From parent  m2()");
  }
}

class Child extends Parent {
  @Override
  // no issue while throwing unchecked exception
  void m1() throws ArithmeticException
  {
      System.out.println("From child m1()");
  }

  @Override
  // compile-time error
  // issue while throwing checked exception
  void m2() throws Exception
  {
      System.out.println("From child m2");
  }
}