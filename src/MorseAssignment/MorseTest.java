package MorseAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {

    @Test
    public void testGetFToMorse() {

        Converter convert = new Converter();

        String actual = convert.FtoMorse("f");

        String expected = "**-*";

        assertEquals(expected, actual);

    }

    @Test
    public void testSymbol() {

        Converter convert = new Converter();

        String actual = convert.MorseToSymbol("?");

        String expected = "**--**";

        assertEquals(expected, actual);

    }

    @Test
    public void testEngToMorse() {

        Converter convert = new Converter();

        String actual = convert.EngToMorse("a");

        String expected = "*-";

        assertEquals(expected, actual);

    }



}


