class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length == 1) {
            if(flowerbed[0] == 1  && n==1) {
                return false;
            }else{
                return true;
            }
            
        }
        int plantedNo = 0;

        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                if(i == 0) {
                    if(flowerbed[1] == 0) {
                        flowerbed[0] = 1;
                        plantedNo++;
                    }
                }
                else if(i == flowerbed.length - 1) {
                    if(flowerbed[i-1] == 0) {
                        flowerbed[i] = 1;
                        plantedNo++;
                    }
                }else{
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        plantedNo++;
                    }
                }  
            }
        }
        return plantedNo >= n;
    }
}