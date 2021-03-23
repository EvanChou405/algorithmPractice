public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);

        System.out.println("-----------------------");

        LinkedListStack<Integer> stack1 = new LinkedListStack<>();

        for (int i = 0; i < 5; i++ ){
            stack1.push(i);
            System.out.println(stack1);
        }

        stack1.pop();

        System.out.println(stack1);

    }
}

