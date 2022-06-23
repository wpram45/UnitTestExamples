import org.junit.jupiter.api.*;

public class LifeCycleTest {

    LifeCycleTest() {
        System.out.println("Test Class Constructor");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before the test fixture");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After the test fixture");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test");
    }

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 2");
    }
}