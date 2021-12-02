package Mypackage;

public class Operators {

    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        //  Arthematic operaton
        System.out.println ("Sum of:" + a+b);
        System.out.println ("Sum of:" + (a+b));
        System.out.println ("Sum of:" + (a-b));
        System.out.println ("Sum of:" + (a*b));
        System.out.println ("Sum of:" + (a/b));
        System.out.println ("Sum of:" + (a%b));

        //Relational operator also c/d comparision operator and every operator will return boolean value.

        System.out.println ("Sum of:" + (a==b)); //false  both r not equal it return false
        System.out.println ("Sum of:" + (a<b));
        System.out.println ("Sum of:" + (a>b));
        System.out.println ("Sum of:" + (a<=b));
        System.out.println ("Sum of:" + (a>=b));
        System.out.println ("Sum of:" + (a!=b));

        //Logical operator  &&  ||   !  Logical operatop work between 2 boolean value
        Boolean X=true;
        Boolean Y=false;
        System.out.println ( X && Y);
        System.out.println ( X || Y);
        System.out.println (  !X); //opposite result show
        System.out.println (!Y);


    }
}
