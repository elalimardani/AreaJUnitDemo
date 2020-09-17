import java.util.Scanner;

public class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter point.x");
        setX(scanner.nextInt());
        System.out.println("Please enter point.y");
        setY(scanner.nextInt());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
