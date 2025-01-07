//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    //metodo per moltiplicare due interi
    public static int moltiplica (int a, int b) {
        return a * b;
    }
    //metodo che concatena una stringa con un intero
    public static String concatena (String s, int n) {
        return s + n;
    }
    //metodo per testare la funzione
    public static void main (String[] args) {
        int risultato = moltiplica (7,7);
        System.out.println("Il risultato della moltiplicazione è: " + risultato);
        String concatenato = concatena ("Numero: ", 10);
        System.out.println ("Stringa concatenata: " + concatenato);
    }
}
