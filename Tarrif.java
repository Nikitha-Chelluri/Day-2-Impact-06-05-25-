import java.util.*;
class Tarrif {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Which month: ");
        int month = s.nextInt();
        System.out.println("Enter Rent per day: ");
        double rent = s.nextInt();
        System.out.println("Enter No. of Days: ");
        int days = s.nextInt();
        double Amount = 0;
        if ((month <= 12) & (month >= 1)) {
            if (((month >= 4) & (month <= 6)) || ((month == 11) || (month ==  12))) {
                double increment = rent * (0.2);
                rent = rent + increment;
                Amount = rent * days;
                System.out.println("Rent to be Paid is: "+Amount); 
            }
            else {
                Amount = rent * days;
                System.out.println("Enter Which month: "+Amount);
            }
        }
        else {
            System.out.println("Not a Valid Month");
        }
    }
}