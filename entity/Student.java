/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Student implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String name, rollNo, adderss, classCode, moTaLop, giangVien, time, ngay, examSubjects, birthday, danhGia;
    private float testScore;

    public Student() {
    }

    public Student(String name, String rollNo, String adderss, String classCode, String moTaLop, String giangVien, String time, String ngay, String examSubjects,
            String birthday, float testScore, String danhGia) {
        this.name = name;
        this.rollNo = rollNo;
        this.adderss = adderss;
        this.classCode = classCode;
        this.moTaLop = moTaLop;
        this.giangVien = giangVien;
        this.time = time;
        this.ngay = ngay;
        this.examSubjects = examSubjects;
        this.birthday = birthday;
        this.testScore = testScore;
        this.danhGia = danhGia;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        if (rollNo == null) {
            rollNo = " ";
        }
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setMaLop(String classCode) {
        this.classCode = classCode;
    }

    public String getMoTaLop() {
        if (moTaLop == null) {
            moTaLop = "Dang xu ly";
        }
        return moTaLop;
    }

    public void setMoTaLop(String moTaLop) {
        this.moTaLop = moTaLop;
    }

    public String getGiangVien() {
        if (giangVien == null) {
            giangVien = "Dang xu ly";
        }
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    public String getTime() {

        if (time == null) {
            time = "Dang xu ly";
        }
        return time;
    }

    public void setTime(String time) {

        this.time = time;
    }

    public String getNgay() {

        if (ngay == null) {
            ngay = "Dang xu ly";
        }

        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getExamSubjects() {
        return examSubjects;
    }

    public void setExamSubjects(String examSubjects) {
        this.examSubjects = examSubjects;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getTestSore() {
        return testScore;
    }

    public void setTestSore(float testScore) {
        this.testScore = testScore;
    }

    public String getDanhGia() {
        if (5 > testScore) {
            danhGia = "Trươt";
        } else if (testScore >= 5) {
            danhGia = "Do";
        }

        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

}
