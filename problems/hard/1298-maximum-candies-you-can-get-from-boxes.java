class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        var processed = new boolean[status.length];
        var queue = new LinkedList<>(
            Arrays.stream(initialBoxes).boxed().toList());
        var candieCount = 0;
        // var lockedBoxes = 0;
        while(!queue.isEmpty()) {
            var box = queue.poll();
            if(status[box] == 1){
                processed[box] = true;
                candieCount += candies[box];
                Arrays.stream(keys[box]).forEach(key -> status[key] = 1);
                Arrays.stream(containedBoxes[box]).forEach(queue::add);
            }
            else {
                queue.add(box);
            }
            if(queue.stream().allMatch(b -> status[b] == 0)) break;
        }

        return candieCount;
    }
}