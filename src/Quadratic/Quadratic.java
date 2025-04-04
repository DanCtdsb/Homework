package Quadratic;

public class Quadratic {
    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public void getFactoredForm() {
    }

    public double[] getRoots() {
        double[] roots = new double[2];
        double discriminant = getDiscriminant();

        if (hasRealRoots()) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            if (discriminant > 0) {
                roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            }
        }
        return roots;
    }

    public void getStandardForm() {
        System.out.println("y = " + a + "x^2" + b + "x" + c);
    }

    public double[] getVertex() {
        double[] vertex = new double[2];
        vertex[0] = -b / (2 * a);
        vertex[1] = 
    }

    public void getVertexForm() {
        double[] vertex = getVertex();
        System.out.println("y = " + a + "(x - " + vertex[0] + "b" + "x" + c);

    }

    public double getXIntercept() {
        
    }

    public double getYIntercept() {
        
    }

    public boolean hasRealRoots() {
        if (getDiscriminant() > 0) {
            return true;
        }
        return false;
    }

    public boolean isMaximum() {
        
    }

    public void setA(double a) {
        
    }

    public void setB(double b) {

    }

    public void setC(double c) {

    }
}
