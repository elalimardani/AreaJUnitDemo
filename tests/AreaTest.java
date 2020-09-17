import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AreaTest {

    @Test
    public void areaTestWithPositive(){
        Point a = new Point(15,15);
        Point b = new Point(23, 30);
        Point c = new Point(50, 25);

        double actualTestArea = Area.triangleArea(a,b,c);
        double expectedArea = 222.50;
        assertEquals(actualTestArea, expectedArea, "The method should return the area of the given triangle");
    }

    @Test
    public void areaTestWithZeroNegative(){
        Point a = new Point(-8 ,13);
        Point b = new Point(0, 30);
        Point c = new Point(11, 15);

        double actualTestArea = Area.triangleArea(a,b,c);
        double expectedArea = 153.50;
        assertEquals(actualTestArea, expectedArea, "The method should return the area of the given triangle");
    }

    @Test
    public void circleAreaWithPieNumTest(){
       // Area area = new Area();
        assertEquals(314.1592, Area.circleAreaWithPieNum(10), "Expected to Fail - Should return the area of a circle with a method that uses the PI number with 2 digits point.");
    }

    @Test
    public void circleAreaWithMathPI(){
       // Area area = new Area();
        assertEquals(314.1592653589793, Area.circleAreaWithMathPI(10), "Expected to Pass - Should return the area of a circle with a method that uses the math.PI class.");
    }
}
