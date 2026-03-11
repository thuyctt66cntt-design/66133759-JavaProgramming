
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("bán kính là: " + c1.getRadius());
        System.out.printf("diện tích là: %.2f\n", c1.getArea());
        System.out.printf("chu vi là: %.2f\n", c1.getCircumference());
    }
}
