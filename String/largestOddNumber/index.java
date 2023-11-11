package String.largestOddNumber;

public class index {
    
    public static void main(String args[]) {
        
        String num = "2222222";
        
        char[] numb = num.toCharArray();

        int countValue = 0;

        for(int i = 0; i < numb.length; i++) {

            int count =  Integer.parseInt(String.valueOf(numb[i]));
            
            if(count % 2 == 1) {
                countValue = i;
            }

        }

        System.out.println("-----" + num.substring(0, countValue + 1));

    }

}
