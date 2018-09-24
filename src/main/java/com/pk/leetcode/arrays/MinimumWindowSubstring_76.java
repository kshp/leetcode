package com.pk.leetcode.arrays;

public class MinimumWindowSubstring_76 {

    static final int NO_OF_CHARS = 256;

    public static String minWindow(String s, String pattern) {
        int strLength = s.length();
        int patternLength = pattern.length();

        // check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (strLength < patternLength)
        {
            System.out.println("No such window exists");
            return "";
        }

        int hash_pat[] = new int[NO_OF_CHARS];
        int hash_str[] = new int[NO_OF_CHARS];

        // store occurrence ofs characters of pattern
        for (int i = 0; i < patternLength; i++)
            hash_pat[pattern.charAt(i)]++;

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

        // start traversing the string
        int count = 0;  // count of characters
        for (int j = 0; j < strLength ; j++)
        {
            // count occurrence of characters of string
            hash_str[s.charAt(j)]++;

            // If string's char matches with pattern's char
            // then increment count
            if (hash_pat[s.charAt(j)] != 0 &&
                    hash_str[s.charAt(j)] <= hash_pat[s.charAt(j)] )
                count++;

            // if all the characters are matched
            if (count == patternLength)
            {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence  in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while ( hash_str[s.charAt(start)] > hash_pat[s.charAt(start)]
                        || hash_pat[s.charAt(start)] == 0)
                {

                    if (hash_str[s.charAt(start)] > hash_pat[s.charAt(start)])
                        hash_str[s.charAt(start)]--;
                    start++;
                }

                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1)
        {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index
        // and length min_len
        return s.substring(start_index, start_index + min_len);
    }
}
