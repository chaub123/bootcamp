public class AppSwitch {

    public static void main(String[] args) throws Exception {
        Weekday weekday = Weekday.TUE;

        int result = switch (weekday){
            case MON, TUE -> 1;
            case WED, THUR -> 3;
            case FRI -> 5;
        };

        int result2 = switch (weekday) {
            case MON:
                System.out.println("Monday");
                yield 1;
            case TUE:
                System.out.println("Tuesday");
                yield 2; // like return + break
            case WED:
                System.out.println("Wednesday");
                yield 3;
            case THUR:
                System.out.println("Thursday");
                yield 4;
            case FRI:
                System.out.println("Friday");
                yield 5;                                                                
        };

        System.out.println(result2);
    }

    public static int getDayNumber(Weekday weekday){
        switch(weekday){
            case MON:
                return 1;
            case TUE:
                return 2;
            case WED:
                return 3;
            case THUR:
                return 4;
            case FRI:
                return 5;
            default:
                return 0;
        }
    }
}
