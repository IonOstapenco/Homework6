package homework6.ex1;

/*Ex 1. Folosind bucla for afisati toate numerele pare de la 1 la 20
 */
public class Ex1 {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " este numar par");
                }
            }
        } catch (Exception e) {
            System.out.println("ceva nu e in regula");
        }
    }
}
