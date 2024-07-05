public class FrogJump {

static int minimumCost(int[] h, int n, int idx){
    if(idx == n - 1) return 0;
    int op1 = Math.abs(h[idx] - h[idx + 1]) + minimumCost(h, n, idx + 1);
    if(idx == n - 2) return op1;
    int op2 = Math.abs(h[idx] - h[idx + 2]) + minimumCost(h, n, idx + 2);
    return Math.min(op1, op2);
}
    public static void main(String[] args) {
        int[] h = {10, 30, 20, 40};
        int ans = minimumCost(h, h.length, 0);
        System.out.println("The minimum cost is: " + ans);
    }
}
