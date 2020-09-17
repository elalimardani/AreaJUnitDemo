import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class PointTest {
       Point point;

        @BeforeEach
        void init(){
     Point point = new Point(1,2);
        }

        @BeforeAll
        static void beforeAllInit(){
            System.out.println("Before all run");

        }
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