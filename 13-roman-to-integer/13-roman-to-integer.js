/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    var map = {I:1, V:5, X:10, L:50, C:100, D:500, M:1000};
    var answer = 0, previous = 0, current = 0;
    for(var index = s.length-1; index >= 0; index--){
        current = map[s[index]];
        current < previous ? answer -= current : answer += current;
        previous = current;
    }
    return answer;
};