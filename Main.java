import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String num = in.next();
            int delete = in.nextInt();
            char[] charsNum = num.toCharArray();
            Object printf = print(charsNum, delete);
            System.out.println(printf);
        }
    }
    private static Object print(char[] charsNum, int deleteNum) {
        String ret = "error";
        if (charsNum.length > 8) {
            return ret;
        }
        if (deleteNum > 8) {
            return ret;
        }
        for (char c : charsNum) {
            if (c < '0' || c > '9') {
                return ret;
            }
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charsNum.length; i++) {
            if (i != deleteNum - 1) {
                list.add(charsNum[i]);
            }
        }
        String str = list.toString();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 2; i++) {
            for (int j = i + 1; j < chars.length - 1; j++) {
                if (chars[j] < chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        List<Character> list1 = new ArrayList<>();
        for (char l : chars) {
            if (l >= '0' && l <= '9') {
                list1.add(l);
            }
        }
        return list;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String name = in.nextLine();
            String n = name.toLowerCase();
            int len = n.toCharArray().length;
            String[] nameLowcase = n.split(" ");
            ArrayList<Character> list = new ArrayList<>();
            if (len >= 3) {
                for (int i = 0; i < nameLowcase.length; i++) {
                    char[] chars = nameLowcase[i].toCharArray();
                    for (char ch : chars) {
                        if (ch >= 'a' && ch <= 'z') {
                            list.add(ch);
                            continue;
                        }
                    }
                }
            } else {
                for (int i = 0; i < len; i++) {
                    char[] chars = nameLowcase[i].toCharArray();
                    for (char ch : chars) {
                        list.add(ch);
                    }
                }
            }
            for (char l : list) {
                System.out.print(l);
            }
        }
    }
}