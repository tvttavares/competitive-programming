package Arcade.Intro.Edge_of_the_Ocean;

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
