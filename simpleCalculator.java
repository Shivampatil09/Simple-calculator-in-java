import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter the First number:- ");
        double num1 = obj.nextDouble();
        System.out.print("\nEnter the second number:- ");
        double num2 = obj.nextDouble();
        System.out.print("\nEnter the operator:- ");
        char operator = obj.next().charAt(0);
        double result;
        while (true) {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.print("\nAns is:- " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.print("\nAns is:- " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.print("\nAns is:- " + result);
                    break;
                case '/':
                    if (num1 == 0 || num2 == 0) {
                    /* try{
                         result = num1/num2;
                         System.out.print("Ans is:- "+result);
                     }catch(ArithmeticException e){
                        System.out.print("Can not divide by Zero!");
                       }*/
                        System.out.print("\nCan not divide by Zero!");
                    } else {
                        result = num1 / num2;
                        System.out.print("\nAns is:- " + result);
                    }
            }
            System.out.print("\nDo you want to calculate again:- ");
            String opinion = obj1.nextLine();
            if(opinion.equals("yes") || opinion.equals("Yes")){
                System.out.print("***********************************************");
            }
            else if(opinion.equals("no") || opinion.equals("No")){
                System.out.print("\nThank you for using our calculator");
                break;
            }
            else{
                System.out.print("\nEnter a valid input!");
            }
        }
    }
}
