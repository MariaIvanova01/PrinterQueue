package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fileNamesAndCommands = scan.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();
        String firstQueue = "";

        while (!fileNamesAndCommands.equals("print")){
            if (fileNamesAndCommands.equals("cancel")){
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    firstQueue = queue.poll();
                    System.out.printf("Canceled %s%n",firstQueue);
                }
            }else{
                queue.offer(fileNamesAndCommands);
            }
            fileNamesAndCommands = scan.nextLine();
        }
        for (String el : queue) {
            System.out.println(el);
        }
    }
}
