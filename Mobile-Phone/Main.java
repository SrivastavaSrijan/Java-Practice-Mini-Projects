package com.Srijan;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("962908 4494");


    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
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
                    printContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }
    }
    private static void addNewContact(){
        System.out.println("Enter Name: ");
        String names=sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone=sc.nextLine();
        Contact newContact=Contact.createContact(names,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added:\n Name = "  + names + ", Phone Number = "+ phone);
        }
        else{
            System.out.println("Can't add, name already on file");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name:");
        String name=sc.nextLine();
        Contact oldContact=mobilePhone.queryContact(name);
        if(oldContact==null){
            System.out.println("Not found!");
            return;
        }
        System.out.println("Enter new name: ");
        String newName=sc.nextLine();
        System.out.println("Enter new number: ");
        String newNumber=sc.nextLine();
        Contact newContact=Contact.createContact(newName,newNumber);
        mobilePhone.updateContact(oldContact,newContact);
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = sc.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Not found!");
            return;
        }
        if (mobilePhone.removeContact(oldContact)) {
            System.out.println("Deleted!");
        }
    }
    private static void queryContact() {
        System.out.println("Enter existing contact name:");
        String name = sc.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Not found!");
            return;
        }
        System.out.println("Name:"+oldContact.getName()+
                            "Phone Number:"+oldContact.getPhoneNumber());

    }



    private static void printContact(){
        mobilePhone.printContacts();

        }
    private static void startPhone(){
        System.out.println("Starting the phone...");
    }
    private static void printActions(){
        System.out.println("\nAvailable options:\nPress...");
        System.out.println("0 - to shutdown\n"+
                            "1 - to print a contact\n"+
                            "2 - to add a new contact\n"+
                            "3 - to update an existing contact\n"+
                            "4 - to remove an existing contact\n"+
                            "5 - query if contact exists\n"+
                            "6 - to print the list of options available\n");
        System.out.println("Enter 6 to display help!");
    }
}
