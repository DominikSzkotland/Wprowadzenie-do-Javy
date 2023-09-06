import java.util.HashSet;

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
    }
}

