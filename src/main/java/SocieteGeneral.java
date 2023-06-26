import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SocieteGeneral {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    public static void main(String[] args) {
        int[] nums = {2,11,13,7,15};
        int target=9;
        Map<Integer,Integer> map=new HashMap<> ();
        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];
                if(map.containsKey (result))
                {

                    System.out.println (i+" "+map.get(result));
                }
                else{
                    map.put(nums[i],i);
                }


        }
    }
}
