package BENIM_DOSYALAR.J40_Btk.workingWirhFiles;


import java.io.File;
import java.io.IOException;

public class C02_ReadibgFiles {

    public static void main(String[] args) {
        getFilrInfo();

    }// main sonu

public static void createFile(){
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
    public static void getFilrInfo(){
        File file = new File("C:\\Users\\hi\\IdeaProjects\\java_lessons\\File\\student.txt");
        if (file.exists()){
            System.out.println("Dosya adi = "+file.getName());
            System.out.println("Dosya yolu = "+file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi = "+file.canWrite());
            System.out.println("Dosya okunabilir mi = "+file.canRead());
            System.out.println("Dosya boyutu (byte) = "+file.length());


        }else{

        }


    }


}
