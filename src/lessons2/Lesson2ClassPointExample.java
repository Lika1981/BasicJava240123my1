package lessons2;

import java.awt.*;

public class Lesson2ClassPointExample {

    public static void main(String [] args){
        int a = 5;

        Point point = new Point();

        point.xCoordinate = 1;
        point.yCoordinate = 5;
        point.comment = "New point #1";

        Point point2 = new Point();
        point2.xCoordinate = 10;
        point2.yCoordinate = 25;
        point2.comment = "Second point";

        System.out.println(point.comment + " " + point.xCoordinate + " " + point.yCoordinate);
        System.out.println(point2.comment +" " + point2.xCoordinate + " " + point2.yCoordinate);



    }
}
