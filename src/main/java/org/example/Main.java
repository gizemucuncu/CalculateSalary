package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışan adını girin: ");
        String name = scanner.next();

        System.out.print("Çalışan maaşını girin: ");
        double salary = scanner.nextDouble();

        System.out.print("Çalışanın çalışma saatini girin: ");
        int workHours = scanner.nextInt();

        System.out.print("Çalışanın işe başlangıç tarihini girin: ");
        int hireYear = scanner.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);

        System.out.println(employee);
    }
}