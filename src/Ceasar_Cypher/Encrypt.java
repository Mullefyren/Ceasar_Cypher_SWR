package Ceasar_Cypher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Encrypt {

    public static StringBuilder encrypt(String text) {
        Random rand = new Random();
        int cypher = 2;//= rand.nextInt(27) - 1;
        StringBuilder result= new StringBuilder();

        for (int i=0; i<text.length(); i++) {
            if (Character.isLetter(text.charAt(i))){
                if (Character.isUpperCase(text.charAt(i))) {
                    char ch = (char) (((int) text.charAt(i) +
                            cypher - 65) % 26 + 65);
                    result.append(ch);
                } else {
                    char ch = (char) (((int) text.charAt(i) +
                            cypher - 97) % 26 + 97);
                    result.append(ch);
                }
            }else{
                result.append(text.charAt(i));
            }
            }
            return result;
    }
    public static String aliceFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/AliceInWonderland.txt"));
        String story = "";
        while (scanner.hasNextLine()){
            story += scanner.nextLine();
        }
        return story;
    }
}
