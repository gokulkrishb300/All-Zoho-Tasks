public class BalanceParenthesis {
    public static void main(String[] args) {
        String str = "(a+b)(()((c+d)";
        char[] arr = str.toCharArray();
        int open = 0, close = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == '(') {
                open++;
            } else if (arr[i] == ')') {
                open--;
            }
            if (open < 0) {
                open = 0;
                arr[i] = '0';
            }
            if (arr[str.length() - i - 1] == ')') {
                close++;
            } else if (arr[str.length() - i - 1] == '(') {
                close--;
            }
            if (close < 0) {
                close = 0;
                arr[str.length() - i - 1] = '0';
            }

        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != '0') {
                System.out.print(arr[i]);
            }
        }
    }
}
