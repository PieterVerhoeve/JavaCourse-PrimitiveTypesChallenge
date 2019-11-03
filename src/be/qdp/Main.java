package be.qdp;

public class Main {

    public static void main(String[] args) {

        //Primitive Types Challenge

        byte myByteValue = 100;
        short myShortValue = 30000;
        int myIntValue = 40000;

        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println(myLongValue);

        short shortTotal = (short)
                (1000 + 10 * (myByteValue + myShortValue + myIntValue));



    }
}
