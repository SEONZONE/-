
function solution(n, lost, reserve) {

    let actualReserve  = reserve.filter(r => !lost.includes(r)).sort();
    let actualLost  = lost.filter(l => !reserve.includes(l)).sort();
    for (let i = 0; i < actualLost.length; i++) {
        let rslt = false;
        let lostNum = actualLost[i];
        for(let j in actualReserve){
            let reserveNum = actualReserve[j];
            if((!rslt && (lostNum == reserveNum + 1 || lostNum == reserveNum - 1))){
                actualReserve.splice(j,1);
               rslt = true;
            }
        }
        if(!rslt) n--;
    }
    return n;
}


console.log(solution(5,[2,4],[1,3,5]));
console.log(solution(5,[2,4],[3]));
console.log(solution(3,[3],[1]));
console.log(solution( 5, [4, 5], [3,4]));
console.log(solution(  5, [1, 2], [2,3]));
console.log(solution(  5, [3, 4], [4, 3]));
console.log(solution(  5, [4, 2], [3, 5])); //5