import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    @Test
    void testSimpleLoggingOutput() {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.info("Hello World");
    }

}
