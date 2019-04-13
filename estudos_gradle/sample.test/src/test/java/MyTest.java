import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyTest {
    @Test
    public void name() throws Exception{
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        HelloWorld.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals("Hello", s);
    }
}
