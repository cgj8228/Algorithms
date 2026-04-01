class Solution {
    public long solution(int price, int money, int count) {
        // 놀이 기구를 탈 수록 비용이 증가한다. price * count
        // return은 부족한 돈, 부족하지 않으면 0
        long answer = -1;
        long result = 0;
        long sum = 0;

        // 총 비용
        for (int i = 1; i <= count ; i++) {
            sum = price * i + sum;
        }

        // 총 비용 > 지갑
        if (sum > money){
            result = sum - money;
        }else {
            result = 0;
        }

        return result;
    }
}