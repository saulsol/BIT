package 반복문;

import java.io.IOException;
import java.util.Scanner;

public class StarWriter {

    private static void printDiamond() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("* ");
            }

            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void printTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    private static void printRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    private static void printPentagon() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            System.out.print("  ");
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    private static void printHourglass() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("* ");
            }

            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printBowTie() {

        for(int i=1, n=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                System.out.print(((j >=n+1) && (j <=10-n))? " " : "*");
            }
            if(i < 5) {
                n++;
            } else {
                n--;
            }
            System.out.println();
        }

    }

        public static void main (String[]args) throws IOException {

            Scanner sc = new Scanner(System.in);
            int choice;

            while (true) {
                System.out.println("어떤 것을 그릴까요? 1.마름모 2.삼각형 3.사각형 4.오각형 5.모래시계 6.나비넥타이 7.종료");
                choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) printDiamond();
                if (choice == 2) printTriangle();
                if (choice == 3) printRectangle();
                if (choice == 4) printPentagon();
                if (choice == 5) printHourglass();
                if (choice == 6) printBowTie();
                if (choice == 7) break;
            }


        }

    }
