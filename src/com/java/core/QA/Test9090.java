package com.java.core.QA;

public class Test9090 implements Runnable {

    private static Test9090 test = null;

    private Test9090() {

    }

    public static synchronized Test9090 getInstnce() {
        if (test == null) {
            test = new Test9090();
        } else {
            return test;
        }
        System.out.println(Thread.currentThread() + " " + test.hashCode());
        return test;

    }

    @Override
    public void run() {
        synchronized (test) {
            
        }
        System.out.println(Thread.currentThread() + " " + test.hashCode());
    }

    public void printCard(String s, Test9090 test) throws InterruptedException {
        System.out.println(Thread.currentThread() + " "+ s);
        test.wait();
        System.out.println(s);
    }

    public static void main(String[] args) throws InterruptedException {
        Test9090 test1 = Test9090.getInstnce();
        Test9090 test2 = Test9090.getInstnce();
        Test9090 test3 = Test9090.getInstnce();

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        Thread t3 = new Thread(test3);

        t1.start();
        t2.start();
        t3.start();

        test1.printCard("Print me first t1", test2);
        test2.printCard("Print me first t1", test3);
        test3.printCard("Print me first t1", test1);
        // Thread t4 = new Thread(test2);
        // Thread t5 = new Thread(test3);
        // Thread t6 = new Thread(test3);

        // t4.start();
        // t5.start();
        // t6.start();

        // System.out.println("t1 : " + test1.hashCode() + " t2 : " + test2.hashCode()+
        // " t3 : " + test3.hashCode());

    }

}
