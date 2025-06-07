package Streams;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streammain {

    // We can consider a stream  as piepeline  through  which opur collection elements passes through
    // While elemts pipeline passes through pipeline ,it perform various operation like sorting fiktering etc
    // useful when deails with bulk processin (cna do parller processing
//     Collection -> create stream -> Intermidtae operation -> Terminal operation

    // Intermidate Operation like:
//    filter();
//    sorted();
//    map();
//    distcinct();
//    etc
//    are used
    // These  operation transform the stream into another stream and more operatiobn can be done on top of it



    // Terminal Process
//    collect();
//    reduce ();
//    count() etc are used

    // these operation triggers the procession of the stream
    // and product the output menas after terminal operation are used afetr this we cnnaot perfom any operation on stream,

    public static void main(String[] args) {
//        List<Integer> salaryList = new ArrayList<>();
//        salaryList.add(3000);
//        salaryList.add(4100);
//        salaryList.add(5100);
//        salaryList.add(9000);
//        salaryList.add(1000);
//        salaryList.add(3500);
//        long output =salaryList.stream().filter((Integer sal)-> sal >3000).count();
//        System.out.println(output);
//
//        // Different ways to creatre stream
//        // From collection
//        List<Integer> salarylist =Arrays.asList(3000,4100,5001,1000,2500,3000);
//        Stream<Integer> streamForInteger=salarylist.stream();
//
//        //From array
//        Integer[] salaryarray= {3000,4100,5001,1000,2500,3000};
//        Stream<Integer> streamForIntegerArray=Arrays.stream(salaryarray);


        //From static method
//        Stream<Integer> streamFromStaticMethod =Stream.of(3000,4100,5001,1000,2500,3000);
//
//        // From Steam Builder
//        Stream.Builder<Integer> streamBuilder =Stream.builder();
//        streamBuilder.add(1000).add(9000).add(3500);
//
//        Stream<Integer> streamFromStreamBuilder =streamBuilder.build();
//


        // From stream Iterate
//
//        Stream<Integer>streamFromIterate =Stream.iterate (1000,(Integer n)-> n+5000).limit(5); // limit is stop the execution after 5 iteartion
//



        // Different Intermediate Operation
//
//        Stream<String> nameStream=Stream.of("Hello","Everybody","How","Are","You","Doing");  // for filtering the element
//        Stream<String> filteredStreams =nameStream.filter( (String name) ->name.length()<=3);
//
//        List<String> filteredNameList =filteredStreams.collect(Collectors.toList());
//        System.out.println(filteredNameList);
//

//        map(Function<T,R> mapper)  Used to tranform element
//        Stream<String> nameStream=Stream.of("Hello","Everybody","How","Are","You","Doing");  // for filtering the element
//        Stream<String> filteredStreams =nameStream.map((String name)->name.toUpperCase());
//
//        List<String> filteredNameList =filteredStreams.collect(Collectors.toList());
//        System.out.println(filteredNameList);

        // FilterMap uused to iterate over each element of the comlex collection and helps to flateern it
//        List<List<String>> sentenceList =Arrays.asList(
//                Arrays.asList("I","LOVE","JAVA"),
//                Arrays.asList("CONCEPTS","ARE","CLEAR"),
//                Arrays.asList("ITS","VERY","EASY")
//        );
//        Stream<String> WordStream1 =sentenceList.stream().flatMap((List<String> sentence)->sentence.stream());
//
//
//        //
//        Stream<String> WordStream2 =sentenceList.stream().flatMap((List<String> sentence)->sentence.stream().map((String val)-> val.toLowerCase()));
//        List<String> filteredNameList =WordStream2.collect(Collectors.toList());
//        System.out.println(filteredNameList);
//
//
//
//        Integer [] arr={1,5,2,7,4,4,2,0,9};
//        // Sort ascending
//        Stream<Integer> arrStream=Arrays.stream(arr).sorted();
//        // Sort descending
//  Arrays.stream(arr)
//                .sorted((val1, val2) -> val2 - val1)
//                .forEach((x)-> System.out.print(x+" "));
////        System.out.println(arrStreamdesc);
//
//
//        // PEAK ->  Helps you to see intermediate result of the stream which is getting processed
//        List<Integer> numbers=Arrays.asList(2,1,3,4,6);
//        Stream<Integer> numberStream =numbers.stream()
//                .filter((Integer val)-> val>2)
//                .peek((Integer val)-> System.out.println(val))
//                .map((Integer val)-> -1*val);
//        List<Integer> numberList=numberStream.collect(Collectors.toList());
//        System.out.println(numberList);
//
//

        //limit -> truncate the stream to have no longer than given maxsize
//        List<Integer> numbers=Arrays.asList(2,1,3,4,6);
//        Stream<Integer> numberStream =numbers.stream().limit(3);
//        numberStream.forEach((val)-> System.out.print(val));
//
        //Skip -> skip the frist n elemwent
//        List<Integer> numbers =Arrays.asList(2,1,3,4,6);
//        Stream<Integer> numberStream =numbers.stream().skip(3);
//        numberStream.forEach((val)-> System.out.print(val+" "));


//        / WOrking on primitve data type

//        int [] numberArray={2,1,4,7};
//        IntStream numberStream=Arrays.stream(numberArray);
//       numberStream.filter((int val)-> val >2).forEach((val)-> System.out.println(val));
      //  System.out.println(filteredArray.toString());


        //mapInt
//        List<String> numbers =Arrays.asList("2","1","4","7");
//        IntStream numberSystem =numbers.stream().mapToInt((String val)->Integer.parseInt(val));
//       numberSystem.forEach((val)-> System.out.println(val));

//       why we called Intermediate lazy

        //Intermediate operation is lazy because unless you call termiante operation i
//        Lazy: They don’t get executed immediately.
//        Instead, they create a pipeline of operations that will be executed only when a terminal operation is called.

        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);
            //Generally each element processed sequentially and can perform multiple operation this feature helps Stream to fast process the trask
        // Fors sorted it need all element to be presnt before operation starts

        Stream<Integer> numbersStream = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .peek((Integer val) -> System.out.println("after filter: " + val))
                .map((Integer val) -> (val * -1))
                .peek((Integer val) -> System.out.println("after negating: " + val))
                .sorted()
                .peek((Integer val) -> System.out.println("after Sorted: " + val));

//        Output
//        after filter: 4
//        after negating: -4
//        after filter: 7
//        after negating: -7
//        after filter: 10
//        after negating: -10
//        after Sorted: -10
//        after Sorted: -7
//        after Sorted: -4

        List<Integer> filteredNumberStream = numbersStream.collect(Collectors.toList());


        // Terminal Operaion
//        foreach,toarray,reduce,collect,min max,count anymathch,alllmatch,nonematchfindfirst,findany

        //How many time we can use a single stream
//        one terminal operation is used in a stream it is closed /consumed and cannot be used again for another terminal operation

        //Parallel Stream:
//        Helps to perofrm operation on stream concurrently , taking advanatge of muti core CPU
//    ParallelStream methode is used
//                1)it intrnall uses spillter function to dived the data from mid and in multiple chunks
//                2 ) task submission and parlleel processing uses fork join pool techinque

        List<Integer> numbers1=Arrays.asList(22,12,32,24,126);

        long parallelProcssingStartTime=System.currentTimeMillis();
        numbers1.parallelStream()
                .map((Integer val)-> val*val)
                .forEach(val-> System.out.println(val));
        System.out.println("Parallel processing time  "+(System.currentTimeMillis()-parallelProcssingStartTime)+ "ms");
    }

}
