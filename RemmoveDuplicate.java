public class RemmoveDuplicate {
    public static boolean[] map = new boolean[26];

    public static void remmoveDuplicate(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        if (map[currChar - 'a']) {
            remmoveDuplicate(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            remmoveDuplicate(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        remmoveDuplicate(str, 0, "");
    }
}
