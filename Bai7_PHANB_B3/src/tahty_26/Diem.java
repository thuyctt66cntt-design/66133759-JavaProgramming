package tahty_26;

public class Diem {
	 private double x;
	    private double y;

	    // Constructor mặc định (0,0)
	    public Diem() {
	        this.x = 0;
	        this.y = 0;
	    }

	    // Constructor có tham số
	    public Diem(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    // Getter & Setter
	    public double getX() {
	        return x;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    // Tính khoảng cách giữa 2 điểm
	    public double tinhKhoangCach(Diem d) {
	        return Math.sqrt(Math.pow(this.x - d.x, 2) +
	                         Math.pow(this.y - d.y, 2));
	    }

	    // Kiểm tra trùng nhau
	    public boolean kiemTraTrungNhau(Diem d) {
	        return this.x == d.x && this.y == d.y;
	    }

	    // Đối xứng qua gốc tọa độ
	    public Diem doiXungQuaGoc() {
	        return new Diem(-this.x, -this.y);
	    }

	    // Hiển thị
	    public void hienThi() {
	        System.out.println("(" + x + ", " + y + ")");
	    }
	}

