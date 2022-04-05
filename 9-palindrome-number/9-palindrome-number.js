/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0){
        return false;
    }
    var result = true;
    var stringX = String(x).split("");
    for(var index = 0; index < stringX.length/2; index++){
        if(stringX[index] == stringX[stringX.length-index-1]){
            result = true;
        }else{
            return false;
        }
    }
    return result;
};
