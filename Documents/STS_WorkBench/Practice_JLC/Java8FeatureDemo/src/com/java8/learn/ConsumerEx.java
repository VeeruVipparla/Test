package com.java8.learn;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> c=s-> System.out.println(s);
		
		c.accept("Abburu");
		
		
		Consumer <String> consumer1 = (arg) -> {
            System.out.println(arg + "OK");
        };
        
        //consumer1.accept("TestConsumerAccept - ");
        
        
        Consumer < String > consumer2 = (x) -> {
            System.out.println(x + "OK!!!");
        }; 
        
        
       //consumer2.accept("TestConsumerAfterThen - ");
        
        consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");
        
        
        
       // consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");


	}

}
