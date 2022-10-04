public class Main {
    public static void main(String[] args) {
        ArrayDS arrayDS = new ArrayDS(5);

        arrayDS.insert(1);
        arrayDS.insert(2);
        arrayDS.insert(3);
        arrayDS.insert(4);
        arrayDS.insert(5);

        arrayDS.print();
        arrayDS.removeAt(2);
        arrayDS.print();

        arrayDS.indexOf(4);
        arrayDS.indexOf(9);

        arrayDS.maxValue();
        arrayDS.minValue();

        arrayDS.productVal();
        arrayDS.averageVal();
        arrayDS.reversePrint();

        arrayDS.printOdd();
        arrayDS.printEven();

        arrayDS.replaceValue(2, 9);
        arrayDS.print();

        arrayDS.swapVal(0, 1);
        arrayDS.print();
    }
}