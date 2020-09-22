function lengthOfLastWord(s){
    if(s.length ==0){
        return 0;
    }
    let stringArray = s.split(" ");
    return (stringArray.length>0)? stringArray[stringArray.length-1].length : 0;
}


console.debug(lengthOfLastWord("Hello World"));