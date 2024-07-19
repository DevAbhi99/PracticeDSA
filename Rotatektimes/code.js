let rotate = (arr, k) => {
    // Base case: if no rotations needed, return the array
    if (k <= 0) return arr;

    // Move the last element to the front
    arr.unshift(arr.pop());

    // Recurse with one less rotation
    return rotate(arr, k - 1);
}

let arr = [1, 2, 3, 4, 5, 6, 7];
let k = 3;

console.log(rotate(arr, k));