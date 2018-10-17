package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.envelope.envelope;


class envelopeTest {

    @Test
    void testGetFullname() {
    	String expected = "Antony Jonathen Herring";
        String actual = envelope.getFullname();
        assertEquals((expected), actual);
    }
}

	