import models.TraybakeCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeCakeTest {

    TraybakeCake coffeeTraybake;

    @BeforeEach
    public void setUp(){
        coffeeTraybake = new TraybakeCake("coffee Traybake", "coffee", 16);
    }

    @Test
    public void hasSlices(){
        assertThat(coffeeTraybake.getSlices()).isEqualTo(4);
    }

//    not working as expected
    @Test
    public void canAddSlices(){
        coffeeTraybake.addSlices(4);
        assertThat(coffeeTraybake.getSlices()).isEqualTo(20);
    }
// not working as expected
    @Test
    public void canRemoveSlices(){
        coffeeTraybake.removeSlices(4);
        assertThat(coffeeTraybake.getSlices()).isEqualTo(12);
    }
}
