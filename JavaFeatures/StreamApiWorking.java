package JavaFeatures;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiWorking {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection","Collection","Stream"),
                Arrays.asList("Structure","State","Flow"),
                Arrays.asList("Sorting","Mapping","Reduction","Stream")
        );
        Set<String> intermediateResult = new HashSet<>();

        //For Collection<E> .stream() will return Stream<E>
        // Here E = List<String> so .stream() will return Stream<List<String>
        //.collector
        List<List<String>> result1 = listOfLists.stream().collect(Collectors.toList());
        List<List<String>> result2 = listOfLists.stream().toList();
        List<List<String>> result3 = new ArrayList<>(listOfLists);
        System.out.println(STR."\{result1.equals(result2)} \{result3.equals(result1)}");
        System.out.println(result1);
        List<Integer> result4 = result1.stream()
                .map(strings -> strings.size())
                .toList();
        List<Integer> result5 = result1.stream()
                .map(List::size)
                .toList();
        System.out.println(result4);

        Predicate<List<String>> predicate = new Predicate<List<String>>() {
            @Override
            public boolean test(List<String> strings) {
                return strings.size()<=3;
            }
        };
        List<List<String>> result6 = result1.stream().filter(predicate).toList();
        List<List<String>> result7 = result1
                .stream()
                .filter(strings -> strings.size()<=3)
                .toList();
        System.out.println(result7 +"\n"+result6);

        Function<List<String>,Stream<String>> function = new Function<List<String>, Stream<String>>() {
            @Override
            public Stream<String> apply(List<String> strings) {
                return strings.stream();
            }
        };
        Function<List<String>,Stream<String>> fun = strings-> strings.stream();
        List<String> result8 = result1.stream().flatMap(List::stream).toList();
        System.out.println(result8);

        result8.stream().forEach(x->System.out.println(x));
        result1.stream().forEach(x->{
            for(String s: x){
                System.out.print(s+",");
            }
            System.out.println();
        });
        System.out.println(result1.stream().count());
    }
}

