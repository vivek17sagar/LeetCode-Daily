class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i<t.length(); i++){
            String a = ""+t.charAt(i);
            
            arr.add(a);
        }
        
        if(arr.size()<s.length()){
            return false;
        }
        
        for(int i = 0;i<s.length(); i++){
            String b = ""+s.charAt(i);
            if(!arr.contains(b)){
                return false;
            }else{
                arr.remove(b);
            }
        }
        
        if (arr.size() > 0) {
            return false;
        }
        
        return true;
    }
}