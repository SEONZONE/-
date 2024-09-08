function solution(x) {
    let chgX = [...x.toString()];
    let num = 0;

    for(i in chgX){
        num += parseInt(chgX[i]);
    }

    return x % num === 0 ? true : false;
}

console.log(solution(10));
console.log(solution(12));
console.log(solution(11));
console.log(solution(13));
