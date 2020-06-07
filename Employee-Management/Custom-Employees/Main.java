package com.EmployeeCollections;
import java.util.Scanner;
import java.util.*;
public class Main<T extends EmployeeWipro>{
    private static List<TeamWipro> teamsInWipro=new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean quit = false;
        startEmployeeManagement();
        printActions();
        while (!quit) {
            System.out.println("\n\nEnter your option or enter 4 to display main menu.\n\n");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit=true;
                    break;
                case 1:
                    TeamWipro wT=addTeams();
                    teamsInWipro.add(wT);
                    break;
                case 2:
                    //fireEmployees;
                    break;
                case 3:
                    displayTeams();
                    break;
                case 4:
                    printActions();
                    break;

            }

        }
    }

    private static TeamWipro addTeams(){
        System.out.println("\nTeam Adder\n");
        System.out.println("Enter the name of the team: ");
        String teamName = sc.nextLine();
        TeamWipro wT=new TeamWipro(teamName);
        System.out.println("Enter the number of employees in the team: ");
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=num;i++) {
            System.out.println("\n\nNow adding employee number "+i+"\n\n");
            System.out.println("Enter the name of the Employee: ");
            String name = sc.nextLine();
            System.out.println("Enter the address: ");
            String add = sc.nextLine();
            System.out.println("Enter the mobile number: ");
            int mob = sc.nextInt();
            System.out.println("Enter the class of employee: \t1 for Fresher\t2 for Lead\t3 for Manager  ");
            int type = sc.nextInt();
            sc.nextLine();
            switch (type) {
                case 1:
                    System.out.println("Enter the college name the employee was hired from: ");
                    String colName = sc.nextLine();
                    ProjectEngineers pE = new ProjectEngineers(name, add, mob, colName);
                    wT.addEmployees(pE);
                    System.out.println("\nProject Engineer "+i+" "+ pE.getFirstName() + " " + pE.getLastName() + " has been added to team " + wT.getName()+"\n\n");
                    break;
                case 2:
                    System.out.println("Is the employee eligible for promotion?: ");
                    String ans = sc.nextLine();
                    boolean b=ans.equals("Yes")?true:false;
                    ProjectLeads pL = new ProjectLeads(name, add, mob, b);
                    wT.addEmployees(pL);
                    System.out.println("\nProject Lead "+i+" "+ pL.getFirstName() + " " + pL.getLastName() + " has been added to team " + wT.getName()+"\n\n");
                    break;
                case 3:
                    System.out.println("Enter his/her experience in years: ");
                    int exp = sc.nextInt();
                    sc.nextLine();
                    ProjectManagers pM = new ProjectManagers(name, add, mob, exp);
                    wT.addEmployees(pM);
                    System.out.println("\nProject Managers "+i+" "+ pM.getFirstName() + " " + pM.getLastName() + " has been added to team " + wT.getName()+"\n\n");
                    break;
            }

        }
        return wT;

    }
    public static void displayTeams(){
        for(TeamWipro name:teamsInWipro) {
            System.out.println("Details for " + name.getName());
            int size = name.getSize();
            List<EmployeeWipro> listOfEmps = name.getListOfEmp();
            System.out.format("%-5s%-15s%-15s%-15s%-15s", "SNo.", "Emp Name", "Department", "Mobile Number", "Address");
            System.out.println();
            for (int i = 1; i <= size; i++) {
                EmployeeWipro emp = listOfEmps.get(i-1);
                System.out.format("%-5s%-15s%-15s%-15s%-15s", i, emp.getFirstName() + emp.getLastName(), emp.getClass().getSimpleName(), emp.getMobileNumber(), emp.getAddress());
                System.out.println();
            }
        }
    }



    private static void startEmployeeManagement(){
        System.out.println("\n\n\nCreated by Srijan Srivastava.\nDisplaying main menu.\n\n\n");
    }
    private static void printActions(){
        System.out.println("\nAvailable options:\n");
        System.out.println("0 - Shutdown\n"+
                "1 - Add Employees\n"+
                "2 - Fire Employees\n"+
                "3 - Display Employees\n"+
                "4 - Print the list of options available\n");
    }
}
