//package com.demo.strategy;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//class StrategyApplicationTests {
//	@Mock
//	private StrategyApplication.ResultStrategy ageStrategy;
//
//	@Mock
//	private StrategyApplication.ResultStrategy genderStrategy;
//
//	private StrategyApplication.ResultContext resultContext;
//
//	private StrategyApplication.ResultController resultController;
//
//	@BeforeEach
//	public void setUp() {
//		resultContext = new StrategyApplication.ResultContext(ageStrategy, genderStrategy);
//		resultController = new StrategyApplication.ResultController(resultContext);
//	}
//
//	@Test
//	void testGetResultWithNullInput() {
//		String result = resultController.getResult(null, null);
//		assertEquals("OMG FUCK OFF (Invalid input)", result);
//	}
//
//	@Test
//	void testGetResultWithEmptyInput() {
//		String result = resultController.getResult("", "");
//		assertEquals("OMG FUCK OFF (Invalid input)", result);
//	}
//
//	@Test
//	void testGetResultWithValidInput() {
//		when(ageStrategy.getResult("18", "male")).thenReturn("Ok. Can buy Mark Six");
//		when(genderStrategy.getResult("18", "male")).thenReturn("Man gambles no good");
//		String result = resultController.getResult("18", "male");
//		assertEquals("Ok. Can buy Mark Six Man gambles no good", result);
//	}
//
//	@Test
//	void testGetResultWithInvalidGender() {
//		when(ageStrategy.getResult("20", "invalid")).thenReturn("Ok. Can buy Mark Six");
//		when(genderStrategy.getResult("20", "invalid")).thenReturn("OMG FUCK OFF");
//		String result = resultController.getResult("20", "invalid");
//		assertEquals("Ok. Can buy Mark Six OMG FUCK OFF", result);
//	}
//}
