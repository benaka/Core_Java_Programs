package com.ben.threads;

class PrintOddAndEvenInSequece
{
        private int number = 1;
        private final int MAX = 10; // change to print more numbers
        private boolean isOddTurn = true;

        // Print odd numbers
        synchronized void printOdd() {
            while (number <= MAX) {
                while (!isOddTurn) { // Wait for even thread
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                System.out.println("Odd Thread: " + number);
                number++;
                isOddTurn = false;
                notify(); // Wake up even thread
            }
        }

        // Print even numbers
        synchronized void printEven() {
            while (number <= MAX) {
                while (isOddTurn) { // Wait for odd thread
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                System.out.println("Even Thread: " + number);
                number++;
                isOddTurn = true;
                notify(); // Wake up odd thread
            }
        }
    }

    class OddEvenThread {
        public static void main(String[] args) {
            PrintOddAndEvenInSequece printer = new PrintOddAndEvenInSequece();

            // Thread for odd numbers
            Thread t1 = new Thread(() -> printer.printOdd());

            // Thread for even numbers
            Thread t2 = new Thread(() -> printer.printEven());

            t1.start();
            t2.start();
        }
    }
