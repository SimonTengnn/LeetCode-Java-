package src.leetCode.maxArrayElement;
// 寻找过半，摩尔计数法
/*public class maxArrayElement {
    public static int findElement(int[] nums){
        if(nums==null || nums.length == 0){
            System.out.println("数组不能为空");
            return 0;
        }

        int time=1;
        int element = nums[0];

        for(int i=1 ; i<nums.length; i++){
            if(time == 0){
                element = nums[i];
                time=1;
            }else{
                if(element == nums[i]){
                    time++;
                }else{
                    time--;
                }
            }
        }
        return element;
    }


    public static void main(String[] args) {
        // int[] nums=new int[10];
        int[] nums={1,2,3,3,3,5,3,2,1,3};
        System.out.println(findElement(nums));
    }
}
*/

// 寻找出现次数最多，计数法
public class maxArrayElement{
    public static int findElement(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int element=nums[0];
        int count=1;

        for(int i=1;i<nums.length; i++){
            if(element==nums[i]){
                count++;
            }else if(count>0){
                count--;
            }else if(count==0){
                count=1;
                element=nums[i];
            }
        }

        return element;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,3,3,4,5};
        System.out.println(findElement(nums));
    }
}