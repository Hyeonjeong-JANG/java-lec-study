package ex14;

import java.util.*;

public class LottoHashMAp {
    public static void main(String[] args) {


        Set<Integer> lotto = new HashSet<>();
        Random r = new Random();
        while (true) {
            int num = r.nextInt(45) + 1;
            lotto.add(num);

            if (lotto.size() == 6) break;
        }
        List<Integer> lottoArr = new ArrayList<>(lotto);
        Collections.sort(lottoArr);
        lottoArr.stream().forEach(i -> System.out.print(i + " "));


    }
}
