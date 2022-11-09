package entornosdesarrollo;

public class EntornosDesarrollo {

    public static void main(String[] args) {

        for (int Olimpia = 0; Olimpia <= 30; Olimpia++) {
            if (Olimpia % 2 == 0 && Olimpia % 5 == 0) {
                System.out.println(Olimpia + " es FizzBuzz");
            } else if (Olimpia % 5 == 0) {
                System.out.println(Olimpia + " es Buzz");
            } else if (Olimpia % 2 == 0) {
                System.out.println(Olimpia + " es Fizz ");
            }
        }
    }
}
