package TestDemo;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

class PSC{
    String name;
    int id;
    int dob;
    float gpa;
    String school;
}

class JSC{
    String name;
    int id;
    int dob;
    float gpa;
    String school;
}

class SSC{
    String name;
    int id;
    int dob;
    float gpa;
    String school;
}

class HSC{
    String name;
    int id;
    int dob;
    float gpa;
    String college;
}

class Others{
    String details;
}

//Arrays store to data
public class DemoManagement {
    static PSC[] psc = new PSC[2];
    static JSC[] jsc = new JSC[8];
    static SSC[] ssc = new SSC[10];
    static HSC[] hsc = new HSC[12];
    static Others[] others = new Others[10];

    public static void main(String[] args) {
        initializaData();
        displayMainMenu();
    }

    static void initializaData(){
        for (int i = 0; i < psc.length; i++) psc[i] = new PSC();
        for (int i = 0; i < jsc.length; i++) jsc[i] = new JSC();
        for (int i = 0; i < ssc.length; i++) ssc[i] = new SSC();
        for (int i = 0; i < hsc.length; i++) hsc[i] = new HSC();
        for (int i = 0; i < others.length; i++) others[i] = new Others();

        //Start Initialization Data All class
//PSC DATA START
        psc[0].name = "Toufiq";
        psc[0].id = 5186;
        psc[0].dob = 07;
        psc[0].gpa = 5.00f;
        psc[0].school = "San Moon International School";


        //End All Data
    }

    static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWELCOME TO OUR EDUCATION");
            System.out.println("========================");
            System.out.println("1. PSC Information");
            System.out.println("2. JSC Information");
            System.out.println("3. SSC Information");
            System.out.println("4. HSC Information");
            System.out.println("5. Other Information");
            System.out.println("0. Exit");
            System.out.println("\nEnter your choice: ");

            choice = sc.nextInt();
            switch (choice){
                case 1 -> displayPSC();

                case 2 -> displayJSC();
                case 3 -> displaySSC();
                case 4 -> displayHSC();
                case 5 -> displayOthers();
                case 0 -> System.out.println("\nExiting program... ");
                default -> System.out.println("\nInvalid choice! Please try again. ");
            }
        } while (choice != 0);
    }

    public static void setPsc(PSC[] psc) {
        DemoManagement.psc = psc;
    }
    
    static void displayPSC(){
        System.out.println("\nPSC INFORMATION");
        for (int i = 0; i < psc.length; i++){
            System.out.printf("%d. Name: %s%n", i +1, psc[i].name);
            System.out.printf("    Id: %d%n", psc[i].id);
            System.out.printf("    Date of Birth: %d%n", psc[i].dob);
            System.out.printf("    GPA: %.2f %n", psc[i].gpa);
            System.out.printf("    School: %s%n%n", psc[i].school);
        }
    }

    static void displayJSC(){
        System.out.println("\nJSC INFORMATION");
        for (int i = 0; i < jsc.length; i++){
            System.out.printf("%d. Name: %s%n", i +1, jsc[i].name);
            System.out.printf("    Id: %d%n", jsc[i].id);
            System.out.printf("    Date of Birth: %d%n", jsc[i].dob);
            System.out.printf("    GPA: %.2f %n", jsc[i].gpa);
            System.out.printf("    School: %s%n%n", jsc[i].school);
        }
    }

    static void displaySSC(){
        System.out.println("\nSSC INFORMATION");
        for (int i = 0; i < ssc.length; i++){
            System.out.printf("%d. Name: %s%n", i +1, ssc[i].name);
            System.out.printf("    Id: %d%n", ssc[i].id);
            System.out.printf("    Date of Birth: %d%n", ssc[i].dob);
            System.out.printf("    GPA: %.2f %n", ssc[i].gpa);
            System.out.printf("    School: %s%n%n", ssc[i].school);
        }
    }

    static void displayHSC(){
        System.out.println("\nHSC INFORMATION");
        for (int i = 0; i < hsc.length; i++){
            System.out.printf("%d. Name: %s%n", i +1, hsc[i].name);
            System.out.printf("    Id: %d%n", hsc[i].id);
            System.out.printf("    Date of Birth: %d%n", hsc[i].dob);
            System.out.printf("    GPA: %.2f %n", hsc[i].gpa);
            System.out.printf("    College: %s%n%n", hsc[i].college);
        }
    }

    static void displayOthers(){
        System.out.println("\nOTHERS INFORMATION");
        for (int i = 0; i < others.length; i++){
            System.out.printf("%d. Details: %s%n", i +1, others[i].details);

        }
    }
}


