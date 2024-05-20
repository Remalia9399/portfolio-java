package pl.coderslab.homeworks.methods;
/*
Zadanie 1
W pakiecie pl.coderslab.homeworks.methods, w pliku Main01.java umieść metodę o sygnaturze public static double dogAge(double dogAge) , która przeliczy wiek psa w psich latach.

funkcja powinna przyjmować wiek psa jako parametr,
dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
funkcja powinna zwrócić wiek psa.
Przykład:
dogAge(1.5)  # spodziewany wynik: 1.5 * 10.5 = 15.75

dogAge(5)  # spodziewany wynik: 2 * 10.5 + 3 * 4 = 33
 */

public class Main01 {

    public static void main(String[] args) {

        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));

    }
    public static double dogAge(double age) {
        double dogAge = 0;
        for (double i = 0; i < age; i += 0.5) {
            if (i < 2) {
                dogAge += 5.25;
            } else dogAge += 2;
        }
        return dogAge;
    }



}


