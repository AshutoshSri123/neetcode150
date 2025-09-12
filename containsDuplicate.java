class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> myMap = new HashSet<>();
        for (int num : nums) {
            if (myMap.contains(num)) {
                return true;
            }
            myMap.add(num);
        }
        return false;
    }
}