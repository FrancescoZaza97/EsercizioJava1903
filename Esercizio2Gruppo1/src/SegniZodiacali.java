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
                break;
            case "maggio":
                break;
            case "giugno":
                break;
            // Gabri
            case "luglio":
                break;
            case "agosto":
                break;
            case "settembre":
                break;
            //stefano
            case "ottobre":
                if (giorno <= 22) {
                    System.out.println("il tuo segno zodiacale è bilancia");
                } else if (giorno >= 23) {
                    System.out.println("Il tuo segno zodiacale è scorpione");
                }
                break;
            case "novembre":
                if (giorno <= 21) {
                    System.out.println("il tuo segno zodiacale è scorpione");
                } else if (giorno >= 22) {
                    System.out.println("Il tuo segno zodiacale è sagittario");
                }
                break;
            case "dicembre":
                if (giorno <= 21) {
                    System.out.println("il tuo segno zodiacale è sagittario");
                } else if (giorno >= 22) {
                    System.out.println("Il tuo segno zodiacale è capricorno");
                }
                break;
        }
    }    

}
