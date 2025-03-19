import java.util.*;
public class CalendarioTest {
    public static void main(String[] args) {
        Calendario mioCalendario = new Calendario();
        Scanner stringa = new Scanner (System.in);
        Scanner giorno = new Scanner (System.in);
        Scanner ferma = new Scanner(System.in);
        String stop;
        boolean continua = true;


        while(continua){
            System.out.println("Salve gentile cliente, ecco a voi il calendario del corso JAVAITA");
            System.out.print("Scrivi il mese che vuoi controllare: ");
            mioCalendario.mese = stringa.nextLine().toLowerCase();
            
            System.out.print("Scrivi il giorno che vuoi controllare: ");
            mioCalendario.giorno = giorno.nextInt();

            mioCalendario.stampaCalendario();

            System.out.println("digita stop per concludere la sessione");
            stop = ferma.nextLine();
            if(stop.equalsIgnoreCase("stop")){
                continua = false;
            }
        }
        stringa.close();
        giorno.close();
        ferma.close();
    }
}
