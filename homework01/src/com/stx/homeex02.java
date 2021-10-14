package com.stx;

public class homeex02 {
    public static void main(String[] args) {
        int[] arr01 = {15, 45, 69, 73};
        A03 a03 = new A03();
        int []arr02=a03.copyArr(arr01);
        for (int i=0;i<arr02.length;i++){
            System.out.println(arr02[i]);
        }
    }
}


class A03 {
    public int[] copyArr(int[] arr01) {
        int[] arr02 = new int[arr01.length];
        for (int i = 0; i < arr01.length; i++) {
            arr02[i] = arr01[i];
        }
        return arr02;
    }
}