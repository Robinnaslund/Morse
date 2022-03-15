package MorseAssignment;


import java.util.HashMap;
import java.util.Locale;

public class Converter {

    private HashMap<String, String> myHash;

    public Converter() {


        myHash = new HashMap<String, String>();

        myHash.put("a", "*-");
        myHash.put("*-", "a");
        myHash.put("b", "-***");
        myHash.put("-***", "b");
        myHash.put("c", "-*-*-");
        myHash.put("-*-*-", "c");
        myHash.put("d", "-**");
        myHash.put("-**", "d");
        myHash.put("e", "*");
        myHash.put("*", "e");
        myHash.put("f", "**-*");
        myHash.put("**-*", "f");
        myHash.put("g", "--*");
        myHash.put("--*", "g");
        myHash.put("h", "****");
        myHash.put("****", "h");
        myHash.put("i", "**");
        myHash.put("**", "i");
        myHash.put("j", "*---");
        myHash.put("*---", "j");
        myHash.put("k", "-*-");
        myHash.put("-*-", "k");
        myHash.put("l", "*-**");
        myHash.put("*-**", "l");
        myHash.put("m", "--");
        myHash.put("--", "m");
        myHash.put("n", "-*");
        myHash.put("-*", "n");
        myHash.put("o", "---");
        myHash.put("---", "o");
        myHash.put("p", "*--*");
        myHash.put("*--*", "p");
        myHash.put("q", "--*-");
        myHash.put("--*-", "q");
        myHash.put("r", "*-*");
        myHash.put("*-*", "r");
        myHash.put("s", "***");
        myHash.put("***", "s");
        myHash.put("t", "-");
        myHash.put("-", "t");
        myHash.put("v", "**-");
        myHash.put("**-", "v");
        myHash.put("w", "***-");
        myHash.put("***-", "w");
        myHash.put("x", "*--");
        myHash.put("*--", "x");
        myHash.put("y", "-**-");
        myHash.put("-**-", "y");
        myHash.put("z", "--**");
        myHash.put("--**", "z");
        myHash.put("1", "*----");
        myHash.put("*----", "1");
        myHash.put("2", "**---");
        myHash.put("**---", "2");
        myHash.put("3", "***--");
        myHash.put("***--", "3");
        myHash.put("4", "****-");
        myHash.put("****-", "4");
        myHash.put("5", "*****");
        myHash.put("*****", "5");
        myHash.put("6", "-****");
        myHash.put("-****", "6");
        myHash.put("7", "--***");
        myHash.put("--***", "7");
        myHash.put("8", "---**");
        myHash.put("---**", "8");
        myHash.put("9", "----*");
        myHash.put("----*", "9");
        myHash.put("0", "-----");
        myHash.put("-----", "0");
        myHash.put(".", "*-*-*-");
        myHash.put(",", "--**--");
        myHash.put("?", "**--**");

    }

    public String FtoMorse(String charachter) {
        String letter = myHash.get(charachter);

        return letter;

    }

    public String MorseToSymbol(String symbol) {
        String special = myHash.get(symbol);

        return special;

    }

    public String MorseToEng(String input) {
        //Felhantering - Konvertera stor bokstav till liten
        input = input.toLowerCase();
        String text = myHash.get(input);
        //Felhantering om nånting inte kan översättas skriv change your input ut
        if (text == null) {
            text = "Change you input";

        }

        return text;
    }

    public String EngToMorse(String english) {
        String eng = myHash.get(english);

        return eng;


    }

}



