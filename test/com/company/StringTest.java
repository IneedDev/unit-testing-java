package com.company;

import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.rules.TestName;
import org.junit.runners.Parameterized;
import sun.rmi.runtime.Log;

import java.time.Duration;


public class StringTest {

    // stetting up db connection
    // junit5 BeforeAll

    @BeforeClass // before need to be static method run only once
    public static void beforeAll(){
        System.out.println("setup connection");
    }

    @Rule
    public TestName name = new TestName();

    @Before
    public void beforeEachTest(){
        System.out.println("Before each test print it" + name.getMethodName());
    }

    @AfterEach
    public void afterEachTest(TestInfo info){
        System.out.println("After each test print it");
        System.out.println(info.getDisplayName());

    }


    @Test
    public void test() {
        int actuallenght = "ABCD".length();
        int expectedlenght = 4;
        Assert.assertEquals(expectedlenght, actuallenght);
        //implementation

        //     public static void assertEquals(long expected, long actual) {
        //        assertEquals((String)null, expected, actual);
        //    }

        // test code
        //CUT code under test
        //Assertion - expected result
    }

    @Test(expected = NullPointerException.class)
    //handling Nullpointerexception while test
    // we expect expetion therefore test will be green
    public void lengthException() throws Exception{
        String str=null;
        int actuallength = str.length();
    }

    //we do not expect any specific exception

    @Test
    @DisplayName("When length is null returns exception")
    public void lengthExceptionUnknown() {
        try {
            String str=null;
            int actuallength = str.length();
        }
        catch (Exception e) {
            System.out.println("Exception " + e.getClass().getSimpleName());
            //Assert.fail("Exception " + e.getMessage());
        }
    }


    @ParameterizedTest
    @ValueSource(strings = {"ABCD", "ABC", "A"})
    public void lengthgreaterThanZeroParamTest(String str){
        Assert.assertTrue(str.length()>0);

    }

    @ParameterizedTest
    @CsvSource(value ={"abcd, ABCD","abc, ABC","'',''","abcdef, ABCDEF"})
    void upperCaseCsv(String word, String capitalizedWord){
        Assert.assertEquals(capitalizedWord,word.toUpperCase());
    }

    @ParameterizedTest(name = "{0} length is {1}")
    //name test based on index
    @CsvSource(value ={"abcd, 4","abc, 3","'',0","abcdef, 6"})
    void lengthCsv(String word, int expectedlength){
        Assert.assertEquals(expectedlength,word.length());
    }

    @Test
    public void toUpperCase(){
        String str = "abcd";
        String result = str.toUpperCase();

        Assert.assertEquals("ABCD", result);
//        Assert.assertNotNull(result);
//        Assert.assertNull(result);
    }

    @Test
    public void containsBasic(){
        String str = "abcdefgh";
        boolean result = str.contains("ijk");
        //expected false value
        Assert.assertEquals(false,result);

        //    public static void assertTrue(boolean condition) {
        //        assertTrue((String)null, condition);
        //    }
        //
        //    public static void assertFalse(String message, boolean condition) {
        //        assertTrue(message, !condition);
        //    }
        Assert.assertFalse(result);
        //refactor inline
        //additional variables are not necessary
        Assert.assertFalse(str.contains("ijk"));
    }

    @Test
    public void SplitBasic(){
        String str = "abc def ghi";
        String result[] = str.split(" ");
        String[] expectedArray = new String[] {"abc","def","ghi"};
        Assert.assertArrayEquals(expectedArray,result);
    }

    //running test multiply times

    @Test
    @RepeatedTest(10) // repeat test x times
    public void repeateTest(){
        Assert.assertFalse("abcd".contains("xyz"));
    }
    //Performance test - check methods within expected time period
    @Test
    @Disabled
    public void performanceTest(){
        Assertions.assertTimeout(Duration.ofSeconds(2),
                ()->{
            for (int i=0; i<=100;i++){
                int j=i;
                        System.out.println(j);
                    }
        });
    }

    // grouping tests

    @Nested
    class EmptyStringTest{

        @BeforeEach
        public void setToEmpty(){
            String str = "";
        }

        @Test
        public void lengthIsZero(){
            String str="";
            Assert.assertEquals(0,str.length());
        }
    }
}
