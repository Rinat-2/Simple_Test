package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParametrizedTests {
    static Logger logger = LoggerFactory.getLogger(ParametrizedTests.class);


    @Test
    @Tag("apple_tag")
    void paramitrizedStringTest() {
        String a = System.getProperty("test" , "paramtest"); // from terminal, gradle apple_tests -Dtest=paramtest

        logger.info("\na = " + a);
        assertEquals("paramtest", a, "b = " + a);
    }
}
