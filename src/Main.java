//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 9;
        int intOperandB = 3;
        int intSum = 7;//this will be overwritten, as will the below ints.
        int intProduct = 6;
        int intDifference = 2;
        int intQuotient = 4;
        int intModulo = 1;

        double doubleOperandA = 46.12;
        double doubleOperandB = 23.30;
        double doubleSum = 67.54;//this will be overwritten, as will the below doubles.
        double doubleProduct = 34.78;
        double doubleDifference = 53.61;
        double doubleQuotient = 29.28;

        System.out.println("Ints:");//not strictly asked for but it made things easier to read.

        intSum = intOperandA+intOperandB;
        System.out.println("The sum using ints of "+intOperandA+" and "+intOperandB+" is "+intSum);

        intProduct = intOperandA*intOperandB;
        System.out.println("The product using ints of "+intOperandA+" and "+intOperandB+" is "+intProduct);

        intDifference = intOperandA-intOperandB;
        System.out.println("The difference using ints of "+intOperandA+" and "+intOperandB+" is "+intDifference);

        intQuotient = intOperandA/intOperandB;
        System.out.println("The quotient using ints of "+intOperandA+" and "+intOperandB+" is "+intQuotient);

        intModulo = intOperandA%intOperandB;
        System.out.println("The modulo using ints of "+intOperandA+" and "+intOperandB+" is "+intModulo);

        System.out.println("Doubles:");//not strictly asked for but it made things easier to read.

        doubleSum = doubleOperandA+doubleOperandB;
        System.out.println("The sum using doubles of "+doubleOperandA+" and "+doubleOperandB+" is "+doubleSum);

        doubleProduct = doubleOperandA*doubleOperandB;
        System.out.println("The product using doubles of "+doubleOperandA+" and "+doubleOperandB+" is "+doubleProduct);

        doubleDifference = doubleOperandA-doubleOperandB;
        System.out.println("The difference using doubles of "+doubleOperandA+" and "+doubleOperandB+" is "+doubleDifference);

        doubleQuotient = doubleOperandA/doubleOperandB;
        System.out.println("The quotient using doubles of "+doubleOperandA+" and "+doubleOperandB+" is "+doubleQuotient);

        System.out.println("Part 1, Question 12 onward:");

        int siblingCount = 4; //unless we count pets and/or in-laws
        boolean isRaining = true;//as of 9:14 1/30/2025
        double gasPrice = 3.10; //Regular from Shell on Calhoun
        int favoriteNumber = 3;
        int shoeSize = 5;
        String birthMonth = "February";
        String myFullName = "Nolan A. Crone";
    }
}