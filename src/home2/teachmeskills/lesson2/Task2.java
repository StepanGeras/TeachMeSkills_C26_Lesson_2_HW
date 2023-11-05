package home2.teachmeskills.lesson2;

public class Task2 {

    public static void main(String[] args) {

        int n = 26;
        int unit = n % 10;
        int tens = (n - unit) / 10;
        System.out.println(unit + tens);

    }

}
