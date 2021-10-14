package com.stx;

public class thisex {
    public static void main(String[] args) {
        A01 a = new A01();
        double[] arr = {1.1, 2.2, 3.3};
        Double res=a.max(arr);
        if (res!=null){
            System.out.println("最大值是" + res);
        }else{
            System.out.println("输入的值不在知道范围内");
        }


    }
}

class A01 {
    public Double max(double[] arr) {
        if (arr !=null&&arr.length>0) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }else{
            return null;
        }
    }
}


