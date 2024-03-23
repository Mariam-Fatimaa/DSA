class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int remainder = x % 10;
            reverse = (int) reverse * 10 + remainder;
            x = (int) x / 10;
            System.out.println("The reverse is : " + reverse);
        }
        if (original == reverse) {
            System.out.println("They are plaindrome.");
            return true;
        }
        return false;
    }
}