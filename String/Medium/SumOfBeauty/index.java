package String.Medium.SumOfBeauty;

public class index {
    
    public static int beautySum(String s) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int[] alp = new int[26];
            for(int j = i; j < s.length(); j++) {
                alp[s.charAt(j) - 'a']++;
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;
                for(int a: alp) {
                    if(a > 0) {
                        min = Math.min(min, a);
                        max = Math.max(max, a);
                    }
                }
                count += max - min;
            }
        }

        return count;

    }

    public static void main(String args[]) {
        String str = "aabcb";
        System.out.println(beautySum(str));
    }

}

