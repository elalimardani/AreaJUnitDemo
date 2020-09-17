public class Area {
    public Area() {
    }

    public static double triangleArea(Point a, Point b, Point c) {
        double area = (double)((float)(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2.0F);
        return Math.abs(area);
    }

//    public static int rectangleArea(Point a, Point b, Point c, Point d){
//        int
//    }
}
