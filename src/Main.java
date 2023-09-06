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

        if(liczbaWylosowana == wpisana)
        {
            System.out.println("Brawo zgadłeś!");
        }
        else
        {
            int roznica = liczbaWylosowana > wpisana ? liczbaWylosowana - wpisana : wpisana - liczbaWylosowana;
            /*
                Wyrażęnie warunkowe
                wzór:
                warunek ? if true : if false
            */
            roznica = roznica/10;
            //dzielenie całkowite jeżeli dzielimy liczby całkowite to wybik też jest całkowity;
            System.out.println(
                    switch (roznica)
                            {
                                case 0 -> "było bardzo blisko";
                                case 1 -> "Całkiem nieźle";
                                case 2 -> "prawie";
                                default -> "spróbuj ponownie";
                            });
        }

    }
}

