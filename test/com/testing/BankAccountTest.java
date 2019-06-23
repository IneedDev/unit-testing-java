package com.testing;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount bankAccount;
    private static int count;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This method will run once before all tests in this class. Static method!!! Count "+count++);
    }

    //run this test before each test in this class
    @Before
    public void setup(){
        bankAccount = new BankAccount("Paul", "Smith", 1000,BankAccount.CHECKING);
        System.out.println("Setup test method...");
    }
    @Test
    public void deposit() {
        //BankAccount bankAccount = new BankAccount("Paul", "Smith", 1000,BankAccount.CHECKING);
        double balance =  bankAccount.deposit(200,true);

        //for double user third parameter within asserEquals to be sure exact value
        assertEquals(1200,balance,0);
    }

    @Test
    public void withdraw() {
        double balance =  bankAccount.withdraw(600,true);
        assertEquals(400,balance,0);

    }

    //this test throws exception we need decelerate that we expect it
    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        double balance =  bankAccount.withdraw(600,false);
        assertEquals(400,balance,0);

    }

    @Test
    public void getBalance() {
        //BankAccount bankAccount = new BankAccount("Paul", "Smith", 1000,BankAccount.CHECKING);
        bankAccount.deposit(200,true);
        //for double user third parameter within asserEquals to be sure exact value
        assertEquals(1200,bankAccount.getBalance(),0);
    }

    @Test
    public void getBalance_withdraw(){
        //BankAccount bankAccount = new BankAccount("Paul", "Smith", 1000,BankAccount.CHECKING);
        bankAccount.withdraw(200,true);
        assertEquals(800,bankAccount.getBalance(),0);

    }

    @Test
    public void isChecking_true(){
        //BankAccount bankAccount = new BankAccount("Paul", "Smith", 1000,BankAccount.CHECKING);
        //assertEquals(true,bankAccount.isChecking());

        //comparing true false better use assertTrue/False

        assertTrue(bankAccount.isChecking());

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This method will run once after all tests in this class. Static method!!!. Count "+count++);
    }

    @After
    public void teardown(){
        System.out.println("this test after each test in this class. Count "+count++);
    }

}