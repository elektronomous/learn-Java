public class FahrenheitToC2 {
    public class FahrenheitToC {
        public static void main(String[] args) {
            final double FREEZING_POINT = 32.0;
            final double DEGREE_RATION = 5.0/9.0;
            double fahrenheit = 98.6;
            double celcius = (fahrenheit - FREEZING_POINT) * (DEGREE_RATION);
            /* The way you create the 32.0 and 5.0/9.0 is hardcoded, or we
             * call it a magic number. a number that suddenly appear, it's not good
             * it doesn't have a meaning, make your user hard to read it
             * so we create constant for both value
             */
    
            System.out.print("Celcius equivalent: ");
            System.out.println(celcius);
        }
    }    
}
