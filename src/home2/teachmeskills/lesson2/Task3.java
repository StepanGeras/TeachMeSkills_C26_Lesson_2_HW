package home2.teachmeskills.lesson2;

public class Task3 {

    public static void main(String[] args) {

        int n = 126;
        int unit = n % 10;
        int tens = (n - unit) / 10 % 10;
        int hundred = (n - n % 100) / 100;
        System.out.println(tens + hundred + unit);

    }

}
