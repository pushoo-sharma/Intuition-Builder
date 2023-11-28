package SlidingWindow.LongestRepeating;

public class index {

    public static int characterReplacement(String s, int k) {
        
        int[] arr = new int[26];
        int count = 0, start = 0, maxCount = 0;

        for(int i = 0; i < s.length(); i++) {
            
            maxCount = Math.max(++arr[s.charAt(i) - 'A'], maxCount);
            
            if(((i + 1) - (maxCount + start))  > k) {
                arr[s.charAt(start++) - 'A']--;
            }

            count = Math.max(count, i - start + 1);

        }

        return count;

    }

    public static void main(String args[]) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

}
