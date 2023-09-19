import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //func2();
        //func3();
        //func4();
        //func5();
        func6();
    }

    public static void func2() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Letters without spaces: " + count);
    }

    public static void func3() {
        System.out.print("Enter a string: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean isPolindrom = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPolindrom = false;
            }
        }

        if (isPolindrom) {
            System.out.println("The string is polindrom");
        } else {
            System.out.println("The string is not polindrom");
        }

    }

    public static void func4() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - i - 1));
        }

    }

    public static void func5()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();

        str = str.replace('a', '*');
        str = str.replace('e', '*');
        str = str.replace('i', '*');
        str = str.replace('o', '*');
        str = str.replace('u', '*');

        System.out.println("New String: " + str);
    }

    public static void func6()
    {
        int a = 1;
        int b = 1;
        int num = 0;
        boolean isFound = true;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = s.nextInt();

        while (true)
        {
            if (a == num || b == num)
            {
                System.out.println("The number " + num + " found in the fib");
                break;
            }
            else if(a > num || b > num)
            {
                System.out.println("The number " + num + " not found in the fib");
                isFound = false;
                break;
            }

            a = a + b;
            b = a + b;
        }

        a = 1;
        b = 1;
        int c = 0;
        int index = 1;

        if (isFound)
        {
            while (true)
            {
                c = a + b;

                index++;
                a = b;
                b = c;

                if(a == num)
                {
                    System.out.println("The index is: " + index);
                    break;
                }

            }
        }


    }
}