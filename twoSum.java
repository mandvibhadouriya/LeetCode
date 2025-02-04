class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int result[] = new int[2];
        // // List<Integer> list = new ArrayList<>(Arrays.asList(nums));
        // List<Integer> list = new ArrayList<>();
        // for(int i : nums){
        //     list.add(i);
        // }
        // for(int i = 0; i < nums.length; i++){
        //     int find = target - nums[i];
        //     if(list.contains(find) && list.indexOf(find) != i){
        //         int idx = list.indexOf(find);
        //         result[0] = i;
        //         result[1] = idx;
        //         return result;
        //     }
        // }
        // return new int [2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int toFind = target - nums[i];
            if(map.containsKey(toFind)){
                int idx = map.get(toFind);
                return new int []{i, idx};
            }
            map.put(nums[i], i);
        }

        return new int [2];
    }
}
