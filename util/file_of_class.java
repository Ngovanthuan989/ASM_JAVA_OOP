package util;

import entity.Student;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;
import modelw.StudentModel;

/**
 * file_of_class
 */
public class file_of_class {

    static String pathFile = "./File/Class.dat";

    public static void wfileClass() throws IOException {
        OutputStream out = null;
        ObjectOutputStream objOutput = null;
        try {
            out = new FileOutputStream(pathFile);
            objOutput = new ObjectOutputStream(out);
            objOutput.writeObject(StudentModel.DSSV);
        } catch (Exception e) {
        } finally {
            if (out != null) {
                out.close();
            }
            if (objOutput != null) {
                objOutput.close();
            }
        }
    }

    public static void rFileClass() throws IOException {
        InputStream in = null;
        ObjectInputStream objIn = null;
        try {
            in = new FileInputStream(pathFile);
            objIn = new ObjectInputStream(in);
            StudentModel.DSSV = (List<Student>) objIn.readObject();
        } catch (Exception e) {
        } finally {
            if (in != null) {
                in.close();
            }
            if (objIn != null) {
                objIn.close();
            }
        }
    }
}