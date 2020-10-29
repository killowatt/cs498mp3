package jenkins.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import jenkins.model.IdStrategy.*;

public class IdStrategyTest {

    @Test public void hexConversion() throws Exception {
        CaseSensitive caseSensitive = new CaseSensitive();

        String testString = caseSensitive.idFromFilename("$1234");

        assertEquals(4660, (int)testString.charAt(0));
    }

    @Test public void tildeCapitalize() throws Exception {
        CaseSensitive caseSensitive = new CaseSensitive();

        String testString = caseSensitive.idFromFilename("~a~b~c~d");

        assertEquals("ABCD", testString);
    }
}