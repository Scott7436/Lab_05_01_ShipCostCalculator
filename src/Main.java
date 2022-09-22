public class Main {
    public static void main(String[] args)
    {
        double price = 100;
        double shipping = price * 0.02;


        if(price >= 100)
        {
            System.out.println("Your shipping cost is $0.00");
            System.out.println("Your total price is " +price);
        }
        else
        {
            System.out.println("Your shipping price is " + shipping);
            System.out.println("Your total price is " + (price + shipping));
        }
    }
}