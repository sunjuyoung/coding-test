import java.util.EmptyStackException;

public class Test {
    public static void main(String[] args) {
        

        String s = "a";

        System.out.println(s.charAt(0)-'0');
    }    
}




class Stack<T>{
    class Node<T>{
        private T data;
        private Node<T> next;
        
        public Node(T data){
            this.data = data;
        }
    }

   private Node<T> top;

   public T pop(){
       if(top==null){
           throw new EmptyStackException();
       }
       T item = top.data;
       top = top.next;
       return item;

   }

   public void push(T item){
       Node<T> t = new Node(item);
       t.next = top;
       top = t;
   }

   public T peek(){
    if(top==null){
        throw new EmptyStackException();
    }
    return top.data;
}



}