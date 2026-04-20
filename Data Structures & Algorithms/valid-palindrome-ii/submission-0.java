class Solution {
    public boolean validPalindrome(String s) {
        for(int i = 0; i< s.length(); i++){
            String newString = s.substring(0, i) + s.substring(i + 1);
            if(isPalindrome(newString)){
                return true;
            }
            
        }
        return false;
    }
    public boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}