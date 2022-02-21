package top.fengyulou;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import top.fengyulou.util.PropertiesFileUtils;

import java.io.File;

/**
 * @author guochao
 * @version 1.0
 * @date 2022/2/21 12:40
 */
public class ConfigurationTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        Configuration config = PropertiesFileUtils.getPropertiesFile("config");
        String dbHost = config.getString("database.host");
        int dbPort = config.getInt("database.port");
        String dbUser = config.getString("database.user");
        String dbPassword = config.getString("database.password", "secret");  // provide a default
        long dbTimeout = config.getLong("database.timeout");
        System.out.println(dbHost+" " +dbPort + " "+dbUser+" "+dbPassword+" "+ dbTimeout);
    }

    public void demo(){
        Configurations configs = new Configurations();
        try {
            Configuration config = configs.properties(new File("config.properties"));
            // access configuration properties
            String dbHost = config.getString("database.host");
            int dbPort = config.getInt("database.port");
            String dbUser = config.getString("database.user");
            String dbPassword = config.getString("database.password", "secret");  // provide a default
            long dbTimeout = config.getLong("database.timeout");
            System.out.println(dbHost+" " +dbPort + " "+dbUser+" "+dbPassword+" "+ dbTimeout);
        } catch (ConfigurationException cex) {
            // Something went wrong
        }
    }
}
