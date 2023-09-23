public class FirstProgram {

    static void sum(int numA, int numB) {
        int sum = numA + numB;

        switch (Integer.compare(sum, 0)) {
            case 1:
                System.out.println("Positive sum: " + sum);
                break;
            case -1:
                System.out.println("Upss, it's not positive sum: " + sum);
                break;
            default:
                System.out.println("WOW");
        }
    }

    static void calc(double numA, int numB, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                if (numB != 0) {
                    result = numA / numB;
                } else {
                    System.out.println("Ты забыл, что на 0 делить нельзя))))" );
                    return;
                }
                break;
            default:
                System.out.println("Oops, it's incorrect operation");
                return;
        }

        if (result != 0) {
            System.out.println("Result of " + operation + " is = " + result);
        }
    }

    public static void main(String[] args) {
        calc(3, 95, '+');
        calc(3, 95, '-');
        calc(3, 95, '*');
        calc(3, 2, '/');
        calc(3, 0, '/');
        calc(3, 95, '@');

    }
}