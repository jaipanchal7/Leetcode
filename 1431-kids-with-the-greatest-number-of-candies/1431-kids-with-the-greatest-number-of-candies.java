class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandy = 0;
        
        // int max = Arrays.stream(candies).max().getAsInt(); // Java 8 approach
        for(int candy : candies){
            if(candy > maxCandy){
               maxCandy = candy;
            }
        }
        
        List<Boolean> result = new ArrayList<>();
        
        for(int currentCandy : candies){
            if(currentCandy + extraCandies >= maxCandy){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        // for (int candy : candies) {
        //     result.add(candy + extraCandies >= max);
        // }

        return result;
    }
}