/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelw;

/**
 *
 * @author ADMIN
 */
import application.Menu;
import entity.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.Validate;
import util.file_of_Student;
import util.file_of_class;
import util.file_of_point;

public class StudentModel {

    public static List<Student> DSSV = new ArrayList<Student>();
    static Scanner in = new Scanner(System.in);

    public static int checkIdStudent(String x) {
        for (int i = 0; i < StudentModel.DSSV.size(); i++) {
            if (StudentModel.DSSV.get(i).getRollNo().equals(x))
                return i;
        }
        return -1;

    }

    public static void addNewStudents() throws IOException {
        file_of_Student.rFileStudent();
        while (true) {
            Student sv = new Student();
            System.out.println("=====================================");
            String rollNumber;
            while (true) {
                System.out.print("  -Nhap ma sinh vien:");
                // gan 1 bien string để validate thỏa mãn ko bắt nhập nữa

                rollNumber = new Validate().checkEmpty();
                if (checkIdStudent(rollNumber) == -1)
                    break;
                else
                    System.out.println("Ma sinh vien da ton tai!");
            }
            // khi cái string trên thỏa mãn r => set trường rollNumber = string dấy
            sv.setRollNo(rollNumber);
            System.out.print("  -Nhap ten sinh vien:");
            String name = new Validate().checkString();
            sv.setName(name);
            System.out.print("  -Nhap dia chi:");
            String address = new Validate().checkEmpty();
            sv.setAdderss(address);
            System.out.print("  -Nhap ngay sinh(dd/mm/yyyy): ");
            String ng = new Validate().checkNgaySinh();
            sv.setBirthday(ng);
            System.out.print("  -Nhap ma lop:");
            String ma = new Validate().checkEmpty();
            sv.setMaLop(ma);
            System.out.println(" =====================================");
            DSSV.add(sv);
            file_of_Student.wfileStudent();
            boolean is_type_wrong = true;

            while (is_type_wrong) {
                System.out.println("Ban co muon tiep tuc khong?(y/n) : ");
                int check = -2;
                String yn = in.nextLine();
                switch (yn) {
                    case "y":
                        is_type_wrong = false;

                        break;
                    case "n":
                        Menu.quanLiSinhVien();
                        break;
                    default:
                        System.out.println("Nhap sai lua chon.Moi nhap lai!");
                        is_type_wrong = true;
                }
            }
        }
    }

    public static void updateStudent() throws IOException {
        file_of_Student.rFileStudent();
        while (true) {
            // student moi
            // for cai list
            // ì (ma sinh vien trong lít equal vs cai nhaop vao thì moi set lai cho nó)
            Student sv1 = new Student();
            System.out.println("======================================");
            System.out.print("-Nhap ma sinh vien:");
            String st = new Validate().checkEmpty();

            System.out.print("  -Sua ten sinh vien:");
            String st1 = new Validate().checkString();

            System.out.print("  -Sua dia chi:");
            String st3 = new Validate().checkEmpty();

            System.out.print("  -Sua ngay sinh(dd/mm/yyyy):");
            String st4 = new Validate().checkEmpty();

            System.out.print(" -Sua ma lop:");
            String st5 = new Validate().checkEmpty();

            boolean type_wrong = true;
            while (type_wrong) {
                String chon;
                System.out.println("Ban co muon cap nhap khong?(y/n):");
                int check = -1;
                chon = in.nextLine();
                switch (chon) {
                    case "y":
                        for (int i = 0; i < DSSV.size(); i++) {
                            if (DSSV.get(i).getRollNo().equalsIgnoreCase(st)) {
                                DSSV.get(i).setRollNo(st);
                                DSSV.get(i).setName(st1);
                                DSSV.get(i).setAdderss(st3);
                                DSSV.get(i).setBirthday(st4);
                                DSSV.get(i).setMaLop(st5);
                                System.out.println("Nhap thanh cong");
                                check = i;
                            }
                        }
                        if (check == -1) {
                            System.out.println("Ma SV ko ton tai");
                        }

                        type_wrong = false;
                        break;

                    case "n":
                        System.out.println("Khong dc cap nhap!");
                        type_wrong = false;
                        break;
                    default:
                        System.out.println("Khong co chuc nang nay.Moi nhap lai!");
                        type_wrong = true;
                        break;
                }
            }

            boolean is_type_wrong = true;
            while (is_type_wrong) {
                System.out.println("Ban co muon tiep tuc khong?(y/n) : ");
                String yn = in.nextLine();
                switch (yn) {
                    case "y":
                        is_type_wrong = false;
                        break;
                    case "n":
                        file_of_Student.wfileStudent();

                        Menu.quanLiSinhVien();

                        break;
                    default:
                        System.out.println("Nhap sai lua chon.Moi nhap lai!");
                        is_type_wrong = true;
                }
            }
        }

    }

