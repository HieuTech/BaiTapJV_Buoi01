package com.rikkei.example;

import java.util.Scanner;

public class DinhDang {
    public static void main(String[] args) {

        System.out.printf(String.format(" %50s ", "DANH SACH SINH VIEN " + "\n"));
        String lineSeparator = "--------------------------------------------------------------" + "\n";
        System.out.printf(lineSeparator);
        String formatHeader = "| %-3s | %-20s | %-5s | %-10s | %-20s" + "\n";
        String formatRow = "| %-3s | %-20s | %-5s | %-10s | %-20s " + "\n";

        System.out.printf(formatHeader, "STT", "Ho va ten", "Tuoi", "So dien thoai", "email" );
        System.out.printf(lineSeparator);
        System.out.printf(formatRow, 1, "hieu", 15, "0934123123", "test@gmail.com");
        System.out.printf(lineSeparator);

    }
}
