package ComparableANDComparator;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
//        Integer arr[]={2,1,5,4,7,0};
//        Arrays.sort(arr,(Integer val1,Integer val2)->val1-val2); // We have explicity provided compartor
//        Arrays.sort(arr); // Interall Interger uses comparable you dont pass any comparator
  //Comparator
        //provide multiuple ways of to compare object
        // no need  tom implemenmt comparator interface
       // Comparator interface has one abstratc method comapre(obj1,obj2)
//        Flexible and multiple compartor can be defined
//        The Comparator interface defines a single method, compare(), which compares two objects and returns:
//
//        A negative integer if the first object is less than the second object.
//                Zero if the first object is equal to the second object.
//                A positive integer if the first object is greater than the second object.
        Car[] carArray= new Car[3];
        carArray[0]=new Car("SUV","petrol");
        carArray[1]=new Car("Sedan","electric");
        carArray[2]=new Car("Hatchback","cng");
        // Three wayy to implelemnt compartor

       // By using
//        ✅ 1. Using a Separate Comparator Class
        // But every type of object to comapre you need to create a class
//        Arrays.sort(carArray,new CarNameComparator());
//        ✅ 2. Using an Anonymous Inner Class

//            Arrays.sort(carArray, new Comparator<Car>() {
//                @Override
//                public int compare(Car o1, Car o2) {
//                    return o1.carName.compareTo(o2.carName);
//                }
//            });

//
//        ✅ 3. Using a Lambda Expression (Java 8+)
        //        Arrays.sort(carArray,(Car obj1,Car obj2)->obj2.carName.compareTo((obj1.carName)))



//        ✅ Comparable Example (Natural Ordering)
//        Java provides a Comparable interface to define a natural ordering for objects of a user-defined class.
//        The Comparable interface contains a single method, compareTo()
//        This method is used to compare the current object (this) with the object passed as a parameter (o). unlike in which compartor we
//        there is two parameter need




        //******If you need multiple sorting strategies (e.g., by name, by marks descending, etc.), then you should use Comparator, not Comparable.

        Arrays.sort(carArray);
        for(Car c:carArray){
            System.out.println(c.carName+ " "+c.carType);
        }
    }

}
