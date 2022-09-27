package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayDS arrayDS = new ArrayDS(3);

        arrayDS.insert(1);
        arrayDS.insert(2);
        arrayDS.insert(3);
        arrayDS.insert(4);

        arrayDS.print();
        arrayDS.arraySize();
        arrayDS.search(3);
    }
}
