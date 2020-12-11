package language;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lang {
    private String polsihUrl = "src/main/resources/languages/polish.txt";
    private String englishUrl = "src/main/resources/languages/english.txt";
    private String url = englishUrl;
    public String[] dictionary = new String[60];

    public void changeEnglishToPolish(){
        url=polsihUrl;
        translate();
    }

    public void changePolishToEnglish(){
        url=englishUrl;
        translate();
    }

    public void translate(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(url));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <dictionary.length ; i++) {
            dictionary[i] = scanner.nextLine();
        }
    }

}
