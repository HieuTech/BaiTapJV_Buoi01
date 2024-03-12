package com.rikkei.example;
import java.util.Scanner;

public class TinhChuViDienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("xin moi nhap chieu dai hinh chu nhat: ");
        float chieuDai = scanner.nextFloat();
        System.out.println("xin moi nhap chieu rong hinh chu nhat: ");
        float chieuRong = scanner.nextFloat();
        float dienTich = chieuRong * chieuDai;
        float chuVi = (chieuDai + chieuRong) *2;
        System.out.printf("Chu vi hinh chu nhat la: %.2f m \n", chuVi);
        System.out.printf("Dien Tich hinh chu nhat la: %.2f m2", dienTich);
    }
}
