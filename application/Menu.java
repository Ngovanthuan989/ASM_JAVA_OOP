/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ADMIN
 */
import java.io.IOException;
import java.util.Scanner;
import modelw.StudentModel;
import util.file_of_Student;
public class Menu {
     static Scanner in = new Scanner(System.in);

    public static void ShowMenu()throws IOException {
        String choice;
        while (true) {
            System.out.println("  --- Chào mừng đến với VTC Academy ---");
            System.out.println(" ========================================");
            System.out.println("1. Quản lý danh sách sinh viên");
            System.out.println("2. Quản lý lớp học");
            System.out.println("3. Quản lý điểm thi");
            System.out.println("0. Thoát");
            System.out.println(" ========================================");
            System.out.print("Moi nhap : ");
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    quanLiSinhVien();
                    break;
                case "2":
                    quanLiLop();
                    break;
                case "3":
                    quanLiDiemThi();
                    break;
                case "0":
                  
                    break;
                default:
                    System.out.println("There is no function for this!");
                    break;
            }

        }

    }

    public static void quanLiSinhVien() throws IOException{
        String choice ;
        while (true) {
            System.out.println("=======================================");
            System.out.println("Quản lý danh sách sinh viên");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Cập nhật thông tin sinh viên");
            System.out.println("3. Thêm mới một sinh viên");
            System.out.println(" 0. Trở về menu chính");
            System.out.println("=======================================");
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    StudentModel.ShowInfor();
                    in.nextLine();
                    break;
                case "2":
                    StudentModel.updateStudent();

                    break;
                case "3":
                    StudentModel.addNewStudents();
                    break;
                case "0":
                    ShowMenu();
                    break;

                default:
                    System.out.println("There is no function for this!");
                    break;
            }
        }

    }

    public static void quanLiLop() throws IOException {
        String choice;
        file_of_Student.rFileStudent();
        while (true) {
            System.out.println("=======================================");
            System.out.println(" Quản lý lớp");
            System.out.println("1. Xem danh sách lớp");
            System.out.println("2. Cập nhật thông tin lớp");
            System.out.println("3. Thêm mới một lớp");
            System.out.println("0. Trở về menu chính");
            System.out.println("=======================================");
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    StudentModel.OutputInfor();
                    in.nextLine();
                    break;
                case "2":
                    StudentModel.updateClass();
                    break;
                case "3":
                    StudentModel.addNewClass();
                    break;
                case "0":
                    ShowMenu();

                    break;
                default:
                    System.out.println("There is no function for this!");
                    break;
            }
        }

    }

    public static void quanLiDiemThi()  throws IOException{
        String choice;
        while (true) {
            System.out.println("=====================================");
            System.out.println("Quan li diem thi");
            System.out.println("1.Nhap vao diem thi:");
            System.out.println("2.hien thi diem thi theo lop");
            System.out.println("3.Hien thi diem thi theo mon:");
            System.out.println("0.Tro ve menu chinh");
            System.out.println("=====================================");
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    StudentModel.Enter_Test_Score();
                    break;
                case "2":
                    StudentModel.Display_Test_Scores_By_Class();
                    break;
                case "3":
                    StudentModel.Display_Test_Scores_By_Subject();
                    break;
                case "0":
                    ShowMenu();
                    break;
                default:
                    System.out.println("There is no function for this!");
                    break;
            }
        }

    }
}


