import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WczytywaniePliku {

    public static void main(String[] args) {

        String text="";

        int iloscSlow=0;
        int iloscZnakow=0;

        File file = new File("plik.txt");
        try (Scanner sc = new Scanner(file);) {

            while (sc.hasNextLine()) {   //jesli jest tekst
                text += sc.nextLine();
            }
            System.out.println(text);
        }
    catch(FileNotFoundException e){
                System.out.println("Plik nie istnieje");
            }


        String[] split = text.split("\\s");  //tekst dzielimy po spacji, tabulatorze i enderze

        String iloscbezbialych=text.replace("\\s","");
        String ileczarnch=iloscbezbialych.length();
        //iloscSlow=.length();

        System.out.println("Ilość znaków "+iloscZnakow);
        System.out.println("Ilość słów "+split.length);
        }


    }



