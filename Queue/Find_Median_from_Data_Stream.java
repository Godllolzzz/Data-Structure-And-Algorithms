class MedianFinder {
    Queue<Integer> maxq = new PriorityQueue(Collections.reverseOrder());
    Queue<Integer> minq = new PriorityQueue();
    // we take one min priority q and one max priority q .
    //we put first half in max pq and second half in min pq.
    //we always have the size of max pq equal or exceeds by 1 from min pq
    public void addNum(int num) {
        if(maxq.size() == 0 || num < maxq.peek()) //if ,initaily or the num is less than highest element in the max pq .
        maxq.add(num);
        else minq.add(num);

        if(maxq.size() > minq.size() + 1) minq.add(maxq.poll());//e.g. max pq size is 4 and min pq size is 2 ,so we put one element from max to min pq
      //as we always have the size of max pq equal or exceeds by 1 from min pq
        if(maxq.size() < minq.size()) maxq.add(minq.poll());//as we want minq.size >= minpq.size.
    }
    
    public double findMedian() {
        if(minq.size() == maxq.size())           //if the size of both the pq are equal so we take the mean of the peek element of both the pq
        return minq.peek()/2.0 + maxq.peek()/2.0;
        else return maxq.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
