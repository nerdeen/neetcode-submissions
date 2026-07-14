class Solution {
    public int compress(char[] chars) {
        char[] temp=new char[chars.length];
        if (chars.length<=1){
            return chars.length;
        }
        int count =1;
        int place=0;
        for(int i=0;i<chars.length-1;i++){
            if (chars[i]==chars[i+1]){
                count++;
            }
            if(chars[i]!=chars[i+1]||((i==chars.length-2)&&(chars[i]==chars[i+1]))) {
                if (count==1){
                    temp[place++]=chars[i];
                }
                else {
                    temp[place++]=chars[i];
                    String c=Integer.toString(count);
                    for(int j=0;j<c.length();j++){
                        temp[place++]=c.charAt(j);
                    }
                    System.out.println(chars[i]);
                    count=1;
                }
            }
            if(((i==chars.length-2)&&(chars[i]!=chars[i+1]))){
                System.out.println("here");
                temp[place++]=chars[i+1];
            }
        }
        for(int i=0;i<place;i++){
            chars[i]=temp[i];
        }
        return place;
    }
}