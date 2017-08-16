import com.ybveg.auth.AuthManager;
import com.ybveg.govx.PortalWebStartup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @auther zbb
 * @create 2017/8/14
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PortalWebStartup.class)
public class AuthManagerCase {

  @Autowired
  AuthManager manager;

  @Test
  public void scan() {
    manager.scan();
  }
}
