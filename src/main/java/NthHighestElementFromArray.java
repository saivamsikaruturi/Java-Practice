import java.util.PriorityQueue;

public class NthHighestElementFromArray {
    public static void main(String[] args) {
        int[] array={20,5,8,7,10};
        PriorityQueue<Integer>queue=new PriorityQueue<> ();
        for(int element : array){
            queue.add (element);
            System.out.println (queue);
            if(queue.size ()>4){

                queue.poll ();
            }

        }
        System.out.println (queue.poll ());
    }
}
