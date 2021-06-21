/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class MyClass
{
    private static Object LOCK = new Object();
    public static void main(String[] args) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread " + Thread.currentThread().getName() + " is woken after sleeping for 1 second");
        synchronized(LOCK)
        {
            LOCK.wait(1000);
            System.out.println("Object " + LOCK + " is woken after " + "waiting for 1 second");
        }
    }
}
