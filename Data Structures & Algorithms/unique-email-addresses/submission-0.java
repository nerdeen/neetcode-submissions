class Solution {
    public int numUniqueEmails(String[] emails) {
        for(int i=0;i<emails.length;i++){
                String result = emails[i].replaceAll("\\.(?=[^@]*@)", "");
                emails[i]=result;
                int startIndex = emails[i].indexOf('+');
                if(startIndex!=-1){
                int endIndex = emails[i].indexOf('@');
                String part1 = emails[i].substring(0, startIndex);
                String part2 = emails[i].substring(endIndex);
                emails[i]=part1+part2;
                }

        }
        return (int) Arrays.stream(emails)
                                 .distinct()
                                 .count();
    }
}