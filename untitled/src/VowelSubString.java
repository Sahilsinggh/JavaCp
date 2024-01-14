public class VowelSubString {
    public static void main(String[] args) {
        String str = "abcdeuf";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toUpperCase(ch);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                int j = i + 1;
                while (j < str.length()) {
                    char ch2 = str.charAt(j);
                    ch2 = Character.toUpperCase(ch2);
                    if (ch2 != 'A' && ch2 != 'E' && ch2 != 'I' && ch2 != 'O' && ch2 != 'U') {
                        count++;
                        System.out.println(ch2);
                    } else {

                    }
                    j++;
                }
            } else {
                int j = i + 1;
                while (j < str.length()) {
                    char ch2 = str.charAt(j);
                    ch2 = Character.toUpperCase(ch2);
                    if (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') {
                        count++;
                    } else {

                    }
                    j++;
                }
            }
        }
        System.out.println("count" + count);
    }
}
