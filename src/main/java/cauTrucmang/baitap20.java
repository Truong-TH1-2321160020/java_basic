/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cauTrucmang;
import java.util.Scanner;
/**
 *
 * @author xuant
 */
public class baitap20 {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] a;
        int n;
        Scanner Sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu (1 <= n <= 20): ");
        n = Sc.nextInt();

        // Kiểm tra điều kiện số phần tử
        if (n < 1 || n > 20) {
            System.out.println("So phan tu phai nam trong khoang 1 den 20.");
            return;
        }

        a = new int[n];

        // Nhập mảng số nguyên từ bàn phím
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = Sc.nextInt();
        }

        // Nhập số nguyên x
        System.out.print("Nhap so nguyen x: ");
        int x = Sc.nextInt();

        // Kiểm tra xem x có xuất hiện trong mảng không và vị trí đầu tiên
        int viTri = timViTriX(a, x);
        if (viTri != -1) {
            System.out.println("So " + x + " xuat hien trong mang tai vi tri: " + viTri);
        } else {
            System.out.println("So " + x + " khong xuat hien trong mang.");
        }

        // Kiểm tra mảng có tính chất tăng dần không
        if (kiemTraTangDan(a)) {
            System.out.println("Mang co tinh chat tang dan.");
        } else {
            System.out.println("Mang khong co tinh chat tang dan.");
        }
    }

    // Phương thức tìm vị trí đầu tiên của x trong mảng
    private static int timViTriX(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i; // Trả về vị trí đầu tiên của x
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy x
    }

    // Phương thức kiểm tra mảng có tính chất tăng dần không
    private static boolean kiemTraTangDan(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false; // Nếu có phần tử nào nhỏ hơn phần tử trước đó thì không phải tăng dần
            }
        }
        return true; // Nếu không có phần tử nào vi phạm điều kiện thì là tăng dần
    }
}
