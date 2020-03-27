/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Neha",23));
        queue.enqueue(new Student("Mani",17));
        queue.enqueue(new Student("Prachi",26));
        queue.enqueue(new Student("Reema",35));
        queue.enqueue(new Student("Priyanka",33));
        queue.enqueue(new Student("Nishtha",24));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}
