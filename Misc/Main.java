package Misc;
// public class Main {

//     public static void main(String[] args) {
//         Linked list = new Linked();
//         list.insertLast(2);
//         list.insertLast(1);
//         // list.insertFirst(3);
//         // list.insertFirst(4);
//         // list.insertFirst(5);
//         list.insert(6,0);
//         list.display();
//     }
// }

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] prices = { 7, 2, 5, 3, 6, 13 };
        // int maxP = 0;
        // for (int i = 0; i < prices.length; i++) {
        // for (int j = i + 1; j < prices.length; j++) {
        // int profit = prices[j] - prices[i];
        // maxP = Math.max(profit, maxP);
        // }
        // }
        // System.out.println(maxP);
        // String input = "A man, a pan, a canal: Panama";
        String input = "race";
        String t = "racs";
        System.out.println(isPalindrome(input, t));
    }

    public static boolean isPalindrome(String s, String t) {

        // String regex = "[^A-Za-z0-9]";

        // String res = s.toLowerCase().replaceAll(regex, "");
        // int start = 0;
        // int end = res.length() - 1;
        // while (start < end) {
        // if (res.charAt(start) != res.charAt(end)) {
        // return false;
        // } else {
        // start += 1;
        // end -= 1;
        // }
        // }(
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
        // return true;
    }

}