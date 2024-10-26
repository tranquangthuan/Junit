package com.thuan.java.Junit;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ FactorialTest.class, DivisorTest.class })
@IncludeTags("POSITIVE")
public class FactorialAndDivisorTestSuite {

}
