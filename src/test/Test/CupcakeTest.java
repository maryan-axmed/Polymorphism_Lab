import models.Cupcake;
import models.Topping;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {
    Cupcake chocolateCupcake;
    Topping toppingsForCupcake;


    @BeforeEach
    public void setUp(){
        chocolateCupcake = new Cupcake("chocolate cupcake", "chocolate", "cream cheese");
        toppingsForCupcake = new Topping();
        toppingsForCupcake.add("sprinkles");
        toppingsForCupcake.add("flakes");
    }

    // i really dont know about this test?? like why does it work?? idk what i expect
//    the answer to be either??
    @Test
    public void canAddToppings(){
        chocolateCupcake.addToppings(toppingsForCupcake);
        assertThat(chocolateCupcake.getToppings().size()).isEqualTo(1);
    }
}
