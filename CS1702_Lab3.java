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

        String Questions[][] = {
                { String.format("Q1) y = a[%d] + b[%.1f]:", a, b), "valid" },
                { String.format("Q2) y = a[%d] + d[%b]:", a, d), "invalid" },
                { String.format("Q3) z = e[%s] + f[%s]:", e, f), "valid" },
                { String.format("Q4) y = b[%.1f] * c[%.1f]:", b, c), "valid" },
                { "Q5) pi = 22/7:", "invalid" },
                { String.format("Q6) z = name[%s] / g[%d]:", name, g), "invalid" },
                { String.format("Q7) z = c[%.1f] / g[%d]:", c, g), "invalid" },
                { "Q8) x = 10 | x = x^3:", "invalid" },
                { String.format("Q9) z = name[%s] +z \" is \" + f[%s]+ h[%s]:", name, f, h), "valid" },
                { String.format("Q10) y = (name[%s] + 10)/(name + h[%s]):", name, h), "invalid" },
                { String.format("Q11) x = (a[%d] + b[%.1f]) / (d[%b] + c[[%.1f]]):", a, b, d, c), "invalid" },
                { String.format("Q12) y = 100.3  y = (y / (a[%d] + b[%.1f])) - c[%.1f]:", a, b, c), "valid" },
                { "Q13) x^2 = y^2 + z^2:", "invalid" },
                { String.format("Q14) name[%s] = \"Is \" + f[%s] - h[%s]:", name, f, h), "invalid" },
                { String.format("Q15) y = ((pi[%1$.3f]+1)/(pi[%1$.3f]+2))/(pi[%1$.3f]+3):", pi), "valid" },
                { String.format("Q16) y = -2 | y= Math.cbrt(Math.pow(y, b[%.1f])):", b), "invalid" },
                { String.format("Q17) y = b[%.1f] / g[%d] | z = y + name[%s]:", b, g, name), "invalid" },
                { String.format("Q18) z = name[%s], z = b[%.1f] / g[%d] + z:", name, b, g), "invalid" },
                { String.format("Q19) y = -2.3, y = ((a[%d] * (Math.pow(y, 2))) + (b[%.1f] * y) + c[%.1f])):", a, b, c),
                        "valid" },
                { String.format("Q20) y - ((a[%s] - b[%.1f])**((b[%2$.1f] - c[%.1f])**(c[%3$.1f] - d[%b]))):", a, b, c,
                        d), "invalid" },
        };

        // * Title of the program
        System.out.println("Questions from Lab 3");
        System.out.println("--------------------------------------------------------\n");

        int index = 0; // * index for Answers_invalidOnes function
        
        // * All questions  
        for (int i = 0; i < Questions.length; i++) {
            if (Questions[i][1] == "invalid") {
                // * All invalid questions  
                Answers_invalidOnes(Questions[i][0], index);
                index++;
            } else {
                // * All valid questions  
                System.out.println(Questions[i][0]);
                switch (i) {
                    case 0:
                        // * Answer to question 1
                        y = a + b;
                        System.out.println("\t" + y + "\n");
                        break;
                    case 2:
                        // * Answer to question 3
                        z = e + f;
                        System.out.println("\t" + z + "\n");
                        break;
                    case 3:
                        // * Answer to question 4
                        y = b * c;
                        y = b * c;
                        System.out.println("\t" + y + "\n");
                        break;
                    case 8:
                        // * Answer to question 9
                        z = name + " is " + f + h;
                        System.out.println("\t" + z + "\n");
                        break;
                    case 11:
                        // * Answer to question 12
                        y = 100.3;
                        y = (y / (a + b)) - c;
                        System.out.println("\t" + y + "\n");
                        break;
                    case 14:
                        // * Answer to question 15
                        y = ((pi + 1) / (pi + 2)) / (pi + 3);
                        System.out.println("\t" + y + "\n");
                        break;
                    case 18:
                        // * Answer to question 19
                        y = -2.3;
                        y = (a * (Math.pow(y, 2))) + (b * y) + c;
                        System.out.println("\t" + y + "\n");
                        break;

                }

            }
        }

    }

    protected static void Answers_invalidOnes(String question, int index) {
        String answers[] = {
                "a int and a boolean cannot be "
                        + "added together\n",
                "pi is constant and cannot be changed\n",
                "a string can not be divided\n",
                "zero cannot be divided by\n",
                "x is type long and \n\tthe Math.pow returns a double\n",
                "a string can not be divided "
                        + "\n\tand y is of type double\n",
                "a boolean cannot be "
                        + "used within an equation\n",
                "an equation cannot be a variable and "
                        + "\n\ta string cannot be squared.\n",
                "you cannot minus a string"
                        + "\n\tand name is a constant\n",
                "y is of type double and -2 is an integer\n",
                "zero cannot be divided by\n",
                "a string can not be divided\n",
                "a boolean cannot be "
                        + "used within an equation\n"
        };
        
        // * displays the invalid question and answer
        System.out.println(question);
        System.out.print("\tThis expression is invalid \n\tbacause\s");
        System.out.println(answers[index]);
    }
}
