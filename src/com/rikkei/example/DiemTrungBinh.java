package com.rikkei.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DiemTrungBinh {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap diem mon toan: ");
    float toan = scanner.nextFloat();
    System.out.println("Nhap diem mon van: ");
    float van = scanner.nextFloat();
    System.out.println("Nhap diem mon anh: ");
    float anh = scanner.nextFloat();
    float diemTrungBinh = (toan + van + anh) / 3;
    System.out.printf("Diem trung binh la: %.2f", diemTrungBinh );

    }
}