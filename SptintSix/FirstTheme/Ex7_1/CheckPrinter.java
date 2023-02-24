package SptintSix.FirstTheme.Ex7_1;

import java.util.Scanner;

public class CheckPrinter {

    public static void printCheck(String[] items) {
        for (String item: items) {
            String[] info = item.split(", ");

            System.out.printf("%-10s%-7s%8s\n", info[0], info[1], info[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
