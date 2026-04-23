package thigk2_ChuThiThanhThuy;

import java.io.*;
import java.util.*;

public class DocFile {

    public static void main(String[] args) {
        ArrayList<Double> danhSach = new ArrayList<>();
        String fileName = "data.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                double so = Double.parseDouble(line);
                danhSach.add(so);
            }
            br.close();

            System.out.println("Danh sach cac so:");
            for (double x : danhSach) {
                System.out.println(x);
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap X (ngay sinh): ");
            double X = sc.nextDouble();

            boolean timThay = false;
            for (double x : danhSach) {
                if (x == X) {
                    timThay = true;
                    break;
                }
            }

            if (timThay) {
                System.out.println("X co trong danh sach");
            } else {
                System.out.println("X khong co trong danh sach");
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Loi doc file!");
        }
    }
}
