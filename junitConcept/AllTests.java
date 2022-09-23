package junitConcept;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AgeTest.class, ColorTest.class, CountTest.class, LoginTest.class, SquareTest.class })
public class AllTests {

}
