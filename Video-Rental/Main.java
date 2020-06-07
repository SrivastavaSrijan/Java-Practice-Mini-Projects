package com.VideoRental;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static VideoStore videoStore= new VideoStore("B37 Swami Nagar, New Delhi");
    static{
        System.out.println("Created by Srijan Srivastava. Displaying main menu....");
    }
    public static void main(String[] args) {
        boolean quit = false;
        startVideoLauncher();
        printActions();
        while (!quit) {
            System.out.println("\nEnter your option?");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit=true;
                    break;

                case 1:
                    addVideo();
                    break;
                case 2:
                    doCheckOut();
                    break;
                case 3:
                    doReturn();
                    break;
                case 4:
                    receiveRating();
                    break;
                case 5:
                    listInventory();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }
    }
    private static void addVideo(){
        System.out.println("Enter the name of the video you wish to add: ");
        String str=sc.nextLine();
        System.out.println("Enter the rating of the video: ");
        int rate=sc.nextInt();
        videoStore.addVideo(str,rate);
    }
    private static void doCheckOut(){
        System.out.println("Enter the name of the video you wish to check-out: ");
        String str=sc.nextLine();
        videoStore.doCheckout(str);
    }
    private static void doReturn(){
        System.out.println("Enter the name of the video you wish to return: ");
        String str=sc.nextLine();
        videoStore.doReturn(str);
    }
    private static void receiveRating(){
        System.out.println("Enter the name of the video you wish to rate: ");
        String str=sc.nextLine();
        System.out.println("Enter the rating of the video: ");
        int rate=sc.nextInt();
        videoStore.receiveRating(str,rate);
    }
    private static void listInventory(){
        System.out.format("%-15s%-15s%-15s%-15s","Video No.","Video Name","Available?","Rating");
        System.out.println();
        videoStore.listInventory();
    }



    private static void startVideoLauncher(){
        System.out.println("Starting the Video Launcher...");
    }
    private static void printActions(){
        System.out.println("\nAvailable options:\nPress...");
        System.out.println("0 - to shutdown\n"+
                "1 - Add Video\n"+
                "2 - Check Out Video\n"+
                "3 - Return a video\n"+
                "4 - Receive Rating\n"+
                "5 - List the inventory\n"+
                "6 - Print the list of options available\n");
        System.out.println("Enter 6 to display help!");
    }
}
