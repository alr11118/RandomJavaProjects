import java.util.Scanner;
// Method to check if num is a prime number
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
        // Creates a String for prime numbers before number
        String primeNumbersBeforeNumber = "";
        // Takes input for number
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");
        int number = myObj.nextInt();  // Read user input
        myObj.close(); //Close scaner
        System.out.println("You entered: " + number); // print the value
        // Adds values to the mentioned string
        for (int i = 2; i <= number; i++){
            if (check(i)==true){
                primeNumbersBeforeNumber += (i + " "); 
            }
        }
        // Prints the resaults
        System.out.println("The prime numbers before " + number + " is " + primeNumbersBeforeNumber);
    }//texting
}