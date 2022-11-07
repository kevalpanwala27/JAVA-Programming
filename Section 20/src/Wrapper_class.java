public class Wrapper_class {
    public static void main(String[] args) {
        // Wrapper classes are available for character, byte, short, integer, long, float, double, boolean.

//        Integer i = new Integer(10); // Not proper method.
//        Integer a = Integer.valueOf(10); // Proper method.
        Integer b = 10; // Best method.

        Byte c = 15;
        Byte d = Byte.valueOf("15");

        Short f = Short.valueOf("123");

        Float g = 12.3f;
        Float h = Float.valueOf("123.5");

        Double j = Double.valueOf(123.456);

        Character k = Character.valueOf('k');

        Boolean l = Boolean.valueOf("true");
    }
}

