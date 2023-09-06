import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zostanie wylosowanych 6 liczb z zakresu od 1 do 100");
        int wylosowane[] = new int[6];
        /*
        Tablica w Javie przaechowuje typy proste i złożone
        musi mieć ustalony rozmiar
        rozmiaru nie można zmienić w dalszej części programu
         */
        for(int i = 0; i< 6; i++)
        {
            wylosowane[i]=(int)(Math.random()*10+1);
        }
        System.out.println(wylosowane);//adres obiektu
        for(int wylosowana:wylosowane)
        {
            System.out.println(wylosowana+", ");
        }
    }
}

