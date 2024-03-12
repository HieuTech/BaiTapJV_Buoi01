package com.rikkei.example;
import java.util.Scanner;
public class ChuyenDoiTienTe {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ti Gia USD TO VND ");
                System.out.println("Xin moi nhap gia tri: ");
                float input = scanner.nextFloat();
                float value = input * 23000;
                System.out.printf("Ti gia la: %.2f", value);
        }


}
