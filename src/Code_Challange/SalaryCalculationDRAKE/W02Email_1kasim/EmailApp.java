package Code_Challange.DRAKE.W02Email_1kasim;

/*
İşe yeni başlayan arkadaşlarımızın kullanımı için arkadaşlara şirket maili ve şifresi create edilip
 verilmelidir.
--> ** Bir sonraki sprintte create edilen bu mail otomatik olarak IT Manager,
 HR Manager, Team Lead e mail atılacaktır. Bunu göz önünde bulundurarak proglama yapınız.
Nitelikler:
firtsName: Çalışan İsmi
lastName: Çalışan soyadı
passWord: Çalışan şifresi
department: Çalışılacak Departman
email: Çalışan Email
emailSuffix: Şirket Domaini (clarusway.com)
mailBoxCapasity : 1000
defaultpassWordLenght : 12
Metotlar:
Çalışanın adı ve soyadı alacak şekilde parametreli bir construcor create ediniz (firtsName,lastName)
setDepartment fonks. creat ediniz. Bu fonk çalışanın departmanını setlemek için kullanılmalıdır.
Şirket departmanları aşağıdaki tabloda belirtilmiştir. Çalışanın istihdam edileceği departman
emailine eklenecektir.
testautomation.
fullstackdeveloper.
salesforce.
hiçbiri (Eğer çalışan yukarıda ki departmanlardan birinde istihdam edilmiyorsa
 mailine departman setlenmemelidir.)
setRandomPassWord() password ün uzunluğunu alarak random bir şekilde password create edebilen
bir fonk. olmalıdır. Kullanıcının passwordun de aşağıda belirtilmiş numeric,
alphabetic ve speacil karakterler bulunabilir. ABCDEFGHIJKLMNOPRSTUVYZ1234567890
?*!'+abcdefghıjklmanoprstuvyi
showInfo() çalışanın adı, soyadı, email, password unu konsolda gösterecek bir metot oluşturunuz.
white_check_mark
eyes
raised_hands

*/


import java.util.Scanner;

public class EmailApp {

    String passWord;
    String department;
    String email;
    String emailSuffix = "clarusway.com"; //Sirket Domaini dr@clarusway.com
    int mailBoCapacity = 1000;
    int defaultPaaswordLenght = 12;
    String firstName;
    String lastName;


    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        // System.out.println("Department: " + department);

        this.passWord = setRandomPassWord(defaultPaaswordLenght);
        //System.out.println("Password: " + passWord);

        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + emailSuffix;

    }


        /*
        testautomation.
        fullstackdeveloper.
        salesforce.
        hicbiri --> ekleme yapılmayacak.
         */

    public String setDepartment() {

        System.out.print("Lütfen Aşağıda Belirtilen Departmanlardan Herhangi Birini Seçiniz...\n" +
                "\n1 Test Automation \n2 Full Stack Developer \n3 Salesforce \n0 Hicbiri");

        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();

        if (options == 1) {
            return "testautomation.";
        } else if (options == 2) {
            return "fullstackdeveloper.";
        } else if (options == 3) {
            return "salesforce.";
        } else {
            return "";
        }

    }

    //ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
    //int lenght = 12;
    public String setRandomPassWord(int lenght) {

        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] password = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            password[i] = passWordSet.charAt(random);
        }
        return new String(password);
    }

    public String showInfo(){

        return "Ad-Soyad: " + firstName + " " + lastName + "\n"+
                "Sirket Email: " + email + "\n" +
                "Capasity: " + mailBoCapacity + "mb \n" +
                "Password: " + passWord;
    }



}
