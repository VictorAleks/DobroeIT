package lesson1;

public class Homework {

  static byte byteVar;
  static short shortVar;
  static int intVar;
  static long longVar;
  static float floatVar;
  static double doubleVar;
  static boolean boolVar;
  static char charVar;

  public static void main(String[] args) {

    /***3rd Task***/

    int a, b, c;
    a = 20;
    b = 30;
    c = 10;
    System.out.println("a + b + c = " + (a + b + c));

    /***4th Task***/

    char symb = 'S';
    int numb = symb;
    System.out.println("Symbol to number = " + numb);

    /***5th Task***/

    short x = 20;
    int y = x;
    System.out.println("Implicit casting: " + y);

    /***6th Task***/

    double d = 3.14;
    int i = (int) d;
    System.out.println("Explicit casting: " + i);

    /***7th Task***/
    System.out.println("Default values: ");
    System.out.println("byte - " + byteVar);
    System.out.println("short - " + shortVar);
    System.out.println("int - " + intVar);
    System.out.println("long - " + longVar);
    System.out.println("float - " + floatVar);
    System.out.println("double - " + doubleVar);
    System.out.println("bool - " + boolVar);
    System.out.println("char - " + charVar);
  }
}
