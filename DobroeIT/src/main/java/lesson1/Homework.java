package lesson1;

public class Homework {

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
  }

}
