import java.util.Arrays;

public class IsNarcissistic {

    /*
    In dieser Übung wird von dir erwartet eine Methode zu implementieren, die überprüft, ob eine Zahl in die Kategorie
    der "Narzisstischen Zahlen" (auch Armstrong-Zahlen genannt) gehört. Eine narzisstische Zahl,
    hat die Eigenschaft, dass jede Ziffer für sich genommen, exponiert mit der Anzahl aller Ziffern und
    addiert sich selbst ergibt.

    Beispiel:
        153 = (1^3 + 5^3 + 3^3) = 1 + 125 + 27; 153 ist also eine narzisstische Zahl;
        1938 = (1^4 + 9^4 + 3^4 + 8^4) = 1 + 6561 + 81 + 4096 = 10739, 1938 ist also keine narzisstische Zahl;
     */

    public static boolean isNarcissistic(int n) {

        int length = String.valueOf(n).length();
        return n == Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(m -> Math.pow(m, length))
                .sum();
    }
}
