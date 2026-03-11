
public class TestCircle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Circle c1 = new Circle();

	      System.out.println("Hình tròn có bán kính là: " 
	         + c1.getRadius() + "\nVà diện tích là: " + c1.getArea());

	      Circle c2 = new Circle(2.0);

	      System.out.println("Hình tròn bán kính là: " 
	         + c2.getRadius() + " \nVà diện tích là: " + c2.getArea());

	}

}
