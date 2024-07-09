import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Input:");
            String answer = CalcTest.calc(input.nextLine());

            System.out.println("Output: \n" + answer);
            if (answer.length() > 3){
                break;
            }
        }
    }
}

class CalcTest{

    public static String calc(String input){
        String exs = "throws Exception";
        String[] arrStr = input.split(" ");

        if(arrStr.length != 3){
            return exs + ": enter format string a + b";

        }

        int firstInt = Integer.parseInt(arrStr[0]);
        int secondInt = Integer.parseInt(arrStr[2]);

        if ((firstInt < 0) || (firstInt > 10) || (secondInt <= 0) || (secondInt > 10)) {
            return exs + ": the entered number is not within the range of numbers from 0...10 inclusive or division by 0 is not allowed";
        }

        String operator = arrStr[1];

        int result;

        switch (operator){
            case "+" -> result = firstInt + secondInt;
            case "-" -> result = firstInt - secondInt;
            // case "/" -> result = Math.round(firstInt / secondInt);
            case "/" -> result = firstInt / secondInt;
            case "*" -> result = firstInt * secondInt;
            default ->{
                return exs + ": invalid operator";
            }
        }


        return Integer.toString(result);
    }
}

