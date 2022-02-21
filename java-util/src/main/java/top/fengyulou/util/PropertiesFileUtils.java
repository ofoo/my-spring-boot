package top.fengyulou.util;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;

/**
 * @author guochao
 * @version 1.0
 * @date 2022/2/21 16:37
 */
public class PropertiesFileUtils {
    //获取属性文件
    public static Configuration getPropertiesFile(String fileName){
        Configurations configs = new Configurations();
        try {
            return configs.properties(new File(fileName+".properties"));
        } catch (ConfigurationException cex) {
            return null;
        }
    }
}
