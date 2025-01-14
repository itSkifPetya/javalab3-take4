import javax.sound.midi.Soundbank;
import java.security.spec.ECField;

public class Main {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";
        String result = "First:" + text.charAt(0).toString() + "\nLast:" + text.charAt(text.length()-1).toString();
        System.out.println(result);

//        int a = 1, x = 2, y = 3, z = 6;
//
//        a += x > y && x > z ? x : y>z ? y : z;
//        System.out.println(a);
//
//        System.out.println(!! (false || true != false));

//        int a = 9;
//        if (a / 8 - 1 > 0) {
//            System.out.print(a + "a");
//        } else {
//            System.out.print("a" + a);
//
//        }
//
//        String x = "Hello";
//        x.replace("H", "G");
//        x += x;
//        System.out.println(x);

//        int x = -2;
//        do System.out.print(++x);
//        while ( x <= -x);

//        var abc = "A" + "B" + "C";
//        var ab = "A" + "B";
//        System.out.print(abc.equals(ab + "C"));
//        System.out.print(abc == (ab + "C"));
//        exc(1);


    }

    public static int exc(int x) {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}

