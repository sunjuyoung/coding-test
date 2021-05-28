import java.util.LinkedList;
import java.util.Queue;

public class test04 {
    
    public static void main(String[] args) {

        Queue<Node> q = new LinkedList<>();

        q.offer(new Node(0, 0));

        Node node = q.poll();

        
        
    }
}

class Node{

    private int x;
    private int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

}
