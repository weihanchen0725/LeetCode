/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var map = {};
    for(var index = 0; index < nums.length; index++){
        var anotherTarget = target - nums[index];
        if(anotherTarget in map){
            return [map[anotherTarget], index];
        }
        map[nums[index]] = index;
    }
    return null;
};