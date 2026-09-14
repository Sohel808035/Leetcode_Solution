class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int ans = -1;

        while(left <= right){
            int mid = left+ (right - left)/2;

            if(letters[mid] > target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        if(ans == -1)
            return letters[0];
        
        return letters[ans];
    }
}