class Solution {
    public boolean validPalindrome(String s) {
        // boolean deleted=false;
        // int l=0;
        // int r=s.length()-1;
        // while(l<r){
        //     if (s.charAt(l)==s.charAt(r)){
        //         l++;
        //         r--;
        //     }
        //     else if (deleted==false){
        //         deleted=true;
        //         if(s.charAt(l+1)==s.charAt(r)){
        //             l++;
        //         }
        //         else if (s.charAt(l)==s.charAt(r-1)){
        //             r--;
        //         }
        //         else{
        //             r--;
                    
        //         }
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;

        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l + 1, r) ||
                       isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }

        return true;

    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}