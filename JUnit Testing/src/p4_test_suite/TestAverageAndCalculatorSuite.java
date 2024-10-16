package p4_test_suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import p1_calculator_tests.CalculatorTest;
import p3_average_tests.AverageTest;

@Suite
@SelectClasses({AverageTest.class, CalculatorTest.class})
public class TestAverageAndCalculatorSuite {

}
