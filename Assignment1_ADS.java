import java.util.Scanner;

public class Assignment1_ADS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ASSIGNMENT 1: RECURSION ===\n");


        System.out.println("Task 1: Print Digits");
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        System.out.println("Digits:");
        printDigits(num);
        System.out.println();


        System.out.println("\nTask 2: Average of Elements");
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = sumArray(arr, 0);
        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


        System.out.println("\nTask 3: Prime Number Check");
        System.out.print("Enter number: ");
        int primeCheck = scanner.nextInt();
        if (isPrime(primeCheck, 2)) {
            System.out.println(primeCheck + " is Prime");
        } else {
            System.out.println(primeCheck + " is Composite");
        }


        System.out.println("\nTask 4: Factorial");
        System.out.print("Enter number: ");
        int factNum = scanner.nextInt();
        System.out.println(factNum + "! = " + factorial(factNum));


        System.out.println("\nTask 5: Fibonacci");
        System.out.print("Enter n: ");
        int fibN = scanner.nextInt();
        System.out.println("Fibonacci(" + fibN + ") = " + fibonacci(fibN));


        System.out.println("\nTask 6: Power Function");
        System.out.print("Enter base and exponent: ");
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));


        System.out.println("\nTask 7: Reverse Output");
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] revArr = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            revArr[i] = scanner.nextInt();
        }
        System.out.print("Reversed order: ");
        printReverse(revArr, 0);
        System.out.println();


        System.out.println("\nTask 8: Check Digits in String");
        System.out.print("Enter string: ");
        String str = scanner.next();
        if (isAllDigits(str, 0)) {
            System.out.println("\"" + str + "\" contains only digits: Yes");
        } else {
            System.out.println("\"" + str + "\" contains only digits: No");
        }


        System.out.println("\nTask 9: Count Characters in String");
        System.out.print("Enter string: ");
        String str2 = scanner.next();
        System.out.println("Length of \"" + str2 + "\" = " + stringLength(str2, 0));


        System.out.println("\nTask 10: Greatest Common Divisor (GCD)");
        System.out.print("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("GCD(" + x + ", " + y + ") = " + gcd(x, y));

        scanner.close();
        System.out.println("\n=== ALL TASKS COMPLETED ===");
    }


    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }


    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }


    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }


    public static void printReverse(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        printReverse(arr, index + 1);
        System.out.print(arr[index] + " ");
    }


    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return isAllDigits(s, index + 1);
    }


    public static int stringLength(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        return 1 + stringLength(s, index + 1);
    }


    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}