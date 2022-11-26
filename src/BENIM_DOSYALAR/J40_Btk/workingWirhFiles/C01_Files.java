package BENIM_DOSYALAR.J40_Btk.workingWirhFiles;


import java.io.File;
import java.io.IOException;

public class C01_Files {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\hi\\IdeaProjects\\java_lessons\\File\\student.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya Olusturuldu");
            }else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
