package td1;

public class Main {

	public static void main(String[] args) {
	    Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        
        LineSegment segment = new LineSegment(point1, point2);

        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println("Distance entre les points : " + point1.distanceTo(point2));
        System.out.println("Longueur du segment : " + segment.length());

        // Translation du point1
        Point translatedPoint = point1.translate(2, 3);
        System.out.println("Point 1 après translation : (" + translatedPoint.getX() + ", " + translatedPoint.getY() + ")");
    }

}
