/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0){
        return false;
    }
    var flag = true
    var val = String(x).split("")
    
    for(var i=0; i< val.length / 2; i++)
    {
        if(val[i] == val[val.length-i-1]){
            flag = true;
        }
        else{
            return false;
        }
    }
    return flag;
};