package lotto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class LottoTest {

	@DisplayName("로또 번호 갯수 테스트")
	@Test
	@Order(1) // 실행 순서
	void lottoNumberSizeTest() {
	    // given
	    LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
	    int price = 1000;

	    // when
	    List<Integer> lottoNumber = lottoNumberGenerator.generate(price);

	    // then
	    // assertEquals - 위에서 만들어진 내용(lottoNumber)이 6개인지 확인
	    assertEquals("Size Error", lottoNumber.size(),6);
	}




	@DisplayName("로또 번호 범위 테스트")
	@Test
	@Order(2)
	void lottoNumberRangeTest() {
	    // given
	    LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
	    int price = 1000;
	
	    // when
	    List<Integer> lotto = lottoNumberGenerator.generate(price);
	    // then
	    // lotto의 값들이 1-45 사이 값이 아닌 경우 Range Error
	    // stream() 메모리에서 빠르게 비교 분석하는 기능
	    assertTrue("Range Error", lotto.stream().allMatch(v -> v >= 1 && v <= 45));
	}
	
	@DisplayName("잘못된 로또 금액 테스트")
	@Test
	@Order(3)
	void lottoNumberInvalidMoneyTest() {
	    // given
	    LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
	    int price = 2000;

	    // when
	    // '()' 함수 안에서 발생하면 Exception 발생
	    RuntimeException exception = 
	    		assertThrows(RuntimeException.class, 
	    				() -> lottoNumberGenerator.generate(price));
	    // then
	    // 예외 메세지가 같으면 pass, 다르면 fail
	    assertEquals("Input Money Error", exception.getMessage(), "올바른 금액이 아닙니다.");
	}
	
	
}