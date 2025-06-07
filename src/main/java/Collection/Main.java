package Collection;

import java.util.*;

public class Main {
    // Collection was added in java 1.2
    // COLLECTION IS gtroup of object
    // java.util package  provides the collection facilittes
    // Framework provide us the architecture to manage goruo of object
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);


        System.out.println("Iteration the values using iterator method");
        Iterator<Integer> valIterator=values.iterator();
        while(valIterator.hasNext()){
            int val=valIterator.next();
            System.out.print(val+" ");
            if(val==1){
                valIterator.remove();
//                ✅ Why Iterator.remove() is safe
//                When you use Iterator to traverse a collection, it keeps track of two internal counters:
//🔹 1. modCount (modification count)
//                A field in the collection (like ArrayList) that tracks structural changes (add/remove).
//
//                        It's incremented every time the collection is structurally modified.
//
//🔹 2. expectedModCount
//                A field inside the Iterator.
//
//                        It captures the modCount value at the time the iterator is created.
//
//                        During each next() call, it checks if expectedModCount == modCount.
//
//❌ If they don’t match → ConcurrentModificationException
//                This happens if:
//                List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
//
//                for (Integer val : list) {
//                    if (val == 2) {
//                        list.remove(val); // ❌ modifies modCount, but iterator’s expectedModCount doesn't update
//                    }
//                }
//✅ Iterator.remove() works because:
//                It internally sets modCount = ++modCount;
//
//                And updates expectedModCount after removal, keeping them in sync.
//

            }
        }

        // for each loop
//        for(int val:values){
//            System.out.println(val);
//        }
        //Duplicate elemnts are alloed in array list /list
        System.out.println("size :"+ values.size());
        System.out.println("isEmpty:"+ values.isEmpty());
        System.out.println("contains:" + values.contains(2));
        values.add(5);
//        //remove using index
//        values.remove(1);
//
//        // To remove using elemnt
//        values.remove(Integer.valueOf(2));

//      removeAll->  Removes elements present in collection c
//        return type is boolean
        values.removeAll(List.of(4,5));
        System.out.println("isEmpty:"+ values.isEmpty());


//         Collection is the  root interface in Java collection framework
//        It represents a group of objects (like List, Set, Queue).
//
//        It defines common methods like add(), remove(), size(), clear(), etc.




//        Collections (utility class)
//        It is a class in java.util.
//        Contains static utility methods to operate on or return collections.
//         Examples: sort(), reverse(), shuffle(), max(), min(), synchronizedList().
             Collections.sort(values);
             Collections.sort(values,(val1,val2)->val2-val1);
        System.out.println(values);


//        Queue is interface  ,
//        FIFO order but exception like priport quueu where it follows max and min heap
//        min heap
        //PriorityQueue is not thread safe ,Null vlaues are not allowed , Duplicate elemnets allowed
        // Thread Safe version is -> PriorityBlockingQueue
        PriorityQueue<Integer> mimPQ=new PriorityQueue<>();
        mimPQ.add(7);
        mimPQ.add(2);
        mimPQ.add(1);
        mimPQ.add(4);

        mimPQ.forEach(val-> System.out.print(val+" "));

        while (!mimPQ.isEmpty()){
            int val=mimPQ.poll();
            System.out.println("remove element: "+ val);
        }

//    max heap
//        PriorityQueue<Integer> maxPQ=new PriorityQueue<>((Integer a,Integer b)->b-a);
//        maxPQ.add(5);
//        maxPQ.add(2);
//        maxPQ.add(8);
//        maxPQ.add(1);
//        System.out.println(maxPQ);
//
//
//        maxPQ.forEach(val-> System.out.print(val+" "));
//
//        while (!maxPQ.isEmpty()){
//            int val=maxPQ.poll();
//            System.out.println("remove element: "+ val);
//        }



//        Deque
//  Doubled eneded queue , Means Addition and emoval can be done from both side of the queue
        //ArrayDeque is not thread safe ,Null vlaues are not allowed , Duplicate elemnets allowed
        // Thread Safe version is -> ConcurrentLinkedDeques
//        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
//
//        //Insertion
//        arrayDeque.addLast(1);
//        arrayDeque.addLast(5);
//        arrayDeque.addLast(10);



        //Deletion
//        int element =arrayDeque.removeFirst();
//        System.out.println(element);


//        Deque can also work as stack LIFO

//          ArrayDeque<Integer> arryaDequeAsStack=new ArrayDeque<>();
//        arryaDequeAsStack.addFirst(1);
//        arryaDequeAsStack.addFirst(5);
//        arryaDequeAsStack.addFirst(10);
//
//          //Deletion
//            int removeEle=arryaDequeAsStack.removeFirst();
//        System.out.println(removeEle);


