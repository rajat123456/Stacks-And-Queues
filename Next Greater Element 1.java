// Problem Link: https://leetcode.com/problems/next-greater-element-i/

// Time Complexity: O(N)
// Space Complexity: O(N) -> where N is the size of given input array

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
        int[]arr=new int[nums2.length];
        Stack<Integer>st=new Stack<>();
        
        for(int q=nums2.length-1;q>=0;q--)
        {
            while(!st.empty() && st.peek()<nums2[q])
                st.pop();
            
            arr[q]=st.empty()?-1:st.peek();
            st.push(nums2[q]);
        }
        
        HashMap<Integer, Integer>map=new HashMap<>();
        
        for(int w=0;w<nums1.length;w++)
        {
            map.put(nums1[w],1);
        }
        
        for(int w=0;w<nums2.length;w++)
        {
            if(map.containsKey(nums2[w]))
            map.put(nums2[w],arr[w]);
        }
        
        int[]res=new int[nums1.length];
        
        for(int w=0;w<nums1.length;w++)
        {
            res[w]=map.get(nums1[w]);
        }
        
        return res;
        
    }
}
