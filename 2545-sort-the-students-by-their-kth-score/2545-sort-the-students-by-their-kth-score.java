class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int arr[][] = new int[score.length][score[0].length];

        int max = Integer.MIN_VALUE;

        ArrayList<Integer> nums = new ArrayList<>();

        int iii = 0;


        for(int i = 0; i<score.length; i++){
            nums.add(score[i][k]);
        }

    for(int j = 0; j<score.length; j++){
        for(int i = 0; i<nums.size(); i++){
            if(max<nums.get(i)){
                max = nums.get(i);
            }
        }

        int row = nums.indexOf(max);
        int jj = 0;

        while(jj<score[0].length){
            arr[iii][jj] = score[row][jj];
            jj++;
        }
        nums.set(row,-5);
        max = 0;
        iii++;
    }

            return arr;
            
        }
    }
