package Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plane> planes = new ArrayList<Plane>(10);
        planes.add(new Plane(50));
        planes.add(new Plane(100));
        planes.add(new Plane(70));
        planes.add(new Plane(20));
        planes.add(new Plane(30));
        planes.add(new Plane(60));
        planes.add(new Plane(90));
        planes.add(new Plane(10));
        planes.add(new Plane(80));
        planes.add(new Plane(40));

        Collections.sort(planes);
        for (Plane plane : planes) {
            System.out.println(plane.getWingspan() + "m");
        }
    }
}
