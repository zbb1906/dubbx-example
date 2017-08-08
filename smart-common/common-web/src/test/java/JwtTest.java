import com.alibaba.fastjson.JSONObject;
import com.ybveg.govx.common.web.jwt.JWT;
import com.ybveg.govx.common.web.jwt.JwtToken;
import com.ybveg.govx.common.web.jwt.Token;
import org.junit.Before;
import org.junit.Test;

/**
 * @auther zbb
 * @create 2017/8/8
 */

public class JwtTest {


  private JwtToken jwt;

  @Before
  public void init() {
    jwt = new JwtToken();
  }

  @Test
  public void test() throws Exception {
    Token token = new Token();
    token.setId("123");
    token.setDepId("456");
    token.setDataCode("789");
    System.out.println(JSONObject.toJSONString(token));

    String tk = jwt.createJWT(JWT.JWT_ID, token, JWT.JWT_TTL);
    System.out.println(tk);

  }

}
