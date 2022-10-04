package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators.TASK.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your Speed");
        int sppedticket =0;
        int currentSpeed = scan.nextInt();
        System.out.println("Do you have Driving Licence?");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (currentSpeed > 94) sppedticket = 500;
        else if (currentSpeed >= 85) sppedticket = 320;
        else if (currentSpeed >= 75) sppedticket = 150;
        else if (currentSpeed >= 55) sppedticket = 100;
        if (isDriverLicenceAvailable == false) sppedticket += 200;
        System.out.println("Cezanız = " + sppedticket+"$");


    }
}


