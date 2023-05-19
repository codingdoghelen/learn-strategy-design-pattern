public class CheckPalindrome_9 {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(checkPalindrome(0));

        System.out.println(checkPalindrome(1));

        System.out.println(checkPalindrome(121));

    }

    private static boolean checkPalindrome(int num) {

        // 121 // 1234
        // 1234 % 10 = 4 = b
        // 1234 /10 = 123 = c

        // Handle edge cases if nums is 0 or nums ends with 0
        if (num == 0) return true;
        if (num < 0 || (num % 10 == 0)) return false;

        int backNumber = 0;
        int copyNumber = num;


        // * Last Number is % 10
        while (copyNumber > 0) {
            backNumber = backNumber * 10 + copyNumber % 10;
            copyNumber = copyNumber / 10;
        }

        return backNumber == num;
    }

}

