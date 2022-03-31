/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    var max = '';
    for(var index = 0; index < s.length; index++){
        for(var jIndex = 0; jIndex < 2; jIndex++){
            var left = index, right = index + jIndex;
            while(s[left] && s[left] === s[right]){
                left--;
                right++;
            }
            if((right-left-1) > max.length){
                max = s.substring(left+1, right);
            }
        }
    }
    return max;
};