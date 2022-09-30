package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations;


import java.util.Scanner;

public class C09_Replace_ReplaceAllOdev {
    public static void main(String[] args) {


      //  str = "    javaCAN'lara selam olsun :)  java ile 123455544 offer ***   ";
      //  System.out.println(str.replaceAll("\\s", "+"));//++++javaCAN'lara+selam+olsun+:)++java+ile+123455544+offer+***+++
      //  System.out.println(str.replaceAll("\\S", "+"));//++++++++++++ +++++ +++++ ++  ++++ +++ +++++++++ +++++ +++
      //  System.out.println(str.replaceAll("\\w", "+"));//+++++++'++++ +++++ +++++ :)  ++++ +++ +++++++++ +++++ ***
      //  System.out.println(str.replaceAll("\\W", "+"));//++++javaCAN+lara+selam+olsun+++++java+ile+123455544+offer+++++++
      //  System.out.println(str.replaceAll("\\d", "+"));//javaCAN'lara selam olsun :)  java ile +++++++++ offer ***
      //  System.out.println(str.replaceAll("\\D", "+"));//++++++++++++++++++++++++++++++++++++++++++123455544+++++++++++++

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Name:");//Double Name
        String name = scan.nextLine();

        System.out.println("Please Enter Your Surname:");
        String surname = scan.nextLine();

        System.out.println("Please enter 16 digit cardNo:");
        String  cardNo = scan.next();



            String newname= name.charAt(0) + name.substring(1,name.indexOf(" ")+1).replaceAll("\\w", "*")
                    + name.charAt(name.indexOf(" ")+1) + name.substring(name.indexOf(" ")+2).replaceAll("\\w","*");
            String newsurname =surname.charAt(0) +surname.substring(1).replaceAll("\\w", "*");
            String newcardNo = "**** **** ****" +cardNo.substring(12);
            System.out.println("Name Surname  =  " + newname+ " "+newsurname+ "  Card No =  " +newcardNo);



     //   String isim = "Çigdem Merve";
     //   String soyad = "Şen";
     //   String kartNo = "1234567890123456";
     //   String yeniIsim = isim.charAt(0) + isim.substring(1,isim.indexOf(" ")+1).replaceAll("\\w", "*")
     //           +isim.charAt(isim.indexOf(" ")+1)+isim.substring(isim.indexOf(" ")+2).replaceAll("\\w","*");
     //   String yeniSoyisim = soyad.charAt(0) + soyad.substring(1).replaceAll("\\w", "*");

     //   String yeniKartNo = "**** **** **** " + kartNo.substring(12);

     //   System.out.println("isim-soyisim :"+yeniIsim+" "+yeniSoyisim+ " kart no : "+yeniKartNo);//isim-soyisim :Ç***** ***** Ş** kart no : **** **** **** ****3456

     //   String isim1="Haci Mustafa ";
     //   String soyisim="Nizamoglu";
     //   String kartno="1234567891234567";
     //   String yeniİsim=isim1.charAt(0)+isim1.substring(1,isim1.indexOf(" ")+1).replaceAll("\\w","*")+isim1.charAt(isim1.indexOf(" ")+1)+isim1.substring(isim1.indexOf(" ")+2).replaceAll("\\w","*");
     //   String yenisoyisim=soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
     //   String yenikartno="**** **** **** "+kartno.substring(12);
     //   System.out.println("isim-soyisim: "+yeniİsim+yenisoyisim+" kartno: "+yenikartno);

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz:");//cift isim
        String isim = scanner.nextLine();

        System.out.println("lütfen soyisminizi giriniz:");
        String soyisim = scanner.nextLine();

        System.out.println("lütfen 16 haneli kredi karti bilgilerinizi giriniz:");
        String kartno = scanner.next();

        System.out.println(isim.charAt(0) + isim.substring(1, isim.indexOf(" ")).replaceAll("\\w", "*")+ " "
                + isim.charAt(isim.indexOf(" ") + 1) + isim.substring(isim.indexOf(" ")+1).replaceAll("\\w", "*"));
        System.out.println(soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w", "*"));
        System.out.println(kartno.substring(0, kartno.length() - 4).replaceAll("\\w", "*") + kartno.substring(kartno.length() - 4));


    }
}
