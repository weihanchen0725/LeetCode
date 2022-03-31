/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = {};
    for(let index = 0; index < nums.length; index++){
        let anotherTarget = target - nums[index];
        if(anotherTarget in map)
            return [map[anotherTarget], index];
        map[nums[index]] = index;
    }
    return null;
};