package homework6.ex3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ex 3. Avem un program care din start are in el inscrisa ntr-o variabila o parola.
sa presupunem ca parola este 667.
Daca utilizatorul introduce 667 - Parola corecta!
In caz contrar - Parola gresita, mai incearca!*/
public class Ex3 {
    public static void main(String[] args) {
        final String correctPassword = "667";
        String attemptPassword, action;
        int attempts = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("enter password");
                attemptPassword = reader.readLine();

                if (correctPassword.equals(attemptPassword)) {//daca ceea ce introducem ii ca parola corecta
                    System.out.println("correct password!");
                    break;//iesim
                } else {
                    System.out.println("incorrect password");
                    attempts++;

                    System.out.println("would you like to try again? yes/no");
                    action = reader.readLine();
                    if (action.equalsIgnoreCase("no")) {
                        System.out.println("program is finished. bye!");
                        break;//iesim din ciclu
                    } else if (action.equalsIgnoreCase("yes")) {
                        System.out.println("go on...");
                    } else {
                        System.out.println("unknown command");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("something wrong");

            }
        }
        System.out.println("total attempts: " + attempts);
    }
}
