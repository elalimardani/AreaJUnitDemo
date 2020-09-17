import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

        @Test
        void pointCreationTest(){
            Point point = new Point(1,2);
            int actualX = point.getX();
            assertEquals(1, actualX, "The x axis of point should retuen the value from point.getX method");
        }


}