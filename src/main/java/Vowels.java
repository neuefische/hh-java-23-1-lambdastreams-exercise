import java.util.Arrays;

public class Vowels {

    /*
    In dieser Übung wird von dir erwartet eine Methode zu implementieren,
        die einen String aufnimmt,
        und die Anzahl aller Vokale (a, e, i, o, u) zurückgibt.

    Beispiel:
        Eingabe von "hello world" ergibt 3; denn "h - e - ll - o w - o - lrd" e - o - o = 3;

    Die Test Strings beeinhalten nur Kleinbuchstaben und Leerzeichen, kann aber auch komplett leer sein.
     */

    public static int getVowelCount(String str) {
        //This is where your code goes!

        return (int) Arrays.stream(str.split(""))
                .filter(string -> string.matches("[aeiou]"))
                .count();
    }
}
