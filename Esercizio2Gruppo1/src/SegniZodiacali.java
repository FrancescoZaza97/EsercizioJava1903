public class SegniZodiacali {
    public int giorno;
    public String mese;

    public void mostraSegnoZodiacale(){
        switch(mese){
            // Checco
            case "gennaio":

                break;
            case "febbraio":
                break;
            case "marzo":
                break;
            //torcia umana
            case "aprile":
                if (giorno >= 1 && giorno <= 19) {
                    System.out.println("Il tuo segno zodiacale è Ariete♈");
                } else if (giorno >= 20 && giorno <= 30) {
                    System.out.println("Il tuo segno zodiacale è Toro♉");
                } else {
                    System.out.println("Data non valida!");
                }
                break;
            case "maggio":
                if (giorno >=1 && giorno<=20) {
                    System.out.println("Il tuo segno zodiacale è Toro♉");
                } else if (giorno >=21 && giorno <=31) {
                    System.out.println("Il tuo segno zodiacale è Gemelli♊");
                } else {
                    System.out.println("Data non valida!");
                }
            break;
            case "giugno":
                if (giorno >=1 && giorno<=20) {
                    System.out.println("Il tuo segno zodiacale è Gemelli♊");
                } else if (giorno >=21 && giorno <=30) {
                    System.out.println("Il tuo segno zodiacale è Cancro♋");
                } else {
                    System.out.println("Data non valida!");
                }
            break;
            //Gabri
            case "luglio":
                break;
            case "agosto":
                break;
            case "settembre":
                break;
            //stefano
            case "ottobre":
                break;
            case "novembre":
                break;
            case "dicembre":
                break;
        }
    }

}
