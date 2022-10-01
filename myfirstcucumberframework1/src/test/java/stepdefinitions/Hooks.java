package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    //@Before TestNg'deki @BeforeMethod gibi calisir
    //Her scenario'dan once calisir
    //GLOBAL Hooks annotation
    @Before(order = 1)
    public void setUp() {
        System.out.println("Hooks Class- Setup Method");
    }

    //TAGGED Hooks Annotation
    //Her ozel(spesific)scenario"dan once calisir
    @Before(value = "@iphone", order = 2)
    public void searchIphone() {
        System.out.println("Hooks Class- Iphone Method");
    }

    //her scenario"dan sonra calisir
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Hook Class- After Method");

    }

}



