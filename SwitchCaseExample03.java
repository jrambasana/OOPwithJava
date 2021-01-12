public class SwitchCaseExample03 {
    enum Day { MON, TUE, WED, THU, FRI, SAT, SUN};
    enum Color {RED, GREEN, BLUE, ORANGE, BLACK, WHITE};     
    public static void main(String[] args) {
        Day[] dayNow = Day.values();
        for (Day day : dayNow) {
            switch(day){
                case MON:
                    System.out.println("Monday");
                    break;
                case TUE:
                    System.out.println("Tuesday");
                    break;
                case WED:
                    System.out.println("Wednesday");
                    break;
                case THU:
                    System.out.println("Thursday");
                    break;
                case FRI:
                    System.out.println("Friday");
                    break;
                case SAT:
                    System.out.println("Saturday");
                    break;
                case SUN:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
