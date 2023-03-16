class Solution {
    public int firstUniqChar(String s) {
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i<s.length(); i++){
            String a = ""+s.charAt(i);
            arr.add(a);
        }
        
        for(int i = 0; i<s.length(); i++){
            String a ="" +s.charAt(i);  
                arr.remove(a);   
            if(!arr.contains(a)){
                return i;
            }
            arr.add(a);   
        }
        
        return -1;
    }
}