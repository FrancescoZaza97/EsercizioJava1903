import java.util.*;
public class SegniZodiacaliTest {
    public static void main(String[] args) {
        SegniZodiacali mioSegno = new SegniZodiacali();
        Scanner giorni = new Scanner (System.in);
        Scanner mesi = new Scanner (System.in);
        Scanner ferma = new Scanner(System.in);
        String stop;
        boolean continua = true;


        while(continua){
            
            System.out.println("inserisci il tuo giorno di nascita 'NUMERO': ");
            mioSegno.giorno = giorni.nextInt();
            System.out.println("inserisci il tuo mese di nascita 'NON NUMERICO': ");
            mioSegno.mese = mesi.nextLine().toLowerCase();

            mioSegno.mostraSegnoZodiacale();
            System.out.println("digita stop per concludere la sessione");
            stop = ferma.nextLine();
            if(stop.equalsIgnoreCase("stop")){
                continua = false;
            }
        }

        giorni.close();
        mesi.close();
        ferma.close();
    }
}
