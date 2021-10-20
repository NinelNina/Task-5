package ru.vsu.cs.kravtsova_n_e.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите высоту изображения (h >= 3): h = ");
        int h = input.nextInt();

        System.out.print("Введите ширину изображения (w >= 3): w = ");
        int w = input.nextInt();

        printPicture(h, w);
    }

    public static void printPicture(int h, int w) {
        int symbInLastRow = 0;
        int countOfSpaces = 0;
        int countOfSymb = 0;
        int numberOfSymb = 1;
        int symbLeft = 0;
        boolean isOnNewRow = false;

        for (int i = 0; i < h; i++) {
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
                        if(!isOnNewRow) {
                            if (countOfSpaces != symbInLastRow) {
                                System.out.print(" ");
                                countOfSpaces++;
                            } else if (countOfSymb != numberOfSymb) {
                                System.out.print("!");
                                countOfSymb++;
                            } else {
                                System.out.print(" ");
                            }
                            if (j == (w-2)) {
                                if (symbInLastRow + numberOfSymb > w - 2) {
                                    isOnNewRow = true;
                                    symbLeft = numberOfSymb - countOfSymb;
                                }
                                else{
                                    numberOfSymb++;
                                }
                            }
                        }
                        else{
                            if (countOfSymb != symbLeft){
                                System.out.print("!");
                                countOfSymb++;
                            }
                            else {
                                System.out.print(" ");
                                if (j == (w-2)){
                                    isOnNewRow = false;
                                    numberOfSymb++;
                                }
                            }
                        }
                    }
                }
            }
            System.out.print("\n");
            symbInLastRow = countOfSpaces + countOfSymb;
            countOfSpaces = 0;
            countOfSymb = 0;
        }
    }
}

