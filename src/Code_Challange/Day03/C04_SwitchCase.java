package Code_Challange.Day03;

public class C04_SwitchCase {
    public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
            String day ="Wednesday";


        switch (day) {
            case "Monday":

            case "Tuesday":
                System.out.println("Java Class");break;
            case "Thursday":
            case "Friday":
                System.out.println("Selenium Class");break;
            case "Wednesday":
            case "Saturday":
                System.out.println("SQL Class");break;
            default: System.out.println("Day off");


        }

    }




}
