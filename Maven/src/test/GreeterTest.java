package test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import main.java.hello.Greeter;
import org.junit.Test;

/**
 * Created by Adrian Ispas on 26.06.2017.
 */
public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

}
