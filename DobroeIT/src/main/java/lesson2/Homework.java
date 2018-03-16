package dobroe;

public class Lesson2 {

    /***Task1***/
    static void SumPositive (int a, int b, int c) {
        if (a > 0) {
            if (b > 0) {
                if (c > 0) System.out.println(a + b + c);
                else System.out.println( a + b );
            }
            else if ( c > 0) System.out.println( a + c );
            else System.out.println( a );
        }
        else if ( b > 0){
            if (c > 0) System.out.println( b + c );
            else System.out.println( b );
        }
        else if (c > 0 ) System.out.println( c );
        else System.out.println( "No positive numbers" );
    }

    /***Task2***/
    static int SumModulo (int [] arr) {
        int sum = 0;
        for (int counter : arr) {
            if (counter % 2 == 0)
                sum = sum + counter;
        }
        return sum;
    }

    /***Task3***/
    static void PrintArr (int [][] twoArr){
        for (int i = 0; i < twoArr.length; i++) {
            for (int j = 0; j < twoArr[i].length ; j++) {
                System.out.print( twoArr [i][j] + " ");
            }
            System.out.println();
        }
    }

    /***Task4***/
    static int FactorIterative (int a){
        int factorial = 1;
        int counter = a;
        do {
            factorial = factorial * counter;
            counter--;
        } while (counter > 0);
        return factorial;
    }

    static int FactorRecursive (int a){
        return a * FactorRecursive( a - 1);
    }


    public static void main(String[] args) {

        SumPositive(-1, -4, 8);

        System.out.println(SumModulo(new int[]{2, 3, 4, 5, 6}));

        PrintArr(new int [5][5]);

        System.out.println(FactorIterative(4));

        System.out.println(FactorIterative(5));
    }
}

/***
 * Инкапсуляция - ограничение доступа к данным с помощью модификаторов доступа.

 * Наследование - механизм, который позволяет использовать существующий класс,его поля и методы, для создания новых.
   А также дополнять родительский класс.

 * Полиморфизм - механизм, который позволяет новые объекты, используя уже существующие, но при этом изменять реализацию
   новых объектов, переопределяя их методы
 */


