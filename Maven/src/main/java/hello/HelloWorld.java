package main.java.hello;

import org.joda.time.LocalTime;

/**
 * Created by Adrian Ispas on 26.06.2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
