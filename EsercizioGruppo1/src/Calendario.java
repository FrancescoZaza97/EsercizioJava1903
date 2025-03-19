public class Calendario {
    public int giorno;
    public String mese;


    public void stampaCalendario(){
        switch (mese) {
            case "febbraio":
                if(giorno >= 1 && giorno <= 12){
                    System.out.println("Corso non ancora avviato");
                }else if(giorno >= 13 && giorno <= 28){
                    System.out.println("il Corso ha effettuato le lezioni di Web Design");
                }else{
                    System.out.println("febbraio ha solo 28 giorni, checka bene DAEI!!!!");
                }
                break;
            case "marzo":
                if (giorno >= 1 && giorno <= 4){
                    System.out.println("il Corso ha effettuato le lezioni di Web Design");
                } else if(giorno == 5 ){
                    System.out.println("il Corso ha effettuato le lezioni di DASA");
                } else if(giorno >= 6 && giorno <= 10){
                    System.out.println("il Corso ha effettuato le lezioni di Java");
                } else if (giorno == 11){
                    System.out.println("il Corso ha effettuato le leszioni di GitHub");
                }else if ( giorno >= 12 && giorno <= 31){
                    System.out.println("il Corso ha effettuato le leszioni di Java");
                } else{
                    System.out.println("Marzo ha solo 31 giorni, checka bene DAEI!!!!");
                }
                break;
            case "aprile":
                
                break;   
            case "maggio":
                
                break;
            default:
                System.out.println("il mese inserito non e' valido, Riprova!");
                break;
        }
    }
}
