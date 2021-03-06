package com.iroshnk.java.algo;

public class RectanglesOverlap {
    public static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        if (l1.x > r2.x || l2.x < r1.x) {
            return false;
        }
        if (l1.y > r2.y || l2.y < r1.y) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(doOverlap(new Point(0, 10), new Point(10, 0), new Point(5, 5), new Point(15, 0)));
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
