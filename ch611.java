import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ch611 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       

        sc.nextLine();
        String [] arr = null;
        List<Student> student = new ArrayList<>();

        for(int i=0; i<n; i++){
           arr = sc.nextLine().split(" ");
            student.add(new Student(arr[0].toString(),Integer.parseInt(arr[1])));
        }

       Iterator i = student.iterator(); 
       while(i.hasNext()){
           System.out.println(i.next());
       }



        Collections.sort(student);
        
        System.out.println();

        for(int i=0; i< student.size(); i++){
            System.out.print(student.get(i).getName()+" ");
        }


    }

  

}


class Student implements Comparable<Student>{

    private String name;
    private int score;
    
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score < o.score){
            return -1;
        }
        return 1;
    }
}