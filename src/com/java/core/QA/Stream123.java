package com.java.core.QA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Stream123 {

    public static void main(String[] args) {

        String s = "Ram is on leave today";
        String s1 = "Ram";

        //Integer i = i;
        String[] array = s.split(" ");

//          Map<String, Long> m= s.codePoints().boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting());
//                  mapToObj(Character::toString)
//                  .collect(Collectors.groupingBy(e -> e, Collectors.counting()));             

        // groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        // Arrays.stream(array).
        // System.out.println(m);

        List<String> list = Arrays.asList(
                "hello", "bye", "ciao", "bye", "ciao");

        Map<String, Integer> counts = list.parallelStream().collect(Collectors.toConcurrentMap(
                w -> w, w -> 1, Integer::sum));
        
        /*
         * Map<Object, Long> counts1 = list.parallelStream()
         * .collect(Collectors.groupingBy(e->e,
         * Collectors.collectingAndThen(Collectors.groupingBy(e->e),
         * Collectors.counting()))));
         */
        
        System.out.println(counts);

        // emp id name deptId f salary
        // dept id name

        // deptname maxsalary

        // select d1.name, e1.salary form emp e1, dept d1 where e1.deptid=dq.id
        // groupBy(e.deptid) havaing(max(e.salary));

    }
}
