class Solution {
    public int percentageLetter(String s, char letter) {
        
        double count = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }

        double ans = (count/s.length())*100;
        // System.out.print(ans);
        return (int)ans;
    }
}