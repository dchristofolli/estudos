package Hello;

import java.time.Clock;
import java.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now(Clock.systemDefaultZone());
        System.out.println("Horário atual: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}