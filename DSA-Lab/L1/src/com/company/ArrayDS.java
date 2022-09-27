package com.company;

public class ArrayDS {
    private int[] arr;
    private int count;
    private int size = 0;

    public ArrayDS(int length) {
        this.arr = new int[length];
    }

    public void insert(int item) {
        if (arr.length == count) {
            int[] newArr = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++] = item;
    }

//    public void print() {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public void arraySize() {
        for (int i = 0; i < count; i++) {
            size++;
        }
        System.out.println("Array Size: " + size);
    }

    public void search(int x) {
        int index = -1;
        boolean status = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                status = true;
            }
        }
        if (status) {
            System.out.println("Found at " + index);
        } else {
            System.out.println("Value Not Found.");
        }
    }
}
