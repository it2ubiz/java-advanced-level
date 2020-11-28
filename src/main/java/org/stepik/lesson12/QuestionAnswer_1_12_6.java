package org.stepik.lesson12;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_12_6 {
    /*
     * Вопрос:
     *
     * Given a string consisting of brackets, write a program to examine whether the pairs and the orders of "{", "}", "(", ")", "[", "]" are correct (balanced). For example, the program should print true for the string [()]{}{[()()]()} and false for ()[]}.
     * The classic algorithm for solving this problem relies on using a stack.
     *
     * create an instance of a stack;
     * traverse the input string;
     * if the current character is a starting bracket "(" or "{" or "{" then push it to the stack;
     * if the current is a closing bracket ")" or "}" or "]" then remove (pop) the top element from the stack; if the popped bracket is the matching starting bracket then fine else parenthesis are not balanced;
     * after completing traversal, if there are some starting brackets left in the stack, then the parenthesis are not balanced.
     * Sample Input:
     *
     * ([][])
     * Sample Output:
     *
     * true
     *
     * Ответ: см.ниже
     * */


    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.empty() && ((s.charAt(i) == ']' && stack.peek() == '[') ||
                    (s.charAt(i) == '}' && stack.peek() == '{') ||
                    (s.charAt(i) == ')' && stack.peek() == '('))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.empty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
