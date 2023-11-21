public class MethodsPractice {

    static void getEnergyEfficiency(char category) {
        switch (category){
            case 'A':
            case 'a':
                System.out.println("Very low energy consumption");
                break;
            case 'B':
            case 'b':
                System.out.println("Low energy consumption");
                break;
            case 'C':
            case 'c':
                System.out.println("Normal energy consumption");
                break;
            case 'D':
            case 'd':
                System.out.println("Above normal energy consumption");
                break;
            case 'E':
            case 'e':
                System.out.println("High energy consumption");
                break;
            case 'F':
            case 'f':
                System.out.println("Very high energy consumption");
                break;
            case 'G':
            case 'g':
                System.out.println("Extreme energy consumption");
                break;
            default:
                System.out.println("Not a specified category");
        }
    }
    static void getCarDescription(String model, int productionyear, String condition){
        System.out.println("This car is a : "+ model);
        System.out.println("Production Year : "+ productionyear);
        System.out.println("This is in "+ condition +" Condition");

    }
    public static void main(String[] args) {
        getEnergyEfficiency('a');
        getCarDescription("Tesla",2018,"Good");

    }


}
