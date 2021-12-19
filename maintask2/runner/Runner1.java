package com.teachmeskills.lesson_6.maintask.maintask2.runner;
import com.teachmeskills.lesson_6.maintask.maintask2.accountant.Accountant;
import com.teachmeskills.lesson_6.maintask.maintask2.director.Director;
import com.teachmeskills.lesson_6.maintask.maintask2.worker.position.Worker;

public class Runner1 {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();
        System.out.println(worker.getprinted("worker"));
        System.out.println(accountant.getprinted("accountant"));
        System.out.println(director.getprinted("director"));

    }
}
