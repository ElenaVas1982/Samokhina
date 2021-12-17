public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        compareNumbers();


    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 2;
        int b = 3;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
         if (a >= b) {
             System.out.println("a >= b");
         } else {
             System.out.println("a < b");
         }

    }

    }