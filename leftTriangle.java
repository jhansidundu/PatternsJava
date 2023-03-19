class Solution1 {
  public void pattern() {
    int n = 4;
    for (int i = 0; i < n; i++) {
      // System.out.println();
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      // int c=1;
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
        // System.out.print(" ");
        // c = c*(i - k) /k;
      }
      System.out.println();
    }
  }
}

class LeftTriangle {
  public static void main(String args[]) {
    Solution1 obj = new Solution1();
    obj.pattern();
  }

}