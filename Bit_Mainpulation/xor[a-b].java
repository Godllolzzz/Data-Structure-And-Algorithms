long long f(long long a) {
     long long res[] = {a,1,a+1,0};
     return res[a%4];
}

long long getXor(long long a, long long b) {
     return f(b)^f(a-1);
}



// 0000 <- 0  [a]
// 0001 <- 1  [1]
// 0010 <- 3  [a+1]
// 0011 <- 0  [0]
// 0100 <- 4  [a]
// 0101 <- 1  [1]
// 0110 <- 7  [a+1]
// 0111 <- 0  [0]
// 1000 <- 8  [a]
// 1001 <- 1  [1]
// 1010 <- 11 [a+1]
// 1011 <- 0  [0]
// 1100 <- 12 [a]
// 1101 <- 1  [1]
// 1110 <- 15 [a+1]
// 1111 <- 0  [0]

//   Where the first column is the binary representation and then the decimal result and its relation to its index (a) into the XOR list. This happens because all the upper bits cancel and the lowest two bits cycle every 4. So, that's how to arrive at that little lookup table.

// Now, consider for a general range of [a,b]. We can use f() to find the XOR for [0,a-1] and [0,b]. Since any value XOR'd with itself is zero, the f(a-1) just cancels out all the values in the XOR run less than a, leaving you with the XOR of the range [a,b].
