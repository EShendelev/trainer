package SptintSix.FirstTheme.ex5_4;


public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeLine(" Молебен   о коне белом"));
    }
    public static boolean isPalindromeLine(String str) {
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == ' ') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        StringBuilder sb1 = new StringBuilder(sb);
        sb1.reverse();
        return sb1.toString().equals(sb.toString());
    }
}