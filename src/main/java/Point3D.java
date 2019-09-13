public class Point3D extends Point2D {
    private double z = 0.0f;

    public Point3D() {
    }
    public Point3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x,double y,double z) {
        super.setXY(x,y);
        this.z = z;
    }
    public double[] getXYZ() {
        double[] arr = {super.getX(),super.getY(),getZ()};
        return arr;
    }
    public String toString() {
        return "("+super.getX()+","+super.getY()+","+getZ()+")";
    }
}

class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.4,1.6);
        System.out.println(point2D);
        for (double e:point2D.getXY()
             ) {
            System.out.println(e);
        }
        System.out.println("\n");

        Point3D point3D = new Point3D(5.6,5.7,7.8);
        System.out.println(point3D);
        for (double e:point3D.getXYZ()
        ) {
            System.out.println(e);
        }
    }
}
