package SprintFour.ThirdTheme.Ex6;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double res = 0;
        for (MediaItem item : mediaItems) {
            if (item instanceof Series) {
                res += (double)(((Series) item).getSeriesCount() * item.getRuntime()) / (60*24);
            } else {
                res += (double) item.getRuntime() / (60*24);
            }
        }
        return res;
    }

}