import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер фигуры: ");
        int n = scanner.nextInt();

       for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {

               // System.out.print((i + j) % 2 == 0 ? "+ " : "- ");
            }
            System.out.println(); // после вывода строки нужно перейти на новую строку
        }



/*        for (int i = 0; i < n; i++) { // повторяет вывод строки на экран
            for (int j = 0; j <= i; j++){ // повторяет вывод * на экран
                System.out.print("* ");
            }
            System.out.println();
             }// после вывода строки нужно перейти на новую строку*/

        // Задание 2.1
/*        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // Задача 2.2
/*        for (int i = 0; i < n; i++) { // повторяет вывод строки на экран
            for (int j = 0; j < n; j++) { // повторяет вывод * на экран
                if (i <= j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }*/

        // Задача 2.3
/*        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                 if (j < n-i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }*/

        // Задача 2.5
  /*      for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0)
                        System.out.print("+");
                    else
                        System.out.print("-");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0)
                        System.out.print("-");
                    else
                        System.out.print("+");
                }
                System.out.println();
            }*/
      /*  for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            System.out.print("/");

            for (int j = 0; j < i*2; j++)
                System.out.print(" ");
            System.out.print("\\");
            System.out.println();
        }


        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++)
                System.out.print(" ");
                System.out.print("\\");

                for (int j = 0; j < (n-1-i)*2; j++)
                    System.out.print(" ");
                    System.out.print("/");
                    System.out.println();
                }*/
            }
}