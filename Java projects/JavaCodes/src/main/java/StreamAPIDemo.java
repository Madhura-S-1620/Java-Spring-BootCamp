import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;
public class StreamAPIDemo {        
    public static void main(String[] args) {
        ArrayList <String> data=new ArrayList<>();
        data.add("Kamal");
        data.add("Niti");
        data.add("Roshan");
        data.add(3,"Radha");
        data.add("Aman");
        data.add("Anita");
        //int x= print(67);   //lamda expression
        
        //Non-terminal operations
        List<String> result = data.stream()
                .filter(u -> u.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(result);
        
        
        List<Integer> lengths = data.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);

       /* for (int i = 0; i < data.size(); i++) {
            String str = data.get(i);
            System.out.println(str);*/
        String name="Narayan";
        
        System.out.println(name.length());
        List<String> flatmapresult = data.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.toList());
        System.out.println(flatmapresult);
        
        
        
        List<String> distinctElements = data.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctElements);
        
        
        List<String> sortedList = data.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
        
        
        
        List<String>newline=data.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println(newline);
        
        
        
        List<String> limited = data.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(limited);
        
        
        
        List<String> skipped = data.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(skipped);
        
        
        List<String> sortedListcomparator = data.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedListcomparator);
        
        
        //Terminal Operation
        
        List<String> list = data.stream()
                .collect(Collectors.toList());
        System.out.println(list);
        
        
        data.stream()
                .forEach(System.out::println);
        data.stream().forEachOrdered(System.out::println);
        
        
        Object[] array = data.stream().toArray();
        System.out.println("printing the arraylist in object array form");
        for(Object s: array)
        {
            System.out.print(s + " ");
        }
        
       
        System.out.println("\n Optional with concatenated..");
        Optional <String> concatenated;
        concatenated = data.stream().reduce(String::concat);
            System.out.println(concatenated);

            
            
        List <Integer>list1=new ArrayList<>();
             list1.add(34);list1.add(3);list1.add(4);list1.add(84);
             int sum = list1.stream().reduce(0, Integer::sum, Integer::sum);
             System.out.println(sum);

                    
         long count = data.stream().count();
         System.out.println(count);
                    
         
         boolean anyStartsWithA = data.stream()
                 .anyMatch(s -> s.startsWith("A"));
         System.out.println(anyStartsWithA);
         
         
         boolean allStartWithA = data.stream()
                 .allMatch(s -> s.startsWith("A"));
         System.out.println(allStartWithA);
         
         
         
         boolean noneStartWithA = list.stream()
                 .noneMatch(s -> s.startsWith("A"));
         System.out.println(noneStartWithA);
         
         
         
         Optional<String> first = data.stream()
                 .findFirst();
         System.out.println(first);
         
         
         Optional<String> any = list.stream()
                 .findAny();
         System.out.println(any);
         
         
         boolean hasMatch = data.stream().anyMatch(s -> s.startsWith("A"));
         System.out.println(hasMatch);







    }

    }
