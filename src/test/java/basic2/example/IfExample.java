package basic2.example;

public class IfExample {
    public static void main(String[] args) {
        int points = 50;
        char grade;
        if (points > 60) {
            grade = '5';
        } else if (points > 50) {
            grade = '4';
        } else if (points > 40) {
            grade = '3';
        } else {
            grade = '2';
        }
        System.out.println("Grade = " + grade);
    }
}
