public class SegniZodiacali {
    public int giorno;
    public String mese;

    public void mostraSegnoZodiacale(){
        switch(mese){
            // Checco
            case "gennaio":
                if (giorno >= 1 && giorno <= 19){
                    System.out.println("Il tuo segno zodicale e' Capricorno ♑");
                }else if (giorno >= 20 && giorno <= 31){
                    System.out.println("Il tuo segno zodicale e' Acquario ♒");
                }else{
                    System.out.println("il giorno inserito non e' valido");
                }
                break;
            case "febbraio":
                if (giorno>= 1 && giorno <= 18 ){
                    System.out.println("Il tuo segno zodicale e' Acquario ♒");
                }else if (giorno >= 19 && giorno <= 28){
                    System.out.println("il tuo segno zodicale e' Pesci ♓");
                }else{
                    System.out.println("il giorno inserito non e' valido, se sei nato il 29 febbraio, mi dispiace..");
                }
                break;
            case "marzo":
                if (giorno >= 1 && giorno <= 20 ){
                    System.out.println("il tuo segno zodicale e' Pesci ♓");
                }else if (giorno >= 21 && giorno <= 30){
                    System.out.println("il tuo segno zodicale e' Ariete ♈");
                }else{
                    System.out.println("il giorno inserito non e' valido");
                }
                break;
            //torcia umana
            case "aprile":
                if (giorno >= 1 && giorno <= 19) {
                    System.out.println("Il tuo segno zodiacale è Ariete♈");
                } else if (giorno >= 20 && giorno <= 30) {
                    System.out.println("Il tuo segno zodiacale è Toro♉");
                } else {
                    System.out.println("il giorno inserito non e' valido!");
                }
                break;
            case "maggio":
                if (giorno >=1 && giorno<=20) {
                    System.out.println("Il tuo segno zodiacale è Toro♉");
                } else if (giorno >=21 && giorno <=31) {
                    System.out.println("Il tuo segno zodiacale è Gemelli♊");
                } else {
                    System.out.println("il giorno inserito non e' valido!");
                }
            break;
            case "giugno":
                if (giorno >=1 && giorno<=20) {
                    System.out.println("Il tuo segno zodiacale è Gemelli♊");
                } else if (giorno >=21 && giorno <=30) {
                    System.out.println("Il tuo segno zodiacale è Cancro♋");
                } else {
                    System.out.println("Dil giorno inserito non e' valido");
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
