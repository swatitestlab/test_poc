public class Day3Assignment {
    public static void main(String[] args) {
        //XMLEventReader eventReader = xmlInputFactory.createXMLEventReader(response.getContent());

        int i = 0;
        if (i<1)
        {
            System.out.println ("number is positive" );
        }
        else {

            System.out.println ("number is negative");
        }

        //write a program to find greatest of 3 number.

        int a=905;
        int b=90;
        int c=100;

        if (a>b || a>c)
        {
            System.out.println ("a is greater");
        }
        else if (b>a && b>c)
        {
            System.out.println ("b is greater");
        }
        else
        {
            System.out.println ("c is greater");
        }

        //write a program to show multiplication table of 5
        int s=5;
        int d=1;
        for (d=1;d<11;d++)
        {
            System.out.println (s+ "X" +d+ "=" +(s*d) );
        }
        //java Program to Count Number of Digits in an Integer

        int count=0;
        int num=67890;

        while (num!=0)

        {
            num/=10 ;
            ++count;
            }
        System.out.println ("total digit is=" +count);
    }
}

