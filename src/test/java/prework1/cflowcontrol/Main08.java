package prework1.cflowcontrol;

public class Main08 {

    public static void main(String[] args) {
        //defining a variable with number of rows and asterisks in a row
        int n = 5;

        //creating a loop that will generate ROWS
        for (int i = 0; i < n; i++) {
            String row = "";//variable storing asterisks in a row, it is zeroed at the beginning of each iteration

            //creating a loop that will generate asterisks in a row
            for (int j = 1; j <= n; j++) {
                if (i >= j - 1) {
                    row += "* ";
                } else row += j + " ";
            }
            System.out.print(row + "\n");//displaying asterisks from a row and adding newline sign
        }

    }
}
