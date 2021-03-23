public class Main {

    public static void main(String[] args) {
	// write your code here

      LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0 ; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }


        System.out.println("------------------------");

        LinkedListQueue<Integer> queue1 = new LinkedListQueue<>();
        for (int i = 0 ; i < 10; i++) {
            queue1.enqueue(i);
            System.out.println(queue1);

            if (i % 3 == 2) {
                queue1.dequeue();
                System.out.println(queue1);
            }
        }


    }
}
