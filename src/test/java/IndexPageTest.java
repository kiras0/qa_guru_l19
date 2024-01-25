import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class IndexPageTest extends TestBase {
    @Test
    public void testGithub() {

        assertThat(title()).contains("GitHub: Let’s build from here · GitHub");

    }
}
