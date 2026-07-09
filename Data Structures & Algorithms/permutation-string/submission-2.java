class Solution {
    public boolean checkInclusion(String s2, String s1) {
        char[] charArray = s2.toCharArray();
        Arrays.sort(charArray);
        String sortedS2 = new String(charArray);
        for (int i=0;i<=(s1.length()-s2.length());i++){
            String temp=s1.substring(i,i+(s2.length()));
            char[] chars = temp.toCharArray();
            Arrays.sort(chars);
            String sortedTempS1 = new String(chars);
            System.out.println("here "+sortedTempS1);
            if (sortedS2.equals(sortedTempS1)){
                return true;
            }
        }
        return false;

    }
}
