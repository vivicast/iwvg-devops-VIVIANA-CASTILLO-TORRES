package es.upm.miw.iwvg_devops.code;

public class Utils {

    private Utils(){
        //
    }
    public static int minimumCommonMultiple(int a, int b) {
        return (a * b) / mcd(a, b);
    }

    public static int mcd(int a, int b) {
        int minim = Math.min(Math.abs(a), Math.abs(b));
        int maxim = Math.max(Math.abs(a), Math.abs(b));
        int rest;

        while (minim != 0) {
            rest = maxim % minim;
            maxim = minim;
            minim = rest;
        }
        return maxim;
    }
}
