public class CS1702_Lab4 {

	public static void main(String[] args) {

		// * Title of the program
		System.out.println("Questions from Lab 3 - Conditional Statements ");
		System.out.println("*****************************************\n");

		System.out.println("4.2 Relational operators");
		System.out.println("**********************");
		Answers_Q4_1();

		System.out.println("\n4.4 Compound Conditions");
		System.out.println("**********************");
		Answers_Q4_2();

		System.out.println("\n4.3 Designing if Statements");
		System.out.println("**********************");
		System.out.println("Number 90:");
		Answers_Q4_3(90);
		System.out.println("Number 72:");
		Answers_Q4_3(72);
		System.out.println("Number 15:");
		Answers_Q4_3(15);

		System.out.println("\n4.5 Using switch Statements");
		System.out.println("**********************");
		Answers_Q4_4("cod");
		Answers_Q4_4("baboon");
		Answers_Q4_4("tarantula");
		Answers_Q4_4("centipede");

		System.out.println("4.6 The ?: Notation");
		System.out.println("**********************");
		Answers_Q4_5();
	}

	protected static void Answers_Q4_1() {

		int x = 100, y = 204;
		double z = -23.1;
		boolean a = true, b = false;
		double c = -204;

		System.out.println("1)  x < y:");
		if (x < y) {
			System.out.println("\tx is less than y");
		} else {
			System.out.println("\tx is NOT less than y");
		}

		System.out.println("2)  x > z and a = b");
		if (x > z && a == b) {
			System.out.println("\tx is greater than z and a is equal be b:");
		} else {
			System.out.println("\tEither x is NOT greater than z OR a is NOT equal be b");
		}

		System.out.println("3)	2c > y:");
		if (2 * c > y) {
			System.out.println("\t2c is greater than y");
		} else {
			System.out.println("\t2c is NOT greater than y");
		}

		System.out.println("4)  x = b");
		System.out.println("\tA boolean and an int type cannot be compared");

		System.out.println("5)  c ≠ y or c = y");
		if (c != y || c == y) {
			System.out.println("\tEither c is NOT equal to y OR c is equal to y");
		} else {
			System.out.println("It cannot be false");
		}

		System.out.println("6)	z ≠ y and c = a");
		System.out.println("\tA boolean (a) and an int (c) type cannot be compared");

		System.out.println("7)	y ≥ y and a+3 ≠ 2");
		System.out.println("\tA boolean type (a) and a number (3) cannot be compared");

	}

	protected static void Answers_Q4_2() {

		System.out.println("Three integers in ascending order:");

		int a = 10, b = -10, c = 3;

		// * These if/else will find the first ascending number
		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < a && b < c) {
			System.out.println("\s" + b);
		} else {
			System.out.println("\s" + c);
		}

		// * These if/else will find the second ascending number
		if ((a < b && a > c) || (a > b && a < c)) {
			System.out.println("\s" + a);
		} else if ((b < a && b > c) || (b > a && b < c)) {
			System.out.println("\s" + b);
		} else {
			System.out.println("\s" + c);
		}

		// * These if/else will find the third ascending number
		if (a > b && a > c) {
			System.out.println("\s" + a);
		} else if (b > a && b > c) {
			System.out.println("\s" + b);
		} else {
			System.out.println(c);
		}

		System.out.println("Three name in alphabetical order:");

		String name1 = "ali", name2 = "charlie", name3 = "bob";

		int n1 = name1.toLowerCase().codePointAt(0);
		int n2 = name2.toLowerCase().codePointAt(0);
		int n3 = name3.toLowerCase().codePointAt(0);

		// * These if/else will find the first ascending number
		if (n1 < n2 && n1 < n3) {
			System.out.println("\s" + name1);
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("\s" + name2);
		} else {
			System.out.println("\s" + name3);
		}

		// * These if/else will find the second ascending number
		if ((n1 < n2 && n1 > n3) || (n1 > n2 && n1 < n3)) {
			System.out.println("\s" + name1);
		} else if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)) {
			System.out.println("\s" + name2);
		} else {
			System.out.println("\s" + name3);
		}

		// * These if/else will find the third ascending number
		if (n1 > n2 && n1 > n3) {
			System.out.println("\s" + name1);
		} else if (n2 > a && n2 > n3) {
			System.out.println("\s" + name2);
		} else {
			System.out.println("\s" + name3);
		}

	}

	protected static void Answers_Q4_3(int number) {
		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("\s" + number + " is divisible by 2 and 3");
		} else {
			System.out.println("\s" + number + " not is divisible by 2 or 3");

		}
		if (number % 7 == 0 || number % 9 == 0) {
			System.out.println("\s" + number + " is divisible by 7 or 9");
		} else {
			System.out.println("\s" + number + " not is divisible by 7 and 9");

		}
		if (number % 2 == 0 && number % 3 == 0 && number % 5 != 0) {
			System.out.println("\s" + number + " is divisible by 2 and 3 but not 5");
		} else {
			System.out.println("\s" + number + " not is divisible by 2 or 3 but could be divisible 5");

		}
	}

	protected static void Answers_Q4_4(String creature) {
		int numberOfLegs;
		switch (creature.toLowerCase()) {
		case "cobra":
		case "cod":
		case "black scorpion":
		case "minke whale":
			numberOfLegs = 0;
			break;

		case "human":
		case "klingon":
			numberOfLegs = 2;
			break;

		case "alsatian dog":
		case "sphynx cat":
		case "baboon":
		case "potto":
		case "ocelot":
			numberOfLegs = 4;
			break;

		case "tarantula":
		case "paul allen the german octopus":
			numberOfLegs = 8;
			break;

		case "centipede":
			numberOfLegs = 100;
			break;

		default:
			numberOfLegs = -1;
			break;
		}
		System.out.printf("The %s has %d leg\n", creature, numberOfLegs);
	}

	protected static void Answers_Q4_5() {

		int x = 100, y = 204;
		double z = -23.1;
		boolean a = true, b = false;
		double c = -204;

		System.out.println("1)  x < y:");
		System.out.println(x < y ? "\tx is less than y" : "\tx is NOT less than y");

		System.out.println("2)  x > z and a = b");
		System.out.println(x > z && a == b ? "\tx is greater than z and a is equal be b:"
				: "\tEither x is NOT greater than z OR a is NOT equal be b");

		System.out.println("3)	2c > y:");
		System.out.println(2 * c > y ? "\t2c is greater than y" : "\t2c is NOT greater than y");

		System.out.println("4)  x = b");
		System.out.println("\tA boolean and an int type cannot be compared");

		System.out.println("5)  c ≠ y or c = y");
		System.out.println(c != y || c == y ? "\tEither c is NOT equal to y OR c is equal to y" : "It cannot be false");

		System.out.println("6)	z ≠ y and c = a");
		System.out.println("\tA boolean (a) and an int (c) type cannot be compared");

		System.out.println("7)	y ≥ y and a+3 ≠ 2");
		System.out.println("\tA boolean type (a) and a number (3) cannot be compared");

	}
}
