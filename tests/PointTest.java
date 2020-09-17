import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

        @Test
        void pointCreationTestX(){
            Point point = new Point(1,2);
            int actualX = point.getX();
            assertEquals(1, actualX, "The x axis of point should return the value from point.getX method");
        }

         @Test
         void pointCreationTestY(){
            Point point = new Point(1,2);
            int actualY = point.getY();
            assertEquals(1, actualY, "The Y axis of point should return the value from point.getY method");
            assertEquals(2, actualY, "The Y axis of point should return the value from point.getY method");
        }

}