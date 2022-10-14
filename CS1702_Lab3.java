
public class CS1702_Lab3 {
    public static void main(String[] args) {

        int a = 100;
        double b = 2.3, c = -52.2;
        boolean d = true;
        String e = "I am ",
                f = "a student";
        int g = 0;
        char h = '!';
        final double pi = 3.142;
        final String name = "ilwad";
        long x;
        double y;
        String z;

        // * Title of the program
        System.out.println("Questions from Lab 3");
        System.out.println("--------------------------------------------------------\n");

        // * Question 1
        System.out.println("Q1) y = a + b");
        y = a + b;
        System.out.println("\t" + y + "\n");

        // * Question 2
        Answers_Q2_1();

        // * Question 3
        System.out.println("Q3) z = e + f");
        z = e + f;
        System.out.println("\t" + z + "\n");

        // * Question 4
        System.out.println("Q1) y = bc");
        y = b * c;
        System.out.println("\t" + y + "\n");

        // * Question 5
        Answers_Q5_2();

        // * Question 6
        Answers_Q6_3();

        // * Question 7
        Answers_Q7_4();

        // * Question 8
        Answers_Q8_5();

        // * Question 9
        System.out.println("Q9) z = name + \" is \" + f + h");
        z = name + " is " + f + h;
        System.out.printf("\t%s\n\n", z);

        // * Question 10
        Answers_Q10_6();

        // * Question 11
        Answers_Q11_7();

        // * Question 12
        System.out.println("Q12) y = 100.3, y = (y / (a + b)) - c ");
        y = 100.3;
        y = (y / (a + b)) - c;
        System.out.println("\t" + y + "\n");

        // * Question 13
        Answers_Q13_8();

        // * Question 14
        Answers_Q14_9();

        // * Question 15
        System.out.println("Q9)  y = ((pi+1)/(pi+2))/(pi+3)");
        y = ((pi + 1) / (pi + 2)) / (pi + 3);
        System.out.println("\t" + y + "\n");

        // * Question 16
        Answers_Q16_10();
        // * Question 17
        Answers_Q17_11();
        // * Question 18
        Answers_Q18_12();

        // * Question 19
        System.out.println("Q19 y = -2.3, y = ((a * (Math.pow(y, 2))) + (b * y) + c))");
        y = -2.3;
        y = (a * (Math.pow(y, 2))) + (b * y) + c;
        System.out.println("\t" + y + "\n");

        // * Question 20
        Answers_Q20_13();

    }

    protected static void Answers_Q2_1() {
        // * Question
        System.out.println("Q2) y = a + d");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "because a int \n\tand a boolean cannot be "
                + "added together\n");
    }

    protected static void Answers_Q5_2() {
        // * Question
        System.out.println("Q5) pi = 22/7");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbacause pi is constant and cannot be changed\n");
    }

    protected static void Answers_Q6_3() {
        // * Question
        System.out.println("Q6) z = name / g");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbacause a string can not be divided\n");
    }

    protected static void Answers_Q7_4() {
        // * Question
        System.out.println("Q7) z = c / g");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbacause zero cannot be divided by\n");
    }

    protected static void Answers_Q8_5() {
        // * Question
        System.out.println("Q8) x = 10, x = x3");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbacause x is type long where it should a int\n");
    }

    protected static void Answers_Q10_6() {
        // * Question
        System.out.println("Q10) y = (name + 10)/(name + h)");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbacause a string can not be divided "
                + "\n\tand y is of type double\n");
    }

    protected static void Answers_Q11_7() {
        // * Question
        System.out.println("Q11) x = (a +b)/(d+c)");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbecause a boolean cannot be "
                + "used within an equation\n");
    }

    protected static void Answers_Q13_8() {
        // * Question
        System.out.println("Q13) x**2 = y**2 + z**2");
        // * Answer
        System.out.println("\tThis expression is invalid. "
                + "An equation cannot be a variable and "
                + "/n/ta string cannot be squared. ");
    }

    protected static void Answers_Q14_9() {
        // * Question
        System.out.println("Q14) name = \"Is \" + f - h");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "/n/tbecause you cannot minus a string"
                + "/n/tand name is a constant");
    }

    protected static void Answers_Q16_10() {
        // * Question
        System.out.println("Q16) y= Math.cbrt(Math.pow(y, b))");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "/n/tbecause y and b are types double");
    }

    protected static void Answers_Q17_11() {
        // * Question
        System.out.println("Q17) y = b/g, z = y + name");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbacause zero cannot be divided by\n");
    }

    protected static void Answers_Q18_12() {
        // * Question
        System.out.println("Q18) z = name, z = b/g + z");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "\n\tbacause zero (g) cannot be divided by\n");
    }

    protected static void Answers_Q20_13() {
        // * Question
        System.out.println("Q20) y = y - ((a - b)**((b - c)**(c - d)))");
        // * Answer
        System.out.println("\tThis expression is invalid "
                + "/n/tbecause a boolean cannot be "
                + "used within an equation\n");
    }
}
