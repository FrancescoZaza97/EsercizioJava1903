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
                break;
            case "novembre":
                break;
            case "dicembre":
                break;
        }
    }    

}
