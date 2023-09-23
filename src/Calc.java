public class Calc {

    static void calcifelse(double numA, int numB, char operation){
        double result = 0;
        if (operation == '+'){
            result = numA + numB;
        } else if (operation == '-'){
            result = numA - numB;
        } else if (operation == '*'){
            result = numA * numB;
        } else if (operation == '/'){
            result = numA / numB;
        } else {
            System.out.println("Oops, there's something wrong!");
        }
        if (result != 0) System.out.println("The result of " + operation + " the numbers is " + result);
    }

    static void calcswitch(double numA, int numB, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = numA + numB;
                System.out.println("The result of " + operation + " the numbers is " + result);
                break;
            case '-':
                result = numA - numB;
                System.out.println("The result of " + operation + " the numbers is " + result);
                break;
            case '*':
                result = numA * numB;
                System.out.println("The result of " + operation + " the numbers is " + result);
                break;
            case '/':
                result = numA / numB;
                System.out.println("The result of " + operation + " the numbers is " + result);
                break;
            default:
                System.out.println("Oops, there's something wrong!");
        }
    }

    public static void main(String[] args) {
        calcifelse(10, 5, '+');
        calcifelse(10, 5, '-');
        calcifelse(10, 5, '*');
        calcifelse(10, 5, '/');
        calcifelse(10, 5, '!');
        calcswitch(100, 50, '+');
        calcswitch(100, 50, '-');
        calcswitch(100, 50, '*');
        calcswitch(100, 50, '/');
        calcswitch(100, 50, '!');
    }
}