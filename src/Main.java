import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Write a Java program to get the index of all the characters of the alphabet.
        printCharacterIndex();

        // 2. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
        replaceEachString();

        // 3. Write a Java program to find the second most frequent character in a given string.
        secondMostFrequentCharacter();

        // 4. Write a Java program to print the result of removing duplicates from a given string.
        removeDublicate();

        // 5. Write a Java program to divide a string into n equal parts.
        divideString();

        // 6. Write a Java program to reverse words in a given string.
        reverseSentence();

        // 7. Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.
        sumDigitsInString();

        // 8. Write a Java program to sort in ascending and descending order by the length of the given array of strings.
        ascendigOrderByLength();
        descendigOrderByLength();

        // 9. Write a Java program to find the maximum and minimum value of an array.
        minimumAndMaximumValue();

        // 10.Write a program to count the occurrences of a specific value in an array.
        countNumberInArray();
    }

    public static void printCharacterIndex() {
        char startChar = 'a';
        char endChar = 'z';

        for (char ch = startChar; ch <= endChar; ch++) {
            System.out.println("index: " + (int) ch + "\tchar: " + ch);
        }
    }

    public static void replaceEachString() {
        String s = "salam sagol cox sagol salam sagol";
        System.out.println(s.replaceAll("salam", "sagol"));

    }

    public static void secondMostFrequentCharacter() {
        String s = "successes";
        String s2 = ""; //suce
        int[] counts = null;

        for (int i = 0; i < s.length(); i++) {
            if (!(s2.contains(Character.toString(s.charAt(i))))) {
                s2 += s.charAt(i);
            }
        }

        counts = new int[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s2.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            counts[i] = count;
        }

        Arrays.sort(counts);

        for (int i = 0; i < s2.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s2.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (counts[counts.length - 2] == count) {
                System.out.println(s2.charAt(i));
            }
        }
    }

    public static void removeDublicate() {
        String s = "w3resource";
        String s2 = "";
        int[] counts = null;

        for (int i = 0; i < s.length(); i++) {
            if (!(s2.contains(Character.toString(s.charAt(i))))) {
                s2 += s.charAt(i);
            }
        }

        System.out.println(s2);
    }

    public static void divideString() {
        String s = "abcdefghijklmnopqrstuvwxy";
        int n = 5;
        int charCount = s.length() / n;
        String part = "";

        for (int i = 0; i < s.length(); i++) {
            part += s.charAt(i);
            if (part.length() == s.length() / 5) {
                System.out.println(part);
                part = "";
            }
        }
    }

    public static void reverseSentence() {
        String s = "Reverse words in a given string";
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (int i = words.length - 1; i >= 0; i--) {
            result[result.length - 1 - i] = words[i];
        }

        System.out.println(String.join(" ", result));
    }

    public static void sumDigitsInString() {
        String s = "ab5c2d4ef12s";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println(sum);
    }

    public static void ascendigOrderByLength() {
        String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
        String[] result = new String[colors.length];
        int resultIndex = 0;
        int maxLength = 0;
        boolean isEmpty = false;

        while (!isEmpty) {
            for (int i = 0; i < colors.length; i++) {
                if (colors[i].isEmpty()) {
                    continue;
                }
                if (colors[i].length() > maxLength) {
                    maxLength = colors[i].length();
                }
            }

            for (int i = 0; i < colors.length; i++) {
                if (colors[i].length() == maxLength) {
                    result[resultIndex++] = colors[i];
                    colors[i] = "";
                }
            }

            maxLength = 0;

            isEmpty = true;
            for (int i = 0; i < colors.length; i++) {
                if (!colors[i].isEmpty()) {
                    isEmpty = false;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void descendigOrderByLength() {
        String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
        String[] result = new String[colors.length];
        int resultIndex = 0;
        int minLength = Integer.MAX_VALUE;
        boolean isEmpty = false;

        while (!isEmpty) {
            for (int i = 0; i < colors.length; i++) {
                if (colors[i].isEmpty()) {
                    continue;
                }
                if (colors[i].length() < minLength) {
                    minLength = colors[i].length();
                }
            }

            for (int i = 0; i < colors.length; i++) {
                if (colors[i].length() == minLength) {
                    result[resultIndex++] = colors[i];
                    colors[i] = "";
                }
            }

            minLength = Integer.MAX_VALUE;

            isEmpty = true;
            for (int i = 0; i < colors.length; i++) {
                if (!colors[i].isEmpty()) {
                    isEmpty = false;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void minimumAndMaximumValue() {
        int[] numbers = {123, 2, 435};
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void countNumberInArray() {
        int n = 7;
        int[] numbers = {4, 5, 6, 7, 3, 5, 7, 4, 6, 7, 3, 4, 6, 4,};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}