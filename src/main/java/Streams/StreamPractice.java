package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        // Print the list using lambda expression
//        List<String> names= Arrays.asList("Alice","Bob","Charlie");
//        names.stream().forEach((String name)-> System.out.println(name));
//        Filter even numbers from a list using Streams.
//        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        numbers.stream().filter((val)->val%2==0).forEach(val-> System.out.print(val+" "));

        //        Find the maximum value in a list using Streams.
//        num.stream().max((Integer val,Integer val2)->val-val2) // error
//        causes a compile-time error because .max(...) returns an Optional<Integer>, not an int
//        List<Integer> num=Arrays.asList(22,41,56,80,90,100,2);
//       int max= num.stream().max((Integer val,Integer val2)->val-val2).orElse(0);
//        System.out.println(max);
//        4. Convert a list of strings to uppercase
        // why map beacuse due to it map the values
        //List<String> names= Arrays.asList("Alice","Bob","Charlie", "Akash","Cog");
//        names.stream().map(val->val.toUpperCase()).forEach((String name)-> System.out.println(name));
////        . Group strings by their length using groupingBy().
//        Grouping  and partitiong always return a map
//        partioning return a boolean map
//        Map<Integer,List<String>> grouped= names.stream().
//                collect(Collectors.groupingBy(name-> name.length()));
//
//        System.out.println(grouped);


//        List<String> words = Arrays.asList("apple", "bat", "car", "elephant", "dog", "ant");
//        List<Integer> num=Arrays.asList(22,41,56,80,90,100,2);
//        System.out.println(  num.stream().reduce(0,(Integer val1 ,Integer val2)-> val1+val2 ));

//        8. Concatenate strings using joining().
//        List<String> word=Arrays.asList("Java","is","awesome");
//        String sentenace=word.stream().collect(Collectors.joining(" "));
//        System.out.println(sentenace);


//        List<Employee> employees=Arrays.asList(
//                new Employee("Alice",50000),
//                new Employee("Bob",70000),
//                new Employee("Charlie",20000)
//        );
//
//        List<Employee> sorted =employees.stream().sorted(Comparator.comparing(e->e.salary)).collect(Collectors.toList());
//        // can be done like this
//       // List<Employee> sorted2 =employees.stream().sorted((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary())).collect(Collectors.toList());
//        System.out.println(sorted);

        // Find the first no repeated charatcer in a string
//        String input="swiss";
//        Character result=input.chars()
//                .mapToObj(c->(char) c)
//                .filter(ch-> input.indexOf(ch)== input.lastIndexOf(ch))
//                .findFirst().orElse(null);
//        System.out.println(result);


        //Chaning multiple filters in Streams
//        List<Integer> al=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        al.stream().filter(val-> val%2==0).filter(val->val>5).forEach(val-> System.out.println(val));


//        11. Use Stream.distinct() to remove duplicates from a list
            List<Integer> al= Arrays.asList(1,1,2,3,4,5,5,6,7,8,9);
            al.stream().distinct().forEach(val-> System.out.println(val));

//        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex");
//        names.stream().filter(name->name.startsWith("A")).forEach(name-> System.out.println(name));
       //Sort a list of strings alphabetically and in reverse order
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
       // Sort ascending order
        List<String>sortedName= names.stream().sorted().collect(Collectors.toList());

        // Sort descending order
        List<String> descSortedName=names.stream()
                .sorted((String name1,String name2)-> name2.compareTo(name1)).collect(Collectors.toList());
        System.out.println(sortedName);
        System.out.println(descSortedName);

        List<String> revereorder=names.stream().map(name->new StringBuilder(name).reverse().toString()).collect(Collectors.toList());
        System.out.println(revereorder);

//        Use Collectors.partitioningBy() to separate even and odd numbers.
//            List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
//            Map<Boolean,List<Integer>> partionednumber=numbers.stream().collect(Collectors.partitioningBy(n-> n%2==0));
//        System.out.println(partionednumber);

        //6. Find the second highest number in a list.
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//        System.out.println(numbers.stream().sorted((Integer val1,Integer val2)-> Integer.compare(val2,val1)).skip(1).findFirst().orElse(0));

//        17. Count the frequency of characters in a string using Streams.
//        String input = "java";
//        Map<Character, Long> frequency = input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
//        System.out.println(frequency);

//        18. Generate an infinite Stream of even numbers and limit it to 10 elements.
//
//        List<Integer> numbers= Stream.iterate(0,n->n+2)
//                .limit(10)
//                .collect(Collectors.toList());
//        System.out.println(numbers);
//        19. Check if all elements in a list are greater than a given number
//        List<Integer>numbers=Arrays.asList(10,20,30,40);
//        boolean allGreater =numbers.stream().allMatch(n->n>5);
//        System.out.println(allGreater);

