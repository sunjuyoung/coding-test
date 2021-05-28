function min (arr){
    let first  = arr[0]
    for(const item of arr){
        if(first > item){
            first = item;
        }
    }

    return first;
}


const arr = [34,56,867,234,567,888,3,5,6]
console.log(min(arr))