public class SegniZodiacali {
    public int giorno;
    public String mese;

    public void mostraSegnoZodiacale(){
        switch(mese){
            // Checco
            case "gennaio":
                if (giorno >= 1 && giorno <= 19){
                    System.out.println("Il tuo segno zodicale e' Capricorno");
                }else if (giorno >= 20 && giorno <= 31){
                    System.out.println("Il tuo segno zodicale e' Acquario");
                }else{
                    System.out.println("il giorno inserito non e' valido");
                }
                break;
            case "febbraio":
                if (giorno>= 1 && giorno <= 18 ){
                    System.out.println("Il tuo segno zodicale e' Acquario");
                }else if (giorno >= 19 && giorno <= 28){
                    System.out.println("il tuo segno zodicale e' Pesci");
                }else{
                    System.out.println("il giorno inserito non e' valido, se sei nato il 29 febbraio, mi dispiace..");
                }
                break;
            case "marzo":
                if (giorno >= 1 && giorno <= 20 ){
                    System.out.println("il tuo segno zodicale e' Pesci");
                }else if (giorno >= 21 && giorno <= 30){
                    System.out.println("il tuo segno zodicale e' Ariete");
                }else{
                    System.out.println("il giorno inserito non e' valido");
                }
                break;
            //torcia umana
            case "aprile":
                if (giorno >= 1 && giorno <= 19) {
                    System.out.println("Il tuo segno zodiacale e' Ariete");
                } else if (giorno >= 20 && giorno <= 30) {
                    System.out.println("Il tuo segno zodiacale e' Toro");
                } else {
                    System.out.println("il giorno inserito non e' valido!");
                }
                break;
            case "maggio":
                if (giorno >=1 && giorno<=20) {
                    System.out.println("Il tuo segno zodiacale e' Toro");
                } else if (giorno >=21 && giorno <=31) {
                    System.out.println("Il tuo segno zodiacale e' Gemelli");
                } else {
                    System.out.println("il giorno inserito non e' valido!");
                }
                break;
            case "giugno":
                if (giorno >=1 && giorno<=20) {
                    System.out.println("Il tuo segno zodiacale e' Gemelli");
                } else if (giorno >=21 && giorno <=30) {
                    System.out.println("Il tuo segno zodiacale e' Cancro");
                } else {
                    System.out.println("il giorno inserito non e' valido");
                }
                break;
            //Gabri
            case "luglio":
                if(giorno>=1 && giorno<=22){
                    System.out.println("Il tuo sogno e': Cancro");
                }else if(giorno>=23 && giorno <=31) {
                    System.out.println("Il tuo sogno e': Leone");
                } else {
                    System.out.println("Giorno selezionato non esistente");
                }
                break;
            case "agosto":
                if(giorno>=1 && giorno<=22){
                    System.out.println("Il tuo sogno e': Leone");
                }else if(giorno>=23 && giorno <=31) {
                    System.out.println("Il tuo sogno e': Vergine");
                } else {
                    System.out.println("Giorno selezionato non esistente");
                }
                break;
            case "settembre":
                if(giorno>=1 && giorno<=22){
                    System.out.println("Il tuo sogno e': Vergine");
                }else if(giorno>=23 && giorno <=30) {
                    System.out.println("Il tuo sogno e': Bilancia");
                } else {
                    System.out.println("Giorno selezionato non esistente");
                }
                break;
            //stefano
            case "ottobre":
                if (giorno <= 22) {
                    System.out.println("il tuo segno zodiacale e' bilancia");
                } else if (giorno >= 23) {
                    System.out.println("Il tuo segno zodiacale e' scorpione");
                }
                break;
            case "novembre":
                if (giorno <= 21) {
                    System.out.println("il tuo segno zodiacale e' scorpione");
                } else if (giorno >= 22) {
                    System.out.println("Il tuo segno zodiacale e' sagittario");
                }
                break;
            case "dicembre":
                if (giorno <= 21) {
                    System.out.println("il tuo segno zodiacale e' sagittario");
                } else if (giorno >= 22) {
                    System.out.println("Il tuo segno zodiacale e' capricorno");
                } else {
                    System.out.println("Data non valida!");
                }
                break;
            
            default:
                System.out.println("mese non valido! Ripova");
                break;
        }
    }

}
