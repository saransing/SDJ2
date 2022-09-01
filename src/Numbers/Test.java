package Numbers;

import Numbers.Numbers;

public class Test {
    public static void main(String[] args)  {
        Thread numberThread = new Thread(new Numbers());
        Thread letterThread = new Thread(new Letters());

        numberThread.start();



        letterThread.start();
        //it runs randomly
    }
}
