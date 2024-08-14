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
public class baitap2 {
    public static void main(String[] args) {
        double toan,van,anh;
        double dtb;
        Scanner sc=new Scanner(System.in);
        System.out.println("====Xet hoc luc====");
        System.out.println("Cho biet diem toan:");
        toan = sc.nextDouble();
        System.out.println("Cho biet diem van:");
        van=sc.nextDouble();
        System.out.println("Cho biet diem anh:");
        anh=sc.nextDouble();
        dtb=(toan+van+anh)/3;
        String kq="";
        if(dtb<=4){
            kq="Yeu";
        }else if(dtb<=6.5){
            kq="Trung binh";
        }else if(dtb<=8){
            kq="Kha";
        }else{
            kq="Gioi";
        }
        System.out.println("DTB: "+ dtb+ "-Hoc Luc: "+ kq);
    }
}
