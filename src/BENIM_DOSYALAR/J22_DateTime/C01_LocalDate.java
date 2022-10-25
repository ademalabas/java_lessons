package BENIM_DOSYALAR.J22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate bugun =LocalDate.now();
        System.out.println("bugun = " + bugun);//bugun = 2022-10-25
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getYear() = " + bugun.getMonthValue());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());

        LocalDate date1 =LocalDate.of(2016,10,29);
        LocalDate date2 =LocalDate.of(2016, Month.OCTOBER,29);

        // VERILEN BIR TARIHI ONCESINE VER SONRASINA GITME

        System.out.println("date1.plus(12) = " + date1.plusDays(12));
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5));
        System.out.println("bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));
    }
}

/*
 LocalDate bugun=LocalDate.now();//system'den bugunun yılay gun değerin atama yapar

        System.out.println("bugun = " + bugun);//2022-10-25
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());

        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);

        //verilen bir tarıhın öncesi ve sonrası gitme...minus()-> önce tarih , plus()->sonra tarih
        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5));
        System.out.println("bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));


 */