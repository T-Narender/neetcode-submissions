class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;

        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed,pile);
        }

        int ans = maxSpeed;

        while(minSpeed <= maxSpeed){
            int mid = minSpeed + (maxSpeed-minSpeed)/2;
            if(canEatInTime(piles,h,mid)){
                ans = mid;
                maxSpeed = mid - 1;
            }
            else{
                minSpeed = mid+1;
            }
            
        }
        return ans;
    }

    private boolean canEatInTime(int[] piles,int h, int speed){
        long hours = 0;

        for(int pile : piles){
            hours += (long)Math.ceil((double)pile/speed);
        }

        return hours <= h;
    }
}
