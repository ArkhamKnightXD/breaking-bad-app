package arkham.knight.bad;

import arkham.knight.bad.models.Cast;
import arkham.knight.bad.services.CastService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BadApplicationTests {

    @Autowired
    CastService castService;

    Cast cast = new Cast();

    @Test
    void testFindCastByName() {

        cast.setName("Walter White");

        assertEquals(cast.getName(), castService.findCastByName("Walter White").getName());
    }

}
