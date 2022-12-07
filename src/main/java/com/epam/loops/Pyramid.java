package com.epam.loops;

public class Pyramid {

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

    public void printPyramid(int cathetusLength) {
//        for (int i = 1; i <= cathetusLength; i++) {
//            for (int j = 0; j < cathetusLength - i; j++) {//create initial space for pyramid shape
//                System.out.print(" ");
//            }
//            for (int k = i; k >= 1; k--) {//inner for loops
//                System.out.print(k);//create left half
//            }
//            for (int l = 2; l <= i; l++) {
//                System.out.print(l);    //create right half
//            }
//            for(int d = cathetusLength - i; d >= 1; d--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 1; j < cathetusLength; j++) {
                if (j + 1 > i) {
                    System.out.print("");
                } else {
                    System.out.print(j + 1);
                }
            }
            System.out.println();
        }
    }

}
