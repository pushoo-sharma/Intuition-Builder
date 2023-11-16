package String.Medium.StringtoInt;

public class index {
    
    public static int stringToInt(String s) {

        String trimmedString = s.trim();
        boolean falseFlag = false;
        int totalCount = 0;


        if(trimmedString.charAt(0) == '-') {
            falseFlag = true;
            trimmedString = trimmedString.substring(1, trimmedString.length());
        }

        for(int i = 0; i < trimmedString.length(); i++) {
            if(trimmedString.charAt(i) >= '0' && trimmedString.charAt(i) <= '9') {
                totalCount = totalCount * 10 + (trimmedString.charAt(i) - '0');
            }
        }

        return falseFlag ? -totalCount: totalCount;

    }

    public static void main(String args[]) {

        String s = "   32   ";
        System.out.println(stringToInt(s));


    }


}
