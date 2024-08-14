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
public class baitap17 {
       public static void main(String[] args) {
        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();

        a = new double[n];

        nhapMang(a, sc);

        System.out.println("===Mang a=====");
        xuatMang(a);

        double tb = tinhTb(a);
        System.out.print("\nGia tri trung binh:" + tb);
        double min = timMin(a);
        System.out.print("\nGia tri nho nhat:" + min);
    }

    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]:");
            a[i] = sc.nextDouble();
        }
    }
    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
    }
    public static int tinhTb(double[] a) {
        double sum = 0;
        for (double x : a) {
            sum=(sum += x)/x; //s=s+x;
        }
        return (int) sum;
    }
    public static int timMin(double[] a) {
        double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return (int) min;
    }
}
