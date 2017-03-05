import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    @Test
    public void testSimpleLoggingOutput() {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.info("Hello World");
    }

    @Test
    public void testLogging() {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.debug("This is my 2nd test.");
    }

}
