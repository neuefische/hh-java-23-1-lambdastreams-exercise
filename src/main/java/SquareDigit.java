import java.util.Arrays;

public class SquareDigit {
    /*
    In dieser Übung wird von dir erwartet eine Methode zu implementieren,
        die ein int aufnimmt,
        jeder Ziffer dieserZahl quadriert (Multiplikation der Ziffer mit sich selbst),
        die Quadrate der einzelnen Ziffern hintereinander setzt und
        die daraus resultierende Zahl als return Wert zurückgibt.

    Beispiel:
        Eingabe von 9119 ergibt 811181, denn 9^2 = 81; 1^2 = 1; 9^2-1^2-1^2-9^2 = 81-1-1-81
        Eingabe von 765 ergibt 493625, den 7^2 = 49; 6^2 = 36; 5^2 = 25; 7^2-6^2-5^2 = 49-36-25
    */
    public int squareDigits(int n) {
        //This is where your code goes!

        String result = Arrays.stream(Integer.toString(n).split(""))
                .map(Integer::parseInt)
                .map(num -> (int) Math.pow(num, 2))
                .map(String::valueOf)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

        return Integer.parseInt(result);
    }
}
