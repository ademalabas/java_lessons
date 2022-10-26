package BENIM_DOSYALAR.J22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece=LocalTime.of(0,17);
        LocalTime oglen= LocalTime.of(13,24);

        Duration fark= Duration.between(gece,oglen);//oglen zamamı ile gece zamanı arasındaki zaman farkı atandı
        System.out.println("fark = " + fark);
        System.out.println("fark.getSeconds() = " + fark.getSeconds());//fark bilgisindeki saniye datası alındı

        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());//fark bilgisi dakikay cevirildi

        System.out.println("fark.toMillis() = " + fark.toMillis());


    }

}
