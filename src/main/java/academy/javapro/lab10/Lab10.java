package academy.javapro.lab10;

public class Lab10 {

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int countEars(int n) {
        if (n == 0) return 0;
        return 2 + countEars(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int specialEars(int n) {
        if (n == 0) return 0;
        if (n % 2 == 1) return 2 + specialEars(n - 1);
        return 3 + specialEars(n - 1);
    }

    public static int triangleBlocks(int n) {
        if (n == 0) return 0;
        return n + triangleBlocks(n - 1);
    }

    public static int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }

    public static int countSevens(int n) {
        if (n == 0) return 0;
        if (n % 10 == 7) return 1 + countSevens(n / 10);
        return countSevens(n / 10);
    }

    public static int countEights(int n) {
        if (n == 0) return 0;
        int rightDigit = n % 10;
        int secondRightDigit = (n / 10) % 10;
        if (rightDigit == 8 && secondRightDigit == 8) return 2 + countEights(n / 10);
        if (rightDigit == 8) return 1 + countEights(n / 10);
        return countEights(n / 10);
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }

    public static String replaceChar(String str) {
        if (str.length() == 0) return "";
        if (str.charAt(0) == 'x') return "y" + replaceChar(str.substring(1));
        return str.charAt(0) + replaceChar(str.substring(1));
    }

    public static String removeChar(String str) {
        if (str.length() == 0) return "";
        if (str.charAt(0) == 'x') return removeChar(str.substring(1));
        return str.charAt(0) + removeChar(str.substring(1));
    }

    public static String markPairs(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + markPairs(str.substring(1));
        return str.charAt(0) + markPairs(str.substring(1));
    }

    public static String deduplicate(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1))
            return deduplicate(str.substring(1));
        return str.charAt(0) + deduplicate(str.substring(1));
    }

    public static int countHiSpecial(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) return 1 + countHiSpecial(str.substring(2));
        if (str.length() >= 3 && str.charAt(0) == 'x' && str.startsWith("hi", 1))
            return countHiSpecial(str.substring(3));
        return countHiSpecial(str.substring(1));
    }

    public static int substringLength(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        boolean startsWith = str.startsWith(sub);
        boolean endsWith = str.endsWith(sub);
        if (startsWith && endsWith) return str.length();
        int removeFirst = substringLength(str.substring(1), sub);
        int removeLast = substringLength(str.substring(0, str.length() - 1), sub);
        return Math.max(removeFirst, removeLast);
    }

    public static void towerOfHanoi(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        towerOfHanoi(n - 1, source, target, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        towerOfHanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        System.out.println("Testing factorial:");
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));

        System.out.println("\nTesting countEars:");
        System.out.println(countEars(0));
        System.out.println(countEars(1));
        System.out.println(countEars(2));

        System.out.println("\nTesting fibonacci:");
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));

        System.out.println("\nTesting specialEars:");
        System.out.println(specialEars(0));
        System.out.println(specialEars(1));
        System.out.println(specialEars(2));
        System.out.println(specialEars(3));

        System.out.println("\nTesting triangleBlocks:");
        System.out.println(triangleBlocks(0));
        System.out.println(triangleBlocks(1));
        System.out.println(triangleBlocks(2));
        System.out.println(triangleBlocks(3));

        System.out.println("\nTesting sumDigits:");
        System.out.println(sumDigits(126));
        System.out.println(sumDigits(49));
        System.out.println(sumDigits(12));

        System.out.println("\nTesting countSevens:");
        System.out.println(countSevens(717));
        System.out.println(countSevens(7));
        System.out.println(countSevens(123));

        System.out.println("\nTesting countEights:");
        System.out.println(countEights(8));
        System.out.println(countEights(818));
        System.out.println(countEights(8818));

        System.out.println("\nTesting countHi:");
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));

        System.out.println("\nTesting replaceChar:");
        System.out.println(replaceChar("codex"));
        System.out.println(replaceChar("xxhixx"));
        System.out.println(replaceChar("xhixhix"));

        System.out.println("\nTesting removeChar:");
        System.out.println(removeChar("xaxb"));
        System.out.println(removeChar("abc"));
        System.out.println(removeChar("xx"));

        System.out.println("\nTesting markPairs:");
        System.out.println(markPairs("hello"));
        System.out.println(markPairs("xxyy"));
        System.out.println(markPairs("aaaa"));

        System.out.println("\nTesting deduplicate:");
        System.out.println(deduplicate("yyzzza"));
        System.out.println(deduplicate("abbbcdd"));
        System.out.println(deduplicate("Hello"));

        System.out.println("\nTesting countHiSpecial:");
        System.out.println(countHiSpecial("ahixhi"));
        System.out.println(countHiSpecial("ahibhi"));
        System.out.println(countHiSpecial("xhixhi"));

        System.out.println("\nTesting substringLength:");
        System.out.println(substringLength("catcowcat", "cat"));
        System.out.println(substringLength("catcowcat", "cow"));
        System.out.println(substringLength("cccatcowcatxx", "cat"));

        System.out.println("\nTesting Tower of Hanoi (3 disks):");
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}