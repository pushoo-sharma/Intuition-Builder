package String.ReverseWordString;

public class index {

    public static void main(String args[]) {
       
        String words = "this is an amazing program";
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--) {
            if(i == 0) {
                result.append(arr[i]);
            } else {
                result.append(arr[i] + " ");
            }
        }

        System.out.println("----" + result.toString());

    }
    
}
