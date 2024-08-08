
function solution(n, lost, reserve) {
    for(let i in lost){
        let lostNum = lost[i];
        for(let j in reserve){
            let reserveNum = reserve[j];
            if(lostNum == reserveNum){
                reserve.splice(j,1);
                lost.splice(i,1);
            }
        }
    }
    console.log(reserve +  " " + lost)

    for(let i in lost){
        let rslt = false;
        let lostNum = lost[i];
        for(let j in reserve){
            let reserveNum = reserve[j];
            if((!rslt && (lostNum == reserveNum + 1 || lostNum == reserveNum - 1))){
                reserve.splice(j,1);
               rslt = true;
            }
        }
        if(!rslt) n--;
    }
    return n;
}

// console.log(solution(5,[2,4],[1,3,5]));
// console.log(solution(5,[2,4],[3]));
// console.log(solution(3,[3],[1]));
// console.log(solution( 5, [4, 5], [3,4]));
// console.log(solution(  5, [1, 2], [2,3]));
console.log(solution(  5, [3, 4], [4, 3]));