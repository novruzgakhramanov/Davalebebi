davaleba 4
public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 8);
        int x = point.getX();
        int y = point.getY();
        System.out.println("The coordinates of the point are: (" + x + ", " + y + ")");
    }
}
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
    pasuxi The coordinates of the point are: (5, 8)


        davaleba 5
public class Main {
    public static void main(String[] args) {
        Section section = new Section(2, 3, 5, 7);
        double length = section.getLength();
        System.out.println("The length of the section is: " + length);
    }
}
class Section {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Section(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

    pasuxi The length of the section is: 5.0



        davaleba 6
public class Main {
    public static void main(String[] args) {
        RectangularParallelepiped parallelepiped = new RectangularParallelepiped(3, 4, 5);
        int volume = parallelepiped.getVolume();
        System.out.println("The volume of the parallelepiped is: " + volume);
    }
}
class RectangularParallelepiped {
    private int a;
    private int b;
    private int h;

    public RectangularParallelepiped(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getVolume() {
        return a * b * h;
    }
}
    pasuxi The volume of the parallelepiped is: 60