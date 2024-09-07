function solution(n) {
    let result = true;
    let answer;
    let i = 0;
    while(result){
        if(i ** 2 == n){
            answer = (i+1) ** 2;
            result = false;
        }else if(i >= n){
            answer = -1;
            result = false;
        }else{
            i ++;
        }
    }

    return answer;
}

console.log(solution(121));
console.log(solution(3));