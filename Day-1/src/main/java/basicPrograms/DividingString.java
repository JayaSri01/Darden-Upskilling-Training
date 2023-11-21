package basicPrograms;

import java.util.ArrayList;
import java.util.List;

public class DividingString {

    public static void main(String[] args) {
        String inputString = "abcdefghijklmnopqrstuvwxyz";
        int n = 4;

        List<String> parts = divideStringIntoEqualParts(inputString, n);
        System.out.println("Divided string in " + n + " equal parts:");
        for (String part : parts) {
            System.out.println(part);
        }
    }

    // Function to divide a string into n equal parts
    public static List<String> divideStringIntoEqualParts(String str, int n) {
        int len = str.length();
        int partLength = len / n;
        int extraChars = len % n;

        List<String> parts = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < n; i++) {
            int currentPartLength = partLength;
            if (i < extraChars) {
                currentPartLength++;
            }

            String part = str.substring(index, index + currentPartLength);
            parts.add(part);

            index += currentPartLength;
        }

        return parts;
    }
}
