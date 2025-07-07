public class Main {
    public static void main(String[] args) {
        // 1. 配列の宣言と初期化 (サイズは3で固定)
        String[] names = new String[3];

        // 2. 要素の追加 (添え字を指定して代入)
        names[0] = "たなか";
        names[1] = "すずき";
        names[2] = "さいとう";

        // 3. 要素の取得 (添え字を指定して取得)
        String name1 = names[0];
        String name2 = names[1];
        String name3 = names[2];
        System.out.println("配列0: " + names[0]);
        System.out.println("配列1: " + names[1]);
        System.out.println("配列2: " + names[2]);

        // 4. 要素数の確認 (.lengthフィールドを使用)
        int count = names.length;
        System.out.println("配列の要素数: " + count);

    }
}