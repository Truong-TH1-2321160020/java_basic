/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cauTrucLap;
import java.util.Scanner;
/**
 *
 * @author xuant
 */
public class baitap8 {
        public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Tinh tong day so :s=1+2+3+ ...+ n ====");
        System.out.print("Cho biet n:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong day so:" + sum);
    }
}
