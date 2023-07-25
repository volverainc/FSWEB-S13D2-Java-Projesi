public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Palindrom Sayıyı Bulma----------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-----------Mükemmel Sayıları Bulma----------");
        System.out.println(isPerfectNumber(1));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("-----------Sayıları Kelimelere Dök----------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num) {
    String strNum = String.valueOf(num);
    StringBuilder reversedSb = new StringBuilder(strNum).reverse();
    String reversed = reversedSb.toString();
    char eksi = '-';
    String str1 = strNum.replace(String.valueOf(eksi), "");
    String str2 = reversed.replace(String.valueOf(eksi), "");
    if(str1.equals(str2)) {
        return true;
    }
    else {
        return false;
    }
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sums = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sums += i;
            }
        }

        return sums == num;
    }

    public static String numberToWords(int num){
        if(num < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder result = new StringBuilder();
        int digit;

        while (num > 0) {
            digit = num % 10;
            result.insert(0, words[digit] + " ");
            num /= 10;
        }

        return result.toString().trim();
    }
}