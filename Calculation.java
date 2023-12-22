import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

//        Rent
        Scanner rentObj = new Scanner(System.in);
        System.out.println("Enter This months rent: ");

        double rent = rentObj.nextDouble();


        System.out.println("Rent is: " + rent / 3 + "\n");

//        Internet
        Scanner internetObj = new Scanner(System.in);
        System.out.println("Enter Internet Bill: ");

        double internet = internetObj.nextDouble();

        System.out.println("Internet is: " + internet / 3 + "\n");

//        Water
        Scanner waterObj = new Scanner(System.in);
        System.out.println("Enter Water Bill: ");

        double water = waterObj.nextDouble();

        System.out.println("Water is: " + water / 3 + "\n");

//        Electric
        Scanner electricObj = new Scanner(System.in);
        System.out.println("Enter Electric Bill: ");

        double electric = electricObj.nextDouble();

        System.out.println("Electric is: " + electric / 3 + "\n");

//        Food
        Scanner foodObj = new Scanner(System.in);
        System.out.println("Enter Food Total: ");

        double food = foodObj.nextDouble();

        System.out.println("Food is: " + food / 3 + "\n");

//        Insurance
        double insurance = 10;

        System.out.println("Insurance is: " + insurance + "\n");

//        Gas
        double gasObj = 3.5;

//        How many times did Cam drive?
        Scanner CamObj = new Scanner(System.in);
        System.out.println("How many times did Cam drive?");

        int Cam = CamObj.nextInt();

//        How many times did Kat drive?
        Scanner KatObj = new Scanner(System.in);
        System.out.println("How many times did Kat drive?");

        int Kat = KatObj.nextInt();

//        How many times did you Lyft?
        Scanner LyftObj = new Scanner(System.in);
        System.out.println("How many times did you Lyft?");

        int Lyft = LyftObj.nextInt();

        System.out.println("Your Total For Cam's Gas Is: " + gasObj * Cam + "\n");
        System.out.println("Your Total For Kat's Gas Is: " + gasObj * Kat + "\n");
        System.out.println("Your Total For What You Keep: " + gasObj * Lyft + "\n");

//        Extra
        Scanner extraObj = new Scanner(System.in);
        System.out.println("Was there any extra expenses? (Enter exact $ amount now)");

        double extra = extraObj.nextDouble();

        System.out.println("Extra Costs is: " + extra + "\n");

//        Total
        double total = (rent / 3) + (internet / 3) + (water / 3) + (electric / 3) + (food / 3) + insurance + (Cam * gasObj) + (Kat *gasObj) - (Lyft * gasObj) + extra;

        System.out.println("Total For The Month Is: " + total);

    }

}
