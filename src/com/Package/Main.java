package com.Package;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name, position;
        double income, allowances, deductions = 0, totalIncome, OverTime;
        double tax, CSR, Charity, NetPay;
        int choice;
        double calculated_overtime;
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println(" PayRoll System          ");
        System.out.println("-------------------------------");
        System.out.println(" Enter Employee's Data \n \n");
        System.out.println(" Name : ");
        name = in.nextLine();
        System.out.println(" Position : ");
        position = in.nextLine();
        System.out.println(" Monthly Salary :");
        income = in.nextDouble();
        System.out.println(" Allowances :");
        allowances = in.nextDouble();
        System.out.println(" Overtime(in hours) : ");
        OverTime = in.nextDouble();
        calculated_overtime = 1000*OverTime;
        totalIncome = income + allowances + calculated_overtime;
        System.out.println(" TOTAL INCOME : INR " + totalIncome);
        System.out.println("\n\n---------------------------------");
        System.out.println(" D E D U C T I O N S ");
        System.out.println("-------------------------------------\n");
        System.out.println("Specify Tax Bracket \n\n");
        System.out.println("(1) Single (2) Married (3) Widow");
        System.out.println("\n\n Enter your choice: ");
        choice = in.nextInt();
        switch(choice){
            case 1:
                tax = totalIncome * .010;
                CSR = totalIncome * .05;
                Charity = totalIncome * .01;
                deductions = tax + CSR + Charity;
                System.out.println(" TAX Deduction : " + tax);
                System.out.println(" CSR Deduction : " + CSR);
                System.out.println(" Charity Deduction : " + Charity);
                System.out.println("\n\n Deductions : " + deductions);
            case 2:
                tax = totalIncome * .05;
                CSR = totalIncome * .05;
                Charity = totalIncome * .01;
                deductions = tax + CSR + Charity;
                System.out.println(" TAX Deduction : " + tax);
                System.out.println(" CSR Deduction : " + CSR);
                System.out.println(" Charity Deduction : " + Charity);
                System.out.println("\n\n Deductions : " + deductions);
            case 3:
                tax = totalIncome * .01;
                CSR = totalIncome * .05;
                Charity = totalIncome * .01;
                deductions = tax + CSR + Charity;
                System.out.println(" TAX Deduction : " + tax);
                System.out.println(" CSR Deduction : " + CSR);
                System.out.println(" Charity Deduction : " + Charity);
                System.out.println("\n\n Deductions : " + deductions);
            default:
                System.out.println("Error........................");
        }
        System.out.println("\n\n-----------------------------------");
        System.out.println(" Payroll Slip \n           ");
        System.out.println("--------------------------------------\n");
        System.out.println(" Name: " + name);
        System.out.println(" Position : " + position);
        System.out.println(" Monthly Salary : " + income);
        System.out.println(" Allowances : " + allowances);
        System.out.println(" OverTime : " + calculated_overtime);
        System.out.println(" Total Income : " + totalIncome);
        System.out.println("\n Total Deductions : " + deductions);
        NetPay = totalIncome - deductions;
        System.out.println("\n\n NetPay : INR " + NetPay);

    }
}
