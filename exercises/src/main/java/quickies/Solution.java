package quickies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public int lengthOfLongestSubstring(String s) {
        int longestString = 0;
        if (!s.isEmpty()) {
            String[] splitted = s.split("");
            List<String> longestSubstring = new ArrayList<>();
            for (int j = 0; j < splitted.length; j++) {
                for (int i = 0; i < splitted.length - j; i++) {
                    if (longestSubstring.contains(splitted[i + j])) {
                        longestSubstring.removeAll(longestSubstring);
                    } else {
                        longestSubstring.add(splitted[i + j]);
                    }
                    if (longestSubstring.size() > longestString) {
                        longestString = longestSubstring.size();
                    }
                }
                longestSubstring.removeAll(longestSubstring);
            }
        }
        return longestString;
    }

    public String mergeAlternately(String word1, String word2) {
        String[] split1 = word1.split("");
        String[] split2 = word2.split("");
        List<String> merged = new ArrayList<>();

        int shorter, longer = 0;
        if (split1.length > split2.length) {
            shorter = split2.length;
            longer = split1.length;
        } else {
            shorter = split1.length;
            longer = split2.length;
        }
        for (int i = 0; i < shorter; i++) {
            merged.add(split1[i]);
            merged.add(split2[i]);
        }

        for (int j = shorter; j < longer; j++) {
            if (split1.length > split2.length) {
                merged.add(split1[j]);
            } else {
                merged.add(split2[j]);
            }
        }
        return String.join("", merged);

    }

    public String gcdOfStrings(String str1, String str2) {
        String[] separatedLongerStr;
        String[] separatedShorterStr;

        String longerStr;
        String shorterStr;
        String smallestFirstHalf;
        String smallestSecondHalf;
        String smallestCommon;

        if (str1.length() > str2.length()) {
            longerStr = str1;
            shorterStr = str2;
        } else {
            longerStr = str2;
            shorterStr = str1;
        }

//        for (int i = 0; i < 11; i++) {
//            if (shorterStr.length() % 2 == 0) {
//                smallestFirstHalf = shorterStr.substring(0, shorterStr.length() / 2 - 1);
//                smallestSecondHalf = shorterStr.substring(shorterStr.length() / 2, shorterStr.length());
//                if (smallestFirstHalf.equals(smallestSecondHalf)) {
//                    smallestCommon = smallestFirstHalf;
//                } else {
//                    smallestCommon = shorterStr;
//                    break;
//                }
//            }
//        }
        //czy jesli str1 podziele na lenght rowne czesci to dostane to samo?
        //czy moge go podzielic na lenght-1 bez reszty?
        //czy jesli podziele na length-1 rowne czesci to dostane to samo?

        if (shorterStr.equals(longerStr.substring(0, shorterStr.length() - 1))) {

        }
        //krotszy jest prefixem dluzszego

        //czy krotszy ma w sobie duplikaty?
        //chcemy znalexc najmnijszy duplikat


        // czy krotszy jest parzysty?
        // czy krotoszy moze sie podzielic jeszcze na rowne polowy?
        // czy dluzysz sklada sie tylko z tych małych połów?


        return "";
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanArray = new ArrayList<>();
        boolean biggestFlag = false;
        for (int i : candies) {
            for (int j : candies) {
                if (i + extraCandies >= j) {
                    biggestFlag = true;
                } else {
                    biggestFlag = false;
                    booleanArray.add(biggestFlag);
                    break;
                }
            }
            if (biggestFlag) {
                booleanArray.add(biggestFlag);
            }
        }
        return booleanArray;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        System.out.println(Arrays.toString(s.twoSum(nums, target)));

//        String str = "jbpnbwwd";
//        System.out.println(s.lengthOfLongestSubstring(str));

//        String str1 = "ab";
//        String str2 = "pqrs";
//        System.out.println(s.mergeAlternately(str1, str2));

//        String str1 = "ABAB";
//        String str2 = "ABABAB";
//        System.out.println(s.gcdOfStrings(str1, str2));

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(s.kidsWithCandies(candies, extraCandies));
    }

}