//        20. Find the average of a list of numbers.
//            List<Integer> numbers=Arrays.asList(10,20,30,40);
//            double average=numbers.stream().reduce(0,(Integer val1,Integer val2)-> val1+val2)/numbers.size();
//        System.out.println(average);


//        21. Generate the Fibonacci series using Stream.iterate().
//    Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]})
//                .limit(9).map(f->f[0])
//                .forEach(a-> System.out.print(a+" "));
//

//        Group employees by department using Collectors.groupingBy()
//        List<Employee> employees=Arrays.asList(
//                new Employee("Alice", "HR"),
//                new Employee("Bob", "IT"),
//                new Employee("Charlie", "HR"),
//                new Employee("David", "IT")
//        );
//        Map<String,List<Employee>> deptemployee=employees.stream().collect(Collectors.groupingBy(emp->emp.department));
//        deptemployee.forEach((department, list) -> {
//            System.out.println(department + ": " + list);
//        });'
//        deptemployee.forEach((department,list)->{
//            System.out.print(department+" ");
//            list.forEach(enames-> System.out.print(enames.name+" "));
//        });


//        23. Count occurrences of each word in a sentence.
        String sentence = "Java is fun and Java is powerful";
        Map<String,Long> countoccurences=Arrays.stream(sentence.split("")).collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println(countoccurences);

        // if you want for every character in word how mach occurence for charatcer yiou can use below
//        Map<String,Long> countoccurences=Arrays.stream(sentence.replace(" ","").split("")).collect(Collectors.groupingBy(word->word,Collectors.counting()));

//        24. Find the longest word in a list.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

//        Integer.compare(int x, int y) is a static method that compares two integers and returns:
//        Comparison	Return Value
//        x < y	            -1
//        x == y	         0
//        x > y	             1
        String longestword=words.stream().max((s1,s2)->Integer.compare(s1.length(),s2.length())).orElse("");
        System.out.println(longestword);


//        25. Merge two lists into a single list using flatMap().
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer>mergedlist= Stream.of(list1,list2).flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(mergedlist);


//        26. Find the first element in a Stream greater than 10.
//        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 20);
//        int first=numbers.stream().filter(val-> val>10).findFirst().orElse(0);
//        System.out.println(first);

//        Find the minimum value in a list using Streams
        List<Integer> numbers = Arrays.asList(10, 20, 5, 15);
        int mins=numbers.stream().min((val1,val2)->Integer.compare(val1,val2)).orElse(0);
        System.out.println(mins);

//        Use Stream.generate() to create a list of random numbers.
//        Stream<Integer>randomNumber=Stream.generate(() -> new Random().nextInt(10)).limit(5);
//        randomNumber.forEach(System.out::print);
//

//        29. Find duplicate elements in a list using Streams.
        List<Integer> duplicatenumbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);
        Set<Integer> seen=new HashSet<>();
//        ✅ Set.add(element) returns:
//            **true** if the element was not already in the set
//
//            **false** if the element was already present (i.e., a duplicate)

//
//        List<Integer> duplicates=duplicatenumbers.stream().filter(val->!seen.add(val)).distinct().collect(Collectors.toList());
//        System.out.println(duplicates);
//

//        0. Partition a list into prime and non-prime numbers.
        List <Integer> alnumber=Arrays.asList(1,2,3,4,5,6,7,0,9,10);
        Map<Boolean,List<Integer>>sprime=alnumber.stream().collect(Collectors.partitioningBy(num->isPrime(num)));
        System.out.println(sprime);

//        Calculate the factorial of a number using Streams.
//        IntStream.rangeClosed(1, n) in Java
//        This creates a stream of integers from 1 to n (inclusive).
        int number=5;
        int factorial= IntStream.rangeClosed(1,5).reduce(1, (a,b)->a*b);
        System.out.println(factorial);


   //     33. Use Stream.skip() and Stream.limit() to extract sublists
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer>newnum=num.stream().skip(3).limit(num.size()).collect(Collectors.toList());
        System.out.println(newnum);


        //35. Find all palindromic strings in a list.
        List<String> wordsnew = Arrays.asList("madam", "racecar", "java", "level","hello");
        List<String> pallindromword=wordsnew.stream().filter(word->word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());
        System.out.println(pallindromword);
    }

    private static boolean isPrime(Integer num) {
        if(num<=1)
            return false;
        if(num==2)
            return true;
        if(num%2==0)
            return false;
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0)
                return false;
        }
        return true;
    }

}
class Employee {
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
    // int salary;

    String department;

//    public Employee(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//    }

    public Employee(String name,String department){
        this.name=name;
        this.department=department;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}
