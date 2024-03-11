package p1_test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestCalculator1.class, TestCalculator2.class})
public class TestCalculatorSuite {

}
