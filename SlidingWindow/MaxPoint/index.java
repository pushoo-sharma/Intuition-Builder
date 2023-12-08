package SlidingWindow.MaxPoint;

public class index {
    
    public static int maxScore(int[] cardPoints, int k) {
        
        int start = cardPoints.length - k, sum = 0, maxCount = 0;

        for(int end = cardPoints.length - k; end < cardPoints.length + k; end++) {
            
            if (end - start >=  k) {
                sum -= cardPoints[start % cardPoints.length];
                start++;
            }

            sum += cardPoints[end % cardPoints.length];

            if (end - start + 1 == k) {
                maxCount = Math.max(maxCount, sum);
            }

        }

        return maxCount;

    }

    public static void main(String args[]) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }

}
