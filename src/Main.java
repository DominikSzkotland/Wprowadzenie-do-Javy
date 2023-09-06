import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Zostanie wylosowana jedna liczba z zakresu od 1 do 100");
        int liczbaWylosowana = (int)(Math.random()*100+1);
        System.out.println(liczbaWylosowana);
        /*
        rzutowanie z double do int
        rzutowanie zawężające
        rzutowanie to takie odcinanie tego co po przecinku


        typy proste
        boolean
        char

        byte
        int

        byte do int = rzutowanie z którego nic nie tracę
        int do byte = rzutowanie zawężające
         */
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbę z zakresu 1 do 100");
        int wpisana = klawiatura.nextInt();
        System.out.println("wstawiono: "+wpisana);
    }

}