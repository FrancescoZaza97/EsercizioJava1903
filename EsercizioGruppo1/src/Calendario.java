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
                    System.out.println("il Corso ha effettuato le lezioni di GitHub");
                }else if ( giorno >= 12 && giorno <= 31){
                    System.out.println("il Corso ha effettuato le lezioni di Java");
                } else{
                    System.out.println("Marzo ha solo 31 giorni, checka bene DAEI!!!!");
                }
                break;
            case "aprile":
                if (giorno >= 1 && giorno <= 8){
                    System.out.println("Il corso ha effettuato le lezioni di Java");
                } else if(giorno >=9 && giorno <=17) {
                    System.out.println("Il corso ha effettuato le lezioni di Database");
                } else if(giorno >=18 && giorno <=22) {
                    System.out.println("Il corso ha effettuato lezioni di JDBC");
                } else if (giorno ==21){
                    System.out.println("Festivo");
                }else if (giorno==22 || giorno==23){
                    System.out.println("Il corso ha effettuato le lezioni di JDBC");
                }else if (giorno ==24) {
                    System.out.println("Il corso ha effettuato lezioni di Spring");
                } else if (giorno ==25){
                    System.out.println("Festivo");
                }else if (giorno >=26 && giorno <=30) {
                    System.out.println("Il corso ha effettuato lezioni di Spring");
                } else {
                    System.out.println("Data non valida");
                }
                break;   
            case "maggio":
                
                break;
            default:
                System.out.println("il mese inserito non e' valido, Riprova!");
                break;
        }
    }
}
