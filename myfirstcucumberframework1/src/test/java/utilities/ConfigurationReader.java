
package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    //Bu class'in amaci, configuration.properties dosyasindaki verileri(test data) okumaktir
    // create Properties instance
    private static Properties properties;
    //FileInoutStream kullanarak bir dosya aciyoruz
    //Properties'i bu dosyaya yukluyoruz
    //daha sonra properties dosyasini okuyacagiz

    //baslatmak icin static blok olusturduk
    static {
        String path ="configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (Exception e) {
            //    System.out.println("file path bulunamadi");
            e.printStackTrace();
        }
    }
    //okumak icin static bir method olusturulim
    //bu metod kullanici anahtar kelimeyi girdiginde(key), value return eder
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}

