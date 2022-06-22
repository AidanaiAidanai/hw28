package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Integer[] sandar = {2,3,4,5,6,7,8,9,10,12,13};
       List<Integer> rd =  Arrays.stream(sandar).filter(x->x%2==0).collect(Collectors.toList());
       rd.forEach(System.out::println );
      Optional<Integer> a =  rd.stream().map(x->x*x).max(Comparator.naturalOrder());
        System.out.println("жуп сандардын квадраттарынын эн чону "+a.get());

    }
}
