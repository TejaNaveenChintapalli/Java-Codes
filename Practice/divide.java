package Practice;
public class divide {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7,8,9,10,11};
        int i = 0;
        while(i < nums.length){
            if (nums[i]%2==0){
                nums[i]=nums[i]*nums[i];
            }
            i++;

        }
        System.out.print("[");
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]);
            if(j<nums.length-1){
                System.out.print(", ");
            }
        }

        System.out.println("]");

    }
    
}
