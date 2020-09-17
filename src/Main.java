import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Let's get your points, how many points would you like to define? At this time, answer can be a number between 3 and 5.\n");
        Scanner scanner = new Scanner(System.in);

        int pointNum = scanner.nextInt();

        switch (pointNum){
            case 3:
                System.out.println("You shape is a triangle, let's calculate the area of your shape");
                Point a = new Point();
                Point b = new Point();
                Point c = new Point();
                System.out.println("Your points are: \na.x= " + a.getX() + "\na.y= " + a.getY() + "\nb.x= " + b.getX() + "\nb.y= " + b.getY() + "\nc.x= " + c.getX() + "\nc.y= " + c.getY());
                System.out.println("The area of your defined triangle is: " + Area.triangleArea(a,b,c));
                break;

            case 4:
                System.out.println("Your shape is a rectangle");
                break;
        }



    }
}
