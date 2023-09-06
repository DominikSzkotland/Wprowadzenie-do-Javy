import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Zostanie wylosowana jedna liczba z zakresu od 1 do 100");
        int liczbaWylosowana = (int)(Math.random()*100+1);
        System.out.println(liczbaWylosowana);
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbę z zakresu 1 do 100");
        for(int i = 0; i < 10; i++)
        {
            int wpisana = klawiatura.nextInt();
            System.out.println("wstawiono: " + wpisana);
            if (liczbaWylosowana == wpisana)
            {
                System.out.println("Brawo zgadłeś!");
                break;
            }

            else
            {
                int roznica = liczbaWylosowana > wpisana ? liczbaWylosowana - wpisana : wpisana - liczbaWylosowana;
                roznica = roznica / 10;
                if(wpisana > liczbaWylosowana)
                {
                    System.out.println("Za dużo!");
                }
                else
                {
                    System.out.println("Za mało!");
                }
                System.out.println(
                        switch (roznica) {
                            case 0 -> "było bardzo blisko";
                            case 1 -> "Całkiem nieźle";
                            case 2 -> "prawie";
                            default -> "spróbuj ponownie";
                        });
            }
        }
    }
}

