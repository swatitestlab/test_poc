package Mypackage;

public class Assignment {
    public static void main(String[] args) {

        System.out.println ("Hello my name is ");
        System.out.println ("Swati");

        int x=74;
        int y=36;
        System.out.println (x+y);

        //swap 2 number.
        int a=10;
        int b=20;
        int temp;

        System.out.println ("a =" +a);
        System.out.println ("b =" +b);

        //using a temprary variable
        temp =a;
        a = b;
        b= temp;
        System.out.println ("a =" +a);
        System.out.println ("b =" +b);

        //using without temprary
        int s=5;
        int d=9;
        System.out.println ("s =" +s);
        System.out.println ("d =" +d);

        s=s+d;
        d=s-d;
        s=s-d;
        System.out.println (s);
        System.out.println (d);

        //swap 3 number

        int w=4;
        int e=7;
        int r=9;
        System.out.println ("w =" +w);
        System.out.println ("e =" +e);
        System.out.println ("r =" +r);
        w = w+e+r;
        e= w-(e+r);
        r= w-(e+r);
        w= w-(e+r);
        System.out.println (e);
        System.out.println (r);
        System.out.println (w);

        //swaping string
        String t= "aj";
        String u= "ab";
        System.out.println ("t=" +t);
        System.out.println ("u=" +u);
       t= t+u;
        System.out.println (t);



    }
}
