class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n == 2) return true;
        if (n == 3) return true;
        if (n == 5) return true;
        if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0)
            return false;
        else if (n % 2 == 0) return isUgly(n/2);
        else if (n % 3 == 0) return isUgly(n/3);
        else return isUgly(n/5);
    }
}
