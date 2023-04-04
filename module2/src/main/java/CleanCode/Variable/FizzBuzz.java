package CleanCode.Variable;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBizz = number % 5 == 0;

        if(isFizz && isBizz)
            return "FizzBuzz";

        if(number % 3 == 0)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}