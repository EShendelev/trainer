package SptintSix.FirstTheme.ex6_1;

import java.util.Arrays;

public class Grades {

    public static void main(String[] args) {
        gradeBeautifier("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");
    }

    private static String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private static String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public static void gradeBeautifier(String grades) {
			 // реализуйте метод здесь
        String[] gradesArr = grades.toLowerCase().split(";");
        for (String str : gradesArr) {
            String[] arr = str.split(",");
            System.out.printf("%s %s %s — %s\n", capitalize(arr[0]), capitalize(arr[1]), arr[2], gradeToString(arr[3]));
        }
    }


}
