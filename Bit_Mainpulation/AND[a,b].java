// Solution is to find the common "left header" of m and n. Bitwise AND of this common left header definitely results in 1, while the remaining right part results in 0 since at least 1 bit in a number between m and n is 0

// worst T.C = O(32)
// S.C = O(1)

// Code
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        //find the common left header (or, same prefix) of m and n
        while(left != right) {
            left >>= 1; //shift to right by 1 bit
            right >>= 1;
            shift++;
        }
        //then shift back to left to form the final result
        //(the remaining bits are not the same, so definitely result in 0 after AND)
        return left << shift;
    }
}
