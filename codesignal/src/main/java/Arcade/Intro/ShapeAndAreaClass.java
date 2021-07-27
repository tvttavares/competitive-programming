package Arcade.Intro;

public class ShapeAndAreaClass {

    public static int shapeArea(int n) {
        int area = 1;
        while (n > 1) {
            area += (n - 1) * 4;
            n--;
        }
        return area;
    }
}
