class Node {
    int data;
    Node next;


    public int getdata() {
        return data;
    }

    public void setdata(int data) {
        this.data = data;
    }

    public Node getnext() {
        return next;
    }

    public void setnext(Node next) {
        this.next = next;
    }


}
class mylinked
{
    Node front;
    Node rear;
    public mylinked()
    {
        front = null;
        rear = null;
    }


    public boolean isempty() {
    if (front == null && rear == null) {
        return true;
    } else {
        return false;
    }
}

public void enqueue(int val) {
    Node n = new Node();
    n.setdata(val);
    if (isempty()) {
        front = rear = n;
    } else {
        rear.setnext(n);
        rear = n;
    }
}
public void dequeue() {
    if (front == null) {
        return;
    } else {
        front = front.getnext();
    }
}
public void display() {
    Node temp;
    temp = front;
    if (isempty()) {
        return;
    } else {


        while (temp != null) {
            System.out.println(temp.getdata());
            temp = temp.getnext();

        }
    }
}



}
public class linkedqueue
{
    public static void main(String[] args) {
        mylinked obj = new mylinked();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}
