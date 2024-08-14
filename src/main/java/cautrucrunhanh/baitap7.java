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
public class baitap7 {
     public static void main(String[] args) {
        double thang,nam;
        double songay;
        Scanner sc=new Scanner(System.in);
        System.out.println("====Chuong Trinh Tinh So Ngay Cua Thang====");
        System.out.print("Cho biet thang:");
        thang=sc.nextInt();
        System.out.print("Cho biet nam:");
        nam=sc.nextInt();
        if (thang==1 || thang==3 ||thang==5 ||thang==7 ||thang==8 ||thang==10 ||thang==12) {
            songay=31;
        }else if (thang==4 ||thang==6 ||thang==9 ||thang==11) {
                songay=30;
        }else{
            if (nam%4==0) {
            songay=29;
        }else{
            songay=28;    
            }
        }

        System.out.print("Thang " + thang + " co " + songay + " ngay");
    }
}
