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
public class baitap16 {
     public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();

        a = new int[n];

        nhapMang(a, sc);

        System.out.println("===Mang a=====");
        xuatMang(a);

        int tong = tinhTong(a);
        System.out.print("\nTong gia tri mang:" + tong);

        int dem_duong_le = demDuongLe(a);
        System.out.print("\nSo duong le co trong mang:" + dem_duong_le);
        int max = TimMax(a);
        System.out.print("\nPhan tu lon nhat:" + max);
    }

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static int tinhTong(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x; //s=s+x;
        }
        return sum;
    }

    public static int demDuongLe(int[] a) {
        int dem_duong_le = 0;
        for (int x : a) {
            if (x > 0 && x % 2 != 0) {
                dem_duong_le++;
            }
        }
        return dem_duong_le;
    }

    public static int TimMax(int[] a) {
        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
