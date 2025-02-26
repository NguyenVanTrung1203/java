package uet.oop.basic;
public class Solution {
    public String printHello() {
        return "HelloWorld";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String message = solution.printHello();
        System.out.println(message);
    }
}
