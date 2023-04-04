import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {

    Cupcake chocolateCupcake;
    TieredCake strawberryCake;
    TraybakeCake coffeeTraybake;

    @BeforeEach
    public void setUp(){
        chocolateCupcake = new Cupcake("chocolate cupcake", "chocolate", "cream cheese");
        strawberryCake = new TieredCake("strawberry cake", "strawberry", 3, 5 );
        coffeeTraybake = new TraybakeCake("coffee Traybake", "coffee", 4);

    }

    @Test
    public void canAddMessage(){
        assertThat(chocolateCupcake.cakeMessage("happy birthday, john")).isEqualTo("Print across cupcakes: happy birthday, john");
        assertThat(strawberryCake.cakeMessage("It's a girl!")).isEqualTo("Print on largest tier: It's a girl!");
        assertThat(coffeeTraybake.cakeMessage("Congrats Jane")).isEqualTo("Print on traybake: Congrats Jane");
    }

    @Test
    public void canChangeFlavour(){
        chocolateCupcake.changeFlavour("vanilla");
        assertThat(chocolateCupcake.getBaseFlavour()).isEqualTo("vanilla");
        strawberryCake.changeFlavour("pumpkin spice");
        assertThat(strawberryCake.getBaseFlavour()).isEqualTo("pumpkin spice");
        coffeeTraybake.changeFlavour("red velvet");
        assertThat(coffeeTraybake.getBaseFlavour()).isEqualTo("red velvet");
    }

}
