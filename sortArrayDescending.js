function sortArrayDescending(arr) {
    arr.sort(function(a, b) {
        return b - a;
    });
    return arr;
}

// Example usage:
const numbers = [5, 2, 9, 1, 5, 6];
const sortedDescending = sortArrayDescending(numbers);
console.log(sortedDescending); // Output: [9, 6, 5, 5, 2, 1]
