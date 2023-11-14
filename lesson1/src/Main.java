import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        double rost = 175;
//        double okruzhnost = 60;
//
//        double resultMale = 64 - (20 * (rost/okruzhnost));
//        double resultFemale = 76 - (20 * (rost/okruzhnost));
//
//        System.out.println(resultMale);
//        System.out.println(resultFemale);

        //lesson 2
//        double num1 = 3.0;
//        double num2 = 4.0;
//        double average = (num1+num2)/2;
//
//        System.out.println("арифмитическая середина " + average);
//
//        num1 = 5.0;
//        num2 = 2.0;
//        double ostatok = num1 % num2;
//        System.out.println("остаток при делении " + ostatok);

        // lesson 4
        //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
//        int [] array = new int[100];
//
//        for (int i = 1; i < (array.length);i+=2){
//            array[i] = i;
//            System.out.print("["+array[i] + "]");
//        }
//
//        //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
//        System.out.println("\n\nзадание 2");
//        int [] array2 = new int[21];
//
//        for (int i = 2; i < array2.length; i++){
//            array2[i] = i;
//            if (i%2==0){
//                System.out.print("["+array2[i]+"]");
//            }
//        }
//
//        //Создайте  массив из всех чётных чисел от 2 до 20 и выведите на экран сумму всех элементов
//        System.out.println("\n\nзадание 3\nСоздайте массив из всех чётных чисел от 2 до 20 и выведите на экран сумму всех элементов:");
//        int [] array3 = new int[21];
//        int sum=0;
//
//        for (int i = 2; i < array3.length; i++){
//            sum += i;
//            array3[i] = sum;
//
//            System.out.println("сумма "+i+" - элементов массива равна "+array3[i]);



        //}

//        Scanner scanner = new Scanner("введите число");
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int arrai[][];
//        for(int i = 0; i<= m)
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int[][] array = new int[m][n];
//
//        for(int i = 0; i < m; i++){
//            for (int j = 0; j < n; j++){
//                array[i][j] = scanner.nextInt();
//            }
//        }
//
//        int x = 0, y = 0;
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                if (array[i][j] == 0) {
//                    x = i + 1;
//                    y = j + 1;
//                }
//                //System.out.println(x + " " + y);
//            }
//        }
//        System.out.println("Zero position: " + x + " " + y);
//        // Position of "-1".
//        int coloumn = -1, row = -1;
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                if (array[i][j] == -1) {
//                    coloumn = i + 1;
//                    row = j + 1;
//                }
//
//            }
//        }
//        System.out.println("Minus One position: " + coloumn +" "+row);

        //You given two two-dimention arrays.
        // Your task is to sum each element of the given matrixes to the third one,and output result matrix.
//        int num = scanner.nextInt();
//        int[][] arr1 = new int[num][num];
//        int[][] arr2 = new int[num][num];
//        int[][] sumarr = new int[num][num];
//        for (int i = 0; i < num; i++){
//            for(int j = 0; j < num; j++){
//                arr1[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < num; i++){
//            for(int j = 0; j < num; j++){
//                arr2[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < num; i++){
//            for (int j = 0; j < num;j++){
//                sumarr[i][j] = arr1[i][j] + arr2[i][j];
//                System.out.print("["+sumarr[i][j]+"] ");
//            }
//            System.out.println();
         //lesson 6
//        Scanner scanner = new Scanner(in);
//           int a = scanner.nextInt();
//           int b = scanner.nextInt();
//           //String operation = scanner.next();
//           System.out.println("plus operation "+func_Addition(a, b));
//           System.out.println("multiplication "+func_Multiplication(a, b));
//           System.out.println("division "+func_Division(a, b));
//           System.out.println("minus "+func_Minus(a, b));

        // lesson 7
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rounds; i++) {
            playRockPaperScissors(scanner);
        }

    }

    static void playRockPaperScissors(Scanner scanner) {
        // Getting input from the user
        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        // Print results
        result(playerMove, computerMove);
    }

    static void result(String player, String computer){
        if (player.equals(computer)) {
            System.out.println("It's a draw!");
        } else if (playerWins(player, computer)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }


//        static int func_Addition(int a, int b){
//            return a + b;
//    }
//        static int func_Multiplication(int a, int b){
//            return a * b;
//        }
//
//        static int func_Division(int a, int b){
//            return a / b;
//        }
//
//        static int func_Minus(int a, int b){
//            return a - b;
//        }
}
}

