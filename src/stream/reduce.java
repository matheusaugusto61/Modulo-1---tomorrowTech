package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class reduce {

    public static void main(String[] args) {
        var list = Arrays.asList(1,2,3,4,5,6,7,8);

//        Optional<Integer> reduce = list.stream()
//                .reduce((n1, n2) -> n1 + n2);
//
//        System.out.println(reduce.get());

        Optional<Integer> max = list.stream()
                .skip(1)
                .filter(numero -> numero % 2 == 0)
                .max(Comparator.naturalOrder());

        System.out.println(max.get());
    }
}
