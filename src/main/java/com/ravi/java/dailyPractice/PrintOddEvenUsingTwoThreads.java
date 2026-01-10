package com.ravi.java.dailyPractice;

public class PrintOddEvenUsingTwoThreads {
    private int number = 1;
    private final int MAX = 10;
    static void main() throws InterruptedException {

        PrintOddEvenUsingTwoThreads printOddEvenUsingTwoThreads = new PrintOddEvenUsingTwoThreads();
        Thread oddThread = new Thread(printOddEvenUsingTwoThreads::printOdd, "OddThread");
        Thread evenThread = new Thread(printOddEvenUsingTwoThreads::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();

    }
    public synchronized void printOdd(){

        while(number<=MAX){
            while(number%2==0) { // Wait if the number is odd
                try {
                    wait();
                    System.out.println("ODD::"+number++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            notify();
        }
    }
    }
    public synchronized void printEven() {
        while(number<=MAX){
            while(number%2 !=0) {
                try {
                    wait();
                    System.out.println("EVEN::"+number++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            notify();
        }
    }}
}
