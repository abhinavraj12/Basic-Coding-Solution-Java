package Find.Area;

public class AreaTest {
	public static void main(String args[]) {
		
		Square s = new Square();	
		Rectangle r = new Rectangle();
		Parallelogram p = new Parallelogram();
	
		System.out.println("Area of Square :" +s.areaOfSquare(8));
		System.out.println("Area of Rectangle :"+r.areaOfRectangle(4, 8));
		System.out.println("Area of Parallelogram :"+p.areaOfParallelogram(4, 8));
	}
}
