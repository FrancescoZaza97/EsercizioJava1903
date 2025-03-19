import java.util.*;
public class SegniZodiacaliTest {
    public static void main(String[] args) {
        SegniZodiacali mioSegno = new SegniZodiacali();
        Scanner giorno = new Scanner (System.in);
        Scanner mese = new Scanner (System.in);
        Scanner ferma = new Scanner(System.in);
        String stop;
        boolean continua = true;


        while(continua){
            
            System.out.println("inserisci il tuo giorno di nascita 'NUMERO': ");
            mioSegno.giorno = giorno.nextInt();
            System.out.println("inserisci il tuo mese di nascita 'NON NUMERICO': ");
            mioSegno.mese = mese.nextLine().toLowerCase();

            mioSegno.mostraSegnoZodiacale();
            System.out.println("digita stop per concludere la sessione");
            stop = ferma.nextLine();
            if(stop.equalsIgnoreCase("stop")){
                continua = false;
            }
        }

        giorno.close();
        mese.close();
    }
}