//        Time Comoplexity
//            O(1) -> Searching
//            O(1) -> Deletion
//            o(n) -> insertion - beacuse when queue size full it will create a new copy and create all the old elemnt  in new queue and add our elemnt

//                Space complexity
//        O(N)
//


//        List
//        In Java (OpenJDK implementation), the ArrayList grows its capacity by approximately 50% each time it fills up.
        List<Integer> list1 = new ArrayList<>();

        // add(int index, Element e)
        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);
        list1.add(3, 400);
        list1.add(4, 500);
        list1.add(5, 600);
        list1.add(6, 300);

        // addAll(int index, Collection e)
        List<Integer> list2 = new ArrayList<>();
        list2.add(0, -100);
        list2.add(1, -200);
        list2.add(2, -300);
        list2.add(3, -400);
        list2.add(4, -500);
        list2.add(5, -600);

        list1.addAll(6, list2);
        list1.forEach(val -> System.out.print(val + " "));
        System.out.println();

        // replaceAll(UnaryOperator op)
        list1.replaceAll((Integer val) -> -1 * val);
        System.out.println("after replace all");
        list1.forEach(val -> System.out.println(val));

        // sort(Comparator op)
        list1.sort((Integer val1, Integer val2) -> val1 - val2);
        System.out.println("after sorting in increasing order");
        list1.forEach(val -> System.out.println(val));

        // get(index)
        System.out.println("value present at index 2 is : " + list1.get(2));

        // set(index, Element e)
        list1.set(2, -4000);
        System.out.println("after set method");
        list1.forEach(val -> System.out.println(val));

        // remove(int index)
        list1.remove(2);
        System.out.println("after removing");
        list1.forEach(val -> System.out.println(val));

        // indexOf(object)
        System.out.println("index of -200 Integer object is: " + list1.indexOf(-200));

        // ListIterator to provide index info in ListIterator: from where it has to start
        ListIterator<Integer> listIter2 = list1.listIterator(list1.size());

        // traversing backward direction
        while (listIter2.hasPrevious()) {
            Integer val = listIter2.previous();
            System.out.println("traversing backward: " + val + " nextIndex: " + listIter2.nextIndex() + " previous index: " + listIter2.previousIndex());
        }

        // set() method of listIterator
        listIter2.set(-600);
        listIter2.set(-500);
        listIter2.set(-300);
        listIter2.set(-200);
        listIter2.set(-100);

        list1.forEach(val -> System.out.print("after set: " + val+" "));

        // traversing forward direction
        listIter2 = list1.listIterator();
        while (listIter2.hasNext()) {
            Integer val = listIter2.next();
            System.out.println("traversing forward: " + val + " nextIndex: " + listIter2.nextIndex() + " previous index: " + listIter2.previousIndex());
        }

        // add() method in iterator
        listIter2.add(-400);
        listIter2.add(-600);
        listIter2.add(-300);
        listIter2.add(-200);
        listIter2.add(-100);

        list1.forEach(val -> System.out.println("after add: " + val));

        // subList view
        List<Integer> subList = list1.subList(0, 3);
        subList.forEach(val -> System.out.println("subList : " + val));

        subList.add(-600);
        subList.add(-500);
        subList.add(-300);
        subList.add(-200);
        subList.add(-100);

        subList.forEach(val -> System.out.println("after value added in subList : " + val));


        //LinkedList implements both deques and List interface
//        .. Means it support both deque and list interface methods

        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(300);
        list.addLast(200);
        list.addLast(100);
        list.addFirst(80);
        System.out.println(list.getFirst());
        System.out.println(list);

        LinkedList<Integer> list3=new LinkedList<>();
        list3.add(0,100);
        list3.add(1,200);
        list3.add(2,300);
        list3.add(3,400);
        System.out.println(list3.get(2));

//        Time Complexity
//                Insertion O(1)
//        Search-> O(n)
//        Deletion O(1) -> //    for particualr index it is O(N)
//        Inseryin O(1) -->
//    for particualr index it is O(N)


            // Vector is smae like arraylist , elemnts can be access  via index
            //Vector is Thread safe beacause of this it not efficent since everytime it need tou put and unlock for any operation
            //When full, it increases capacity by doubling it (newCapacity = oldCapacity * 2).
//        Vector<Integer> vector = new Vector<>(2);
//        vector.add(1);
//        vector.add(2); // Full
//        vector.add(3); // Resizes to capacity 4

//        Stack is a subclass of Vector, so it behaves exactly the same as Vector for resizing.
//        It also resizes by doubling when full
//        Stack also thread since it subclass of vector
//        Stackl follow lifo order
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());

        // Time complexity
//        Insertion-> O(1)
//        Deletion -> O(1)
//        search o(N)
        }
}
