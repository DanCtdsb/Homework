package Interface;

public class Plane implements Comparable<Plane> {
    private int wingspan;

    public Plane(int wingspan) {
        this.wingspan = wingspan;
    }

    public int compareTo(Plane plane) {
        return this.wingspan - plane.getWingspan();
    }

    public int getWingspan() {
        return wingspan;
    }
}
