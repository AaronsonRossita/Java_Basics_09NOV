public class Main {

    // psvm
    public static void main(String[] args) {


        // characters
        String myString = "My first String";
        char myChar = '#';

        // numbers
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 9223372036854775807L;

        double myDouble = 2.5;
        float myFloat = 3.7f;


        //boolean
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        int x = 4;
        double y = 2.5;
        y = x;

        x = (int) 2.999999;

        //System.out.println(x);

        //System.out.println(myInt + myString);
        //System.out.println("word" + 3 + 4);
        //System.out.println(3 - 4 * 6 / 4 + 1 + "word" + 6 + 7);

        String a = "abc";
        char b = 'd';
        b = a.charAt(1);
        //System.out.println(b);

        x += 10; // x = x + 10
        x *= 10; // x = x * 10
        x /= 10; // x = x / 10
        x -= 10; // x = x - 10

        //x % 10;
        // x = 2
        //System.out.println("x = " + x);

        int number1 = 3;
        int number2 = 5;

//   just if

//        if (number1 >= 3){
//            System.out.println("number1 is bigger than 3");
//        }
//
//        System.out.println("after if");

//   if with else

//        if (number1 > 3){
//            System.out.println("number1 is bigger than 3");
//        }else{
//            System.out.println("i am else");
//        }

//   if with else if and else

//        if (number1 < 3){
//            System.out.println("number1 is smaller than 3");
//        }else if (number1 > 3){
//            System.out.println("number1 is bigger than 3");
//        }else{
//            System.out.println("number1 is equal to 3");
//        }

//   switch case
        int day = 3;

        switch (day){
            case 1: // day == 1
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("not a valid weekday number");
        }

        //System.out.println("after switch");

        int[] arrInt = {10,20,30,40,50,60,70};
        double[] arrDouble = {2.5,3.7,4};

        String[] arrString = {"abc","def","ghi"};
        char[] arrChar = {'a','b','c'};

        boolean[] arrBool = {true,true,false,false};

        //arrInt[4] = 8; exception

        int[][] matrixInt = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        String[][] matrixString = {
                {"abc","def","ghi"},
                {"jkl","mno","pqr"},
                {"stu","vwx","yz"}
        };

        //System.out.println(matrixString[1][0].charAt(1));
//  for i
//        for (int i = 10; i <= 20; i++) {
//            System.out.println(i);
//        }

//   for each
//        for (int number : arrInt){
//            System.out.println(number);
//        }

//        System.out.println(arrInt);
//        System.out.println(arrDouble);
//        System.out.println(arrString);

        System.out.print("{");
        for (int i = 0; i < arrInt.length; i++) {
            if (i < arrInt.length-1) {
                System.out.print(arrInt[i] + ",");
            }else{
                System.out.print(arrInt[i]);
            }
        }
        System.out.println("}");
    // {10, 20, 30}


    }

}
