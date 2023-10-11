package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        float inEuro = 140;
        float expectedEuro = 1.4f;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 1.4. Test result : " + passedEuro);

        float inDol = 140;
        float expectedDol = 1.5555556f;
        float outDol = Converter.rubleToDollar(inDol);
        boolean passedDol = expectedDol == outDol;
        System.out.println("140 rubles are 1.5555556 Test result : " + passedDol);

    }
}
