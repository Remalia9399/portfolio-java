package pl.coderslab.homeworks.exceptions;
/*
Zadanie 1
W pakiecie pl.coderslab.homeworks.exceptions, w pliku Main01.java umieść metodę o sygnaturze:

public static void average(String a, String b).

uzupełnij ciało metody tak, aby dokonała konwersji zmiennych a i b na typ liczbowy int i wykonała dzielenie zmiennej a przez zmienną b,
zabezpiecz program przed możliwymi błędami,
dodaj sekcję, która wykona się zawsze niezależnie od tego, czy wystąpi błąd, czy nie,
pamiętaj o błędzie ArithmeticException,
zmień typ zmiennych a i b na double i sprawdź jakie otrzymasz wyniki w przypadku dzielenia przez 0.
Zapoznaj się z artykułami:
https://www.geeksforgeeks.org/g-fact-33-infinity-or-exception/ https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.2
 */

public class Main01 {

    public static void main(String[] args) {
        String a = "10";
        String b = "0";
        average(a,b);
        System.out.println("Kolejna metoda double");
        averageDouble(a,b);



    }
    public static void average(String a, String b) {
        try {
            int aInt = Integer.parseInt(a);
            int bInt = Integer.parseInt(b);
            int c = aInt / bInt;
            System.out.println(aInt +" / " +bInt + " = " + c);
        }
        catch (NumberFormatException e1)
        {
            System.out.println("Nie poprawny format liczb całkowitych");
        }
        catch (ArithmeticException e2) {
            System.out.println("Nie można dzielić przez 0");
        }
        finally {
            System.out.println("Koniec metody");
        }

    }
    public static void averageDouble(String a, String b) {
        try {
            double aDouble = Double.parseDouble(a);
            double bDouble = Double.parseDouble(b);
            double c = aDouble / bDouble;
            if (bDouble == 0.0) {
                throw new ArithmeticException();
            }
            System.out.println(aDouble +" / " +bDouble + " = " + c);
        }
        catch (NumberFormatException e1)
        {
            System.out.println("Nie poprawny format liczb całkowitych");
        }
        catch (ArithmeticException e2) {
            System.out.println("Nie można dzielić przez 0");
        }
        finally {
            System.out.println("Koniec metody");
        }

    }

}
