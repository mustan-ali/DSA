public class Main {
    public static void main(String[] args) {

        //Queue FIFO

//        Linear Queue
//        QueueDSArray qa = new QueueDSArray(5);
//        qa.enqueue(1);
//        qa.enqueue(2);
//        qa.enqueue(3);
//        qa.enqueue(4);
//        qa.enqueue(5);

//        qa.printQueue();
//        qa.dequeue();
//        qa.printQueue();
//        qa.max();
//        qa.min();
//        qa.product();
//        qa.average();
//        qa.find(20);s
//        qa.even();
//        qa.odd();


        CircularQueue cq=new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);


        cq.dequeue();
        cq.dequeue();

        cq.enqueue(1);
        cq.enqueue(2);

        cq.printQueue();
    }

}