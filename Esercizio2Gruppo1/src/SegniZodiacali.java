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
                if(giorno>=1 && giorno<=22){
                    System.out.println("Il tuo sogno è: ♋ Cancro ");
                }else if(giorno>=23 && giorno <=31) {
                    System.out.println("Il tuo sogno è: ♌ Leone ");
                } else {
                    System.out.println("Giorno selezionato non esistente");
                }
                break;
            case "agosto":
                if(giorno>=1 && giorno<=22){
                    System.out.println("Il tuo sogno è: ♌ Leone ");
                }else if(giorno>=23 && giorno <=31) {
                    System.out.println("Il tuo sogno è: ♍ Vergine ");
                } else {
                    System.out.println("Giorno selezionato non esistente");
                }
                break;
            case "settembre":
                if(giorno>=1 && giorno<=22){
                    System.out.println("Il tuo sogno è: ♍ Vergine ");
                }else if(giorno>=23 && giorno <=30) {
                    System.out.println("Il tuo sogno è: ♎ Bilancia ");
                } else {
                    System.out.println("Giorno selezionato non esistente");
                }
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
