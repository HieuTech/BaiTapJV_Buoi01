package com.rikkei.example;
import java.util.Scanner;

public class TinhBinhPhuong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi nhap gia tri: ");
        double value = scanner.nextDouble();
        double binhPhuong = Math.pow(value, 2);
        double lapPhuong = Math.pow(value, 3);
        System.out.printf("Gia tri binh phuong: %.2f", binhPhuong);
        System.out.printf("Gia tri lap phuong: %.2f", lapPhuong);
    }
}
