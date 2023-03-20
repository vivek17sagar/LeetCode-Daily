class Solution {
    public int maxNumberOfBalloons(String text) {
        
        ArrayList<Character> arr = new ArrayList<>();

        for(int i = 0; i<text.length(); i++){
            arr.add(text.charAt(i));
        }

        String ans = "balloon";

        int signal = 0;
        int i = 0;
        int count = 0;

        while(true){
            if(arr.contains(ans.charAt(i))){
                count++;
                int in = arr.indexOf(ans.charAt(i));
                arr.remove(in);
                i++;
            }
            else{
                break;
            }

            if(count==7){
                signal++;
                count = 0;
                i=0;
            }
        }

        return signal;
    }
}