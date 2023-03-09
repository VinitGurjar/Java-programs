public class type_promo {
    public static void main(String[] args) {
        byte a = 48;
        char b = 'a';
        short c = 1222;
        int d = 123343;
        float f = 34.53f;
        double e = 4.5456;
        final double result = (f * a) + (d / b) - (e - c);
        System.out.println((f * a) + " " + (d / b) + " " + (e - c));
        System.out.println(result);

    }
}
