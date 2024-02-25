class Solution {
    public int solution(int a, int b) {
        int answer = a*b>a+b ? a*b : a+b;
        return answer;
    }
}