import java.io.*;
import java.util.Scanner;

class lab3_github {

public static void main(String[] args) {
    try {
        System.out.println("Podaj ścieżkę dostępu do pliku: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sciezka = br.readLine();
        FileReader in = new FileReader(sciezka);
        System.out.println("Liczba slów: " + numberOFWords(in));
        in.close();
        br.close();

    } catch (FileNotFoundException e) {
        System.out.println("Plik nie istnieje");
        System.exit(1);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

public static int numberOFWords(FileReader r) {
    Scanner skaner = new Scanner(r);
    int count = 0;
    while (skaner.hasNext()) {
        skaner.next();
        count++;
    }
    skaner.close();
    return count;
}
}