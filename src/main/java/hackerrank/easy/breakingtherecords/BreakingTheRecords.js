
function breakingRecords(scores) {
    let min = scores[0];
    let max = scores[0];
    let minCounter = 0;
    let maxCounter = 0;
    for(let i=1; i< scores.length; i++){
        if(scores[i]> max){
            max = scores[i];
            maxCounter++;
        }else if(scores[i]< min){
            min = scores[i];
            minCounter++;
        }
    }
    return [maxCounter, minCounter];
}

console.table(breakingRecords([10,5,20,20,4,5,2,25,1]))