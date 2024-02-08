public class Main {
  // int型配列を受け取り、
  // 配列内の要素すべてに1を加えるメソッド
  public static void incArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}

// このコードは、incArrayメソッドが配列の各要素に1を加えるメソッドです。
// mainメソッドでは、arrayという名前のint型配列を作成し、{1, 2, 3}で初期化します。
// そして、incArrayメソッドを呼び出して配列を変更し、最後に変更された配列の各要素を出力します。

// したがって、出力結果は次のようになります:

// 1 + 1 = 2
// 2 + 1 = 3
// 3 + 1 = 4

// つまり、2、3、4が順番に出力されるのです。