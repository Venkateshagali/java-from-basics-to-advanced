public class RecursionBacktrackingSubsetDemo {
    public static void subsets(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }
        subsets(s, current, index + 1);
        subsets(s, current + s.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        subsets("abc", "", 0);
    }
}
