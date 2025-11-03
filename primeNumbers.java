import java.util.Scanner;

public class primeNumbers {
    public static boolean check(int num){
        boolean isPrime = true;
        for (int i = 2; i < num; i++ ){
            if (num%i != 0){
                isPrime = true;
            }else{
                isPrime = false;
                break;
            }
        }
        return(isPrime);
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");
        int number = myObj.nextInt();  // Read user input
        myObj.close(); //Close scaner
        System.out.println("You entered: " + number); // print the value

        System.out.println(check(5));
        //something

    }
}