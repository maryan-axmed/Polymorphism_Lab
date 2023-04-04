import models.TieredCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    TieredCake strawberryCake;

    @BeforeEach
    public void setUp(){
        strawberryCake = new TieredCake("strawberry cake", "strawberry", 3, 5 );
    }

    @Test
    public void hasTiersAndHasCandles(){
        assertThat(strawberryCake.getTiers()).isEqualTo(3);
        assertThat(strawberryCake.getCandles()).isEqualTo(5);
    }
    @Test
    public void canAddCandles(){
        strawberryCake.addCandles(4);
        assertThat(strawberryCake.getCandles()).isEqualTo(9);
    }

    @Test
    public void canAddTiers(){
        strawberryCake.addTiers(2);
        assertThat(strawberryCake.getTiers()).isEqualTo(5);
    }

    @Test
    public void canRemoveTiers(){
        strawberryCake.removeTiers(1);
        assertThat(strawberryCake.getTiers()).isEqualTo(2);

    }

//    do not get expected results??
    @Test
    public void cannotRemoveTiersPastOne(){
        strawberryCake.removeTiers(3);
        assertThat(strawberryCake.getTiers()).isEqualTo("Cannot remove anymore tiers!");
    }


}
