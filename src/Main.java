public class Main {
    public static void main(String[] args) {

        System.out.println("\nTack1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        {
            System.out.println("\nTack2");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
        }
        {
            System.out.println("\nTack3");
            for (int i = 0; i <= 17; i = i + 2) {
                System.out.println(i);
            }
        }
        {
            System.out.println("\nTack4");
            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }
        }
        {
            System.out.println("\nTack5");
            for (int i = 1904; i < 2096; i = i + 4) {
                System.out.println(i + " год является високосным");
            }
        }
        {
            System.out.println("\nTack6");
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.println(i);
            }
        }
        {
            System.out.println("\nTack7");
            for (int i = 1; i <= 512; i = i * 2) {
                System.out.println(i);
            }
        }
        {
            System.out.println("\nTack8");
            int savings = 29000;
            int sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum = sum + savings;
                System.out.println("Месяц " + i + ",сумма накоплений равна " + sum + " рублей");
            }
        }
        {
            System.out.println("\nTack9");
            int savings = 29000;
            int sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum = sum + (int) (sum * 0.01) + savings;
                System.out.println("Месяц " + i + ",сумма накоплений равна " + sum + " рублей");
            }
        }
        {
            System.out.println("\nTack10");
            for (int i = 1; i <= 10; i ++){
                System.out.println("2 * " + i + " = " + (2 * i));
            }

        }
    }
}