public class UnitTwo{
    public static void main(String[] args){
        String FirstName = new String("Robbie");
        String lastName = "doolittle";

        int num = lastName.length();

        System.out.println(num);
        
        String half = FirstName.substring(3,6);

        System.out.println(half);

        int part = FirstName.indexOf('b');
        
        System.out.println(FirstName.equals(lastName));

        int compare = FirstName.compareTo(lastName);

        System.out.println(compare);


        //boxing (formal)
        Integer intObject = new Integer(67); // must be an integer
        Double doubleObject = new Double(67.67); // can be an integer

        //autoboxing
        Integer intObject2 = 67;
        Double doubleObject2 = 67.67;

        //unboxing (formal)
        int number = intObject.intValue();
        double decimal = doubleObject.doubleValue();

        // autounboxing 
        int number2 = intObject2;
        double decimal2 = doubleObject2;

        System.out.println(intObject == intObject2); //auto unboxed
        System.out.println(intObject.equals(67)); //autoboxing // checks objects equal to eachother
        System.out.println(Integer.toString(intObject));
        System.out.println(Integer.reverse(2321));
        System.out.println(Integer.compare(intObject, intObject2));
        System.out.println(Integer.numberOfTrailingZeros(intObject2));
        System.out.println(Integer.lowestOneBit(intObject));
        System.out.println(Integer.hashCode(intObject2));


        System.out.println(Double.doubleToRawLongBits(43.564));
        System.out.println(Double.compare(doubleObject, doubleObject2));
        System.out.println(Double.toString(doubleObject));
        System.out.println(Double.isInfinite(32.123));
        System.out.println(Double.max(doubleObject, doubleObject2));
        System.out.println(Double.sum(doubleObject, doubleObject2));
       System.out.println(Double.toHexString(doubleObject));
        System.out.println(Double.parseDouble("12093231"));

        System.out.println(Math.abs(-9.8323214923143231));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.random());
        System.out.println(Math.pow(4.5, 7.2));
        System.out.println(Math.abs(-23123324));
        System.out.println(Math.atan(3.14159));
            System.out.println(Math.addExact(5, 8));
        System.out.println(Math.cos(3.14159));
        System.out.println(Math.floorDiv(9, 4));
        System.out.println(Math.log(32.45));

        


    }
}