package BENIM_DOSYALAR.J37_Enum.enum1;

public class Runner {
    public static void main(String[] args) {
        //Task -> verilen bir ay numarasına göre kaç gün çektiğini print eden code create ediniz
Aylar ay= Aylar.MART;//Aylar enum'ından ay field value MART olarak tanımlandı
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());


        // int ay=3;
switch (ay){
    case OCAK: System.out.println("Ocak 31 gun"); break;
    case SUBAT: System.out.println("subat 28 gun"); break;
    case MART: System.out.println("mart 31 gun"); break;
    case NISAN: System.out.println("nisan 30 gun"); break;
    case MAYIS: System.out.println("mayis 31 gun"); break;
    case HAZIRAN: System.out.println("haziran 30 gun"); break;
    case TEMMUZ: System.out.println("Temmuz 31 gun"); break;
    case AGUSTOS: System.out.println("Agustos 31 gun"); break;
    case EYLUL: System.out.println("Eylul 30 gun"); break;
    case EKIM: System.out.println("Ekim 31 gun"); break;
    case KASIM: System.out.println("Kasim 30 gun"); break;
    case ARALIK: System.out.println("Aralik 31 gun"); break;
    default: System.out.println("Yanlis veri girdiniz"); break;







}

    }
}
