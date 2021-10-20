package ru.vsu.cs.kravtsova_n_e.task5;

public class Main {

    public static void main(String[] args) {

        printPicture(17, 15);
    }

    public static void printPicture(int h, int w) {
        int symbInLastRow = 1;
        int countOfSpaces = 0;
        int countOfSymb = 0;

        for (int i = 0; i < h; i++) {
            symbInLastRow += i-1;
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == (h - 1)) {
                    if (j == 0 || j == (w - 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    if (j == 0 || j == (w - 1)) {
                        System.out.print("|");
                    } else {
                        if (countOfSpaces != symbInLastRow) {
                            System.out.print(" ");
                            countOfSpaces++;
                        } else if (countOfSymb != i) {
                            System.out.print("!");
                            countOfSymb++;
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.print("\n");
            countOfSpaces = 0;
            countOfSymb = 0;
        }
    }
}

