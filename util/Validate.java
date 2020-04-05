/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class Validate {

    public String checkEmpty() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("khong duoc de trong.Moi nhap lai!");
                continue;
            }
            return input;
        }
    }

    /**
     * co 2 cach dung 1 la try catch hai dung regex
     */
    //diem thi chi la tu 0 - 10
    // 100
    //truong hop nhap diem truyen min : 0 truyen max la 10
    //truong hop validate so thoi : -100 den 100 
    public float checkFloat(float min, float max) {
        Scanner sc = new Scanner(System.in);
        float number = 0;
        while (true) {
            String stringNumber = new Validate().checkEmpty();

            if (stringNumber.matches("[0-9]+")) {
                number = Float.valueOf(stringNumber);
                if (number < min || number > max) {
                    System.out.println("Diem thi toi da tu 0-10 va khong duoc nhap chu.Moi ban nhap lai!");
                    continue;
                }
                return number;
            } else {
                System.out.println("Diem thi toi da tu 0-10 va khong duoc nhap chu.Moi ban nhap lai!");
            }
        }

    }

  public String checkString() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            // name nafy chi bien tam thoi de kiem tra
            String name = new Validate().checkEmpty();
            if (name.matches("[a-z A-Z]+")) {

                return name;
            } else {
                System.out.println(" Day la ten khong duoc nhap so hay ki tu dac biet.Moi nhap lai");
            }

        }

    }

    public String checkNgaySinh() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String ngaySinh = new Validate().checkEmpty();
            if (ngaySinh.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {

                return ngaySinh;
            } else {
                System.out.println(" Day la ngay sinh xin hay nhap nhu huong dan.Moi nhap lai");
            }

        }

    }

    public static void main(String[] args) {
        float a = new Validate().checkFloat(0, 10);
      
    }
}