    public static int checkIDClass(String x) {
        for (int i = 0; i < StudentModel.DSSV.size(); i++) {
            if (StudentModel.DSSV.get(i).getClassCode().equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public static void addNewClass() throws IOException {
        file_of_class.rFileClass();
        while (true) {
            String s1;
            while (true) {
                System.out.print("Nhap ma lop:");
                s1 = new Validate().checkEmpty();
                if (checkIDClass(s1) == -1)
                    break;
                else
                    System.out.println("Ma lop da ton tai!");
            }

            System.out.print("Nhap mo ta lop:");
            String s2 = new Validate().checkEmpty();

            System.out.print("Nhap giang vien:");
            String s3 = new Validate().checkString();

            System.out.print("Nhap thoi gian hoc:");
            String s4 = new Validate().checkEmpty();

            System.out.print("Nhap ngay hoc:");
            String s5 = new Validate().checkEmpty();

            for (int i = 0; i < DSSV.size(); i++) {
                if (DSSV.get(i).getClassCode().equalsIgnoreCase(s1)) {

                    DSSV.get(i).setMoTaLop(s2);
                    DSSV.get(i).setGiangVien(s3);
                    DSSV.get(i).setTime(s4);
                    DSSV.get(i).setNgay(s5);
                    break;
                } else {
                    Student sv2 = new Student();
                    sv2.setMaLop(s1);
                    sv2.setMoTaLop(s2);
                    sv2.setGiangVien(s3);
                    sv2.setTime(s4);
                    sv2.setNgay(s5);
                    DSSV.add(sv2);
                    file_of_class.wfileClass();
                    break;
                }
            }

            boolean is_type_wrong = true;
            while (is_type_wrong) {
                System.out.println("Ban co muon tiep tuc khong?(y/n) : ");
                String yn = in.nextLine();
                switch (yn) {
                    case "y":
                        is_type_wrong = false;
                        break;
                    case "n":
                        Menu.quanLiLop();

                        break;
                    default:
                        System.out.println("Nhap sai lua chon.Moi nhap lai!");
                        is_type_wrong = true;
                }
            }
        }
    }

    public static void updateClass() throws IOException {
        file_of_class.rFileClass();
        while (true) {

            System.out.print("Nhap ma lop:");
            String t = new Validate().checkEmpty();

            System.out.print("Sua mo ta lop:");
            String t2 = new Validate().checkEmpty();

            System.out.print("Sua giang vien:");
            String t3 = new Validate().checkString();

            System.out.print("Sua thoi gian hoc:");
            String t4 = new Validate().checkEmpty();

            System.out.print("Sua ngay hoc:");
            String t5 = new Validate().checkEmpty();

            boolean type_wrong = true;
            while (type_wrong) {
                String chon;
                System.out.println("Ban co muon cap nhap khong?(y/n):");
                int check = -1;
                chon = in.nextLine();
                switch (chon) {
                    case "y":

                        for (int i = 0; i < DSSV.size(); i++) {
                            if (DSSV.get(i).getClassCode().equalsIgnoreCase(t)) {
                                DSSV.get(i).setMoTaLop(t2);

                                DSSV.get(i).setGiangVien(t3);

                                DSSV.get(i).setTime(t4);

                                DSSV.get(i).setNgay(t5);

                                System.out.println("Nhap thanh cong!");
                                check = i;
                            }
                        }
                        if (check == -1) {
                            System.out.println("Ma lop khong ton tai!");

                        }

                        type_wrong = false;
                        break;
                    case "n":
                        System.out.println("Khong dc cap nhap!");
                        type_wrong = false;
                        break;
                    default:
                        System.out.println("Khong co chuc nang nay.Moi nhap lai!");
                        type_wrong = true;
                        break;
                }
            }

            boolean is_type_wrong = true;
            while (is_type_wrong) {
                System.out.println("Ban co muon tiep tuc khong?(y/n) : ");
                String yn = in.nextLine();
                switch (yn) {
                    case "y":
                        is_type_wrong = false;
                        break;
                    case "n":
                        file_of_class.wfileClass();
                        Menu.quanLiLop();
                        break;
                    default:
                        System.out.println("Nhap sai lua chon.Moi nhap lai!");
                        is_type_wrong = true;
                }
            }
        }
    }

    public static void OutputInfor() throws IOException {
        file_of_class.rFileClass();

        System.out.println("====================================================================================");
        System.out.println(" Danh sach lop");
        System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", "Ma lop", "Mo ta", "Giang vien", "Gio hoc",
                "Ngay hoc");
        System.out.println("------------------------------------------------------------------------------------");
        for (int j = 0; j < DSSV.size(); j++) {
            System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", DSSV.get(j).getClassCode(),
                    DSSV.get(j).getMoTaLop(), DSSV.get(j).getGiangVien(), DSSV.get(j).getTime(), DSSV.get(j).getNgay());
        }
        System.out.println("====================================================================================");
    }

    public static void ShowInfor() throws IOException {
        file_of_Student.rFileStudent();
        System.out.println("=====================================================================================");
        System.out.println(" Danh sach sinh vien");
        System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", "MSSV", "Ten SV", "Dia chi", "Ngay sinh",
                "Lop");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < DSSV.size(); i++) {
            if (DSSV.get(i).getRollNo() != null) {
                System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", DSSV.get(i).getRollNo(),
                        DSSV.get(i).getName(), DSSV.get(i).getAdderss(), DSSV.get(i).getBirthday(),
                        DSSV.get(i).getClassCode());
            }
        }
        System.out.println("=====================================================================================");

    }

    public static void Enter_Test_Score() throws IOException {
        file_of_Student.rFileStudent();
        file_of_class.rFileClass();
        file_of_point.rFilePoint();
        while (true) {
           int check=1;
            System.out.print("Nhap ma sinh vien:");
            String s = new Validate().checkEmpty();

            for (int i = 0; i < DSSV.size(); i++) {
                if (DSSV.get(i).getRollNo().equalsIgnoreCase(s)) {
                    System.out.print("Nhap mon thi:");
                    String s1 = new Validate().checkEmpty();
                    DSSV.get(i).setExamSubjects(s1);
                    System.out.print("Nhap diem:");
                    float diem = new Validate().checkFloat(0, 10);
                    DSSV.get(i).setTestSore(diem);
                    check=-1;
                    break;
                    
                } else {
                    System.out.println("Ma sinh vien khong ton tai:");
                    check=1;
                    break;
                }

            }

            boolean is_type_wrong = true;
            while (is_type_wrong) {

                System.out.println("Ban co muon tiep tuc khong?(y/n) : ");
                String yn = in.nextLine();
                switch (yn) {
                    case "y":
                        is_type_wrong = false;
                        break;
                    case "n":
                        file_of_point.wfilePoint();
                        file_of_Student.wfileStudent();
                        file_of_class.wfileClass();
                        Menu.quanLiDiemThi();
                        break;
                    default:
                        System.out.println("Nhap sai lua chon.Moi nhap lai!");
                        is_type_wrong = true;
                }
            }
        }
    }

    /**
     * search la search trong cai lit day dung
     * 
     * @throws IOException
     */
    public static void Display_Test_Scores_By_Class() throws IOException {
        file_of_point.rFilePoint();
        file_of_Student.rFileStudent();
        file_of_class.rFileClass();
        // Student v = new Student();
        System.out.println("=====================================================================================");
        System.out.print("Nhap ma lop:");
        String s1 = new Validate().checkEmpty();
        // v.setMaLop(s1);
        // DSSV.add(v);
        System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", "Ma Lop", "Ten SV", "Mon thi", "Diem",
                "Danh gia");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < DSSV.size(); i++) {
            if (DSSV.get(i).getClassCode().equalsIgnoreCase(s1)) {
                System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", DSSV.get(i).getClassCode(),
                        DSSV.get(i).getName(), DSSV.get(i).getExamSubjects(), DSSV.get(i).getTestSore(),
                        DSSV.get(i).getDanhGia());
            }
            System.out.println("=====================================================================================");
        }
    }

    public static void Display_Test_Scores_By_Subject() throws IOException {
        file_of_point.rFilePoint();
        file_of_Student.rFileStudent();
        file_of_class.rFileClass();
        System.out.println("=====================================================================================");
        System.out.print(" Nhap mon thi:");
        String mt = new Validate().checkEmpty();
        System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", "Ma Lop", "Ten SV", "Mon thi", "Diem",
                "Danh gia");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < DSSV.size(); i++) {
            if (DSSV.get(i).getExamSubjects().equalsIgnoreCase(mt)) {
                System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", DSSV.get(i).getClassCode(),
                        DSSV.get(i).getName(), DSSV.get(i).getExamSubjects(), DSSV.get(i).getTestSore(),
                        DSSV.get(i).getDanhGia());
            }
        }
        System.out.println("=====================================================================================");

    }

}
