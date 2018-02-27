package ch16;
/*
Write a method called set that accepts an index and a value and sets the list’s element at that index to have the given
value. You may assume that the index is between 0 (inclusive) and the size of the list (exclusive).
 */
public class ch16_1 {
    public static void main(String[] args) {

        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        System.out.println(liste);

        liste.set(2,10);
        System.out.println(liste);
    }

    /*
    Kaldte metode i min LinkedIntList class.

    public void set (int index, int value){
        nodeAt(index).data = value;
    }

    metoden den kalder i ovenstående metode:

    private ListNode nodeAt(int index){
        ListNode current = front;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }
    */
}
