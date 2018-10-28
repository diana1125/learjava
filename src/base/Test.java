package base;

public class Test {
    public static void main (String ... args){
        String name = "SDA";

        //instance (object) method
        Loops loops = new Loops();
        loops.printSimpleArray();
        {
            String mesage = Loops.mesage();
            System.out.println(mesage);
        }
    }
}
