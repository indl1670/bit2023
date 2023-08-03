package lotto;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LottoNumberGenerator {

    public List<Integer> generate(final int money) {
        if (!isValidMoney(money)) {
            throw new RuntimeException("올바른 금액이 아닙니다.");
        }
        return generate();
    }

    private boolean isValidMoney(final int money) {
        return money == 1000;
    }

    private List<Integer> generate() {
        return new Random()
                .ints(1, 45 + 1) // 2-45
                .distinct() // 중복허용 x
                .limit(6) // 6개 제한
                .boxed() // Integer 형태로 박싱
                .collect(Collectors.toList()); // 6게 슷자를 리스트에 담음
    }

}
