package SptintSix.FirstTheme.Ex7_2;

import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] names = new String[items.length];
        String[] counts = new String[items.length];
        String[] prices = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            String[] itms = items[i].split(", ");
            names[i] = itms[0];
            counts[i] = (itms[1]);
            prices[i] = (itms[2]);
        }

        int maxName = findMaxLength(names);
        int maxCount = findMaxLength(counts);
        int maxPrice = findMaxLength(prices);

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-" + (maxName + 2) + "s" +
                    "%-" + (maxCount + 2) + "s" +
                    "%-" + (maxPrice + 2) + "s\n", names[i], counts[i], prices[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
