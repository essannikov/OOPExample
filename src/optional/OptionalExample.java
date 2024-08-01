package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        String name = null;
        //name.length();
        Integer length = Optional.ofNullable(name).map( (i) -> {return i.length();}).orElse(0);
        System.out.println(length);

        List<Integer> list = Arrays.asList(1,5,7,null);
        list.stream().map(i -> {return Optional.ofNullable(i).orElse(0) + 100;}).forEach(System.out::println);
    }
}
