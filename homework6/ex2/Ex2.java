package homework6.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Ex 2. Scrie un program care cere utilizatorului s aintroduca o cifra.
Programul va returna de atatea ori mesajul cu numele tau. Foloseste bucla for.
Exemplu:
numar introdus: 3
Mihai
Mihai
Mihai*/
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar;
        String nume;
        try {
            System.out.println("introdu numele tau");
            nume = scanner.nextLine();
            System.out.println("introdu numar");
            numar= scanner.nextInt();
            System.out.println("numar introdus "+numar);
            for (int i=0;i<=numar;i++){
                System.out.println(nume);
            }

        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
