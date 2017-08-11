package generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorApp {

  public static void generator() throws Exception {
    List<String> warnings = new ArrayList<String>();
    boolean overwrite = true;
    //todo 项目根路径不要有中文,我的有中文,所以使用绝对路径
    File configFile = new File(
        "F:\\job\\ideaWorkSpace\\smartGov\\smart-govx\\smart-common\\common-service\\src\\test\\java\\generator\\mybatis-ger.xml");
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(configFile);
    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    myBatisGenerator.generate(null);
  }

  public static void main(String[] args) {
    try {
      generator();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}