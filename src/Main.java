import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zostanie wylosowanych 6 liczb z zakresu od 1 do 100");
        HashSet<Integer> wylosowane = new HashSet<>();
        /*
        kolekcje:
        listy - ArrayList, LinkedList - elementy uporządkowane indeksowane mogą się powtarzać
        zbiory - HashSet - elementy zazwyczaj nieporządkowane nieindeksowane nie mogą się potarzać
        mapy
         */
        while(wylosowane.size()<6)
        {
            wylosowane.add((int)(Math.random()*10+1));
        }
        System.out.println(wylosowane);//adres obiektu
        for(int wylosowana:wylosowane)//taki foreach
        {
            System.out.println(wylosowana+", ");
        }
        //wczytywać z klawaitury 6 liczb bez powtórzeń
        Scanner klawiatura = new Scanner(System.in);
        ArrayList<Integer> liczbyWczytane = new ArrayList<>();

        for(int i=0; i<6; i++)
        {
            int liczba;
            do
            {
                System.out.println("podaj liczbę");
                liczba = klawiatura.nextInt();
            }
            while(liczbyWczytane.contains(liczba));
            {
                liczbyWczytane.add(liczba);
            }
        }
        System.out.println("Wczytane liczby"+liczbyWczytane);

        LinkedList<Integer> trafione = new LinkedList<>();
        //jeżeli jakaś liczba będzie i w wylosowane i w wpisane to dać do trafione
        for(Integer wylosowana:wylosowane)
        {
            if(liczbyWczytane.contains(wylosowana))
            {
                trafione.add(wylosowana);
            }
        }
        System.out.println("Trafiono "+trafione);
    }
}

