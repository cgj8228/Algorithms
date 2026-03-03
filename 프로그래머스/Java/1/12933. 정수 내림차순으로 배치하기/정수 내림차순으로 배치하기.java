import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int len = String.valueOf(n).length();
        long[] arr = new long[len];

        for (int i = len - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }

        Arrays.sort(arr);

        for (int i = len - 1; i >= 0; i--) {
            answer = answer * 10 + arr[i];
        }

        return answer;
    }
}