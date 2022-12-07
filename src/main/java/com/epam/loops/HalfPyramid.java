package com.epam.loops;

public class HalfPyramid {

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (i + j <= cathetusLength) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
