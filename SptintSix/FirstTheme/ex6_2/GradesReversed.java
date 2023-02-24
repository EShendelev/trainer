package SptintSix.FirstTheme.ex6_2;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {


    public static void main(String[] args) {
        System.out.println(serializeGrades(new String[]{"Вероника Чехова физика — Безупречно", "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"}));
    }

    private static String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public static String serializeGrades(String[] grades) {

        List<String> arrStr = new ArrayList<>();
        for (String str : grades) {
            String[] arr = str.split(" ");
            String line = String.join(",", arr[0].toLowerCase(), arr[1].toLowerCase(), arr[2], gradeStringToInt(arr[4]));
            arrStr.add(line);
        }
        String res = String.join(";", arrStr);
        return res;
    }
}
