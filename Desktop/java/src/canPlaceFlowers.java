package src;

public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] newFlowerbed = new int[flowerbed.length+2];
        newFlowerbed[0]=0;
        newFlowerbed[newFlowerbed.length-1]=0;                      // 数组两端分别加上一个0，不改变zeroCount>=3的判断条件，也不会影响结果
        for(int i=1;i<newFlowerbed.length-1;i++){
            newFlowerbed[i]=flowerbed[i-1];
        }
        int zeroCount=0;
        int flowerCount =0;
        for(int num:newFlowerbed){
            if(num==0){
                zeroCount++;
            }
            if(num==1){
                if(zeroCount>=3){
                    if(zeroCount%2==1)flowerCount+= zeroCount/2;
                    else flowerCount+=(zeroCount/2 -1);
                }
                zeroCount=0;
            }
        }

        if(zeroCount>0){        // 后缀是0，但由于没有1所以for循环中加不到这部分的数量
            if(zeroCount>=3){
                if(zeroCount%2==1)flowerCount+= zeroCount/2;
                else flowerCount+=(zeroCount/2 -1);
            }
        }

        if(flowerCount<n) return false;
        else return true;
    }
}
