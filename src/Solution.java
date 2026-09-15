class Solution {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        int n = words.length;

        String[] wordsWithoutNumbers = new String[n];
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            int wordLen = word.length();

            wordsWithoutNumbers[i] = word.substring(0, wordLen - 1);
            numbers[i] = Character.getNumericValue(word.charAt(wordLen - 1));
        }

        bubbleSort(wordsWithoutNumbers, numbers, n);

        String result = String.join(" ", wordsWithoutNumbers);

        return result;
    }

    private static void bubbleSort(String[] str, int[] nums, int n) {
       for (int i = n - 1; i >= 0; i--) {
           for (int j = 0; j < i; j++) {
               if (nums[j] > nums[j + 1]) {
                   int tempInt = nums[j];
                   nums[j] = nums[j + 1];
                   nums[j + 1] = tempInt;

                   String tempString = str[j];
                   str[j] = str[j + 1];
                   str[j + 1] = tempString;
               }
           }
       }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(sortSentence("KmPGxjHIpz2 xyicowi3 RULgvi1 DEMNWWBvRobvMSzOw5 tMWpM6 PRarH4"));
    }
}