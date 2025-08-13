public class Subsequence {
    public static void subSequence(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        subSequence(str, idx + 1, newStr + currChar);
        subSequence(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, 0, "");
    }
}
