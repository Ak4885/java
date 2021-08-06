package example;

public class two_sum 
{
	
	   static public int[] twoSum(int[] nums,int target)
	    {
	    	 
	        for (int i = 0; i < nums.length; i++) 
	        {
	            for (int j = i + 1; j < nums.length; j++)
	            {
	                if (nums[j] == target - nums[i]) 
	                {
	                	System.out.println(nums[i]+" "+nums[j]);
	                    return new int[] { i, j };
	                }
	            }
	        }
	        // In case there is no solution, we'll just return null
	        return null;
	    }
	    public static void main(String[] args) 
	    {
	    	int[] nums = {1,3,4,6};
	    	twoSum(nums,5);
			
		}
	}


