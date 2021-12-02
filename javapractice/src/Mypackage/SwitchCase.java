package Mypackage;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 7;

        switch (day)
        {
            case 1: System.out.println ("MONDAY"); break;
            case 2: System.out.println ("Tuesday");break;
            case 3: System.out.println ("Wednusday");break;
            case 4: System.out.println ("Thrusday");break;
            case 5: System.out.println ("friday"); break;
            case 6: System.out.println ("Saturday");break;
            case 7: System.out.println ("Sunday"); break;
            default:
                System.out.println ("Invalid day");
        }
    }
}