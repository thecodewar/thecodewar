package com.thecodewar.java;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeStream {

  public static void main(String[] args) {
    PracticeStream practiceStream = new PracticeStream();
    practiceStream.anyMatch();
    practiceStream.noneMatch();
    practiceStream.mapToLong();
    practiceStream.findAny();
    practiceStream.forEachOrdered();
    practiceStream.forEach();
    practiceStream.allMatch();
    practiceStream.filter();
    practiceStream.findFirst();
    practiceStream.flatMapToInt();
    practiceStream.mapToInt();
    practiceStream.map();
    practiceStream.peek();
    practiceStream.collect();
  }


  private void anyMatch() {
    System.out.println("-- any match --");
    //Example 1
    List<Integer> list = Arrays.asList(3,4,6, 12, 20);
    boolean answer = list.stream().anyMatch(n -> n%20 == 0);
    System.out.println(answer);

    //Example 2
    List<String> strList = Arrays.asList("asad", "haura",
        "abdullah", "Mohibullah");
    answer = strList.stream().anyMatch(str -> Character.isUpperCase(str.charAt(0)));
    System.out.println(answer);
  }

  private void noneMatch() {
    System.out.println("-- None match --");
    Stream<String> stream = Stream.of("asad","saad");
    boolean answer = stream.noneMatch(str -> (str.length() == 5));
    System.out.println(answer);
  }

  private void mapToLong() {
    System.out.println("-- mapToLong--");
    Stream<String> stream = Stream.of("12","24","30");
    stream.mapToLong(str -> Long.parseLong(str))
        .filter(num -> num / 8 == 3)
        .forEach(System.out::println);
  }

  private void findAny() {
    System.out.println("-- findAny--");
    List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
    Optional<Integer> answer = list.stream().findAny();
    if (answer.isPresent()) {
      System.out.println(answer.get());
    }
    else {
      System.out.println("no value");
    }
  }

  private void forEachOrdered() {
    System.out.println("-- forEachOrdered --");
    List<Integer> list = Arrays.asList(10, 19, 20, 1, 2);
    list.stream().parallel().forEachOrdered(System.out::println);
  }

  private void forEach() {
    System.out.println("-- forEach --");
    List<Integer> list = Arrays.asList(10, 19, 20, 1, 2);
    list.stream().parallel().forEach(System.out::println);
  }
  private void allMatch() {
    System.out.println("-- allMatch --");
    List<Character> list = Arrays.asList('8', '6', '4','1', 'a');
    boolean answer = list.stream().allMatch(c ->Character.isDigit(c));
    System.out.println(answer);
  }

  private void filter() {
    System.out.println("-- filter --");
    List<Character> list = Arrays.asList('8', '6', '4','1', 'a');
    list.stream()
        .filter(c -> Character.isLetter(c))
        .forEach(System.out::println);
  }

  private void findFirst() {
    System.out.println("-- findFirst --");
    List<Character> list = Arrays.asList();
    Character testFindFirstResult = list.stream()
        .findFirst()
        .orElse('n');
    System.out.println(testFindFirstResult);
  }

  private void flatMapToInt() {
    System.out.println("--flatMapToInt--");
    List<String> list = Arrays.asList("1", "2", "3",
        "4", "5");
    list.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))).
        forEach(System.out::println);

  }

  private void mapToInt() {
    System.out.println("--mapToInt--");
    List<String> list = Arrays.asList("3", "6", "8",
        "14", "15");

    list.stream().mapToInt(num -> Integer.parseInt(num))
        .filter(num -> num % 3 == 0)
        .forEach(System.out::println);

  }

  private void map() {
    System.out.println("-- map --");
    List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
    list = list.stream().map(number -> number * 3).collect(Collectors.toList());
    list.forEach(System.out::println);
  }

  private void peek() {
    System.out.println("-- peek --");
    List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
    list.stream().peek(System.out::println).count();
  }

  private void collect() {
    Stream<Integer> i = Stream.of(15, 20);
    long count = i.collect(Collectors.counting());

    System.out.println(count);
  }
}

