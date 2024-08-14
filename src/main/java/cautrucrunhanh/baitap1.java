/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cautrucrunhanh;
import java.util.Scanner;
/**
 *
 * @author xuant
 */
public class baitap1 {
        public static void main(String[] args) {
        double a,b;
        String kq="";
        Scanner sc =new Scanner(System.in);
        System.out.println("====Giai Phuong Trinh====");
        System.out.print("Cho biet he so a:");
        a=sc.nextDouble();
        System.out.print("Cho biet he so b:");
        b=sc.nextDouble();

        if(a==0)
        {
            if (b==0) {
                kq="Phương trinh vo so nghiem";
            }else
            {
                kq="Phuong trinh vo nghiem";
            }
        }else{
            kq="Phuong trinh co nghiem x ="+ (-b/a);
        }

        System.out.println(kq);
    }
}
