class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s = Arrays.stream(nums2)
                            .boxed()
                            .collect(Collectors.toSet());
        
        return Arrays.stream(nums1)
            .filter(s::contains)
            .distinct()
            .toArray();
            
    }
}