class Solution {
    public boolean isPalindrome(String s) {
        int k = 0;
        int j = s.length() - 1;

       while(k < j){
        if(!Character.isLetterOrDigit(s.charAt(k))){
            k++;
        }
        else if(!Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
        else if(Character.toLowerCase(s.charAt(k)) == Character.toLowerCase(s.charAt(j))){
            k++;
            j--;
        }
        else{
            return false;
        }
        
       }
       return true;

    }
}
