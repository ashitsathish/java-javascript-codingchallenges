/**
 * @param {number} n
 * @return {boolean}
 */
// 19
var isHappy = function(n) {
    let returnResult = false;
    let number = n;
    while (true){
        let numberToString = number.toString().split("");
        let squaredNumber = 0;
        for(const i of numberToString ){
            squaredNumber += i*i ;
        }
        number = squaredNumber;
        if(squaredNumber==1){
            returnResult = true;
            break;
        }
    }
    return returnResult;
};

isHappy(19);