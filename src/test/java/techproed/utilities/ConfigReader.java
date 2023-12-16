package techproed.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
      /*
    .properties uzantili dosyadaki datalari test class imizda okuyabilmemiz icin return type i
    String olan bir method olustururuz ve bu method icinde Properties classimizda bir obje olustururuz
     Sonra FileInputStream ile dosyayi akisa alir Properties classindan olusturdugumuz objeye load()
     methodu ile yukleriz.
     */
      public static String getProperty(String key){
          Properties properties = new Properties();
          try {
              FileInputStream fis = new FileInputStream("configuration.properties");
              properties.load(fis);
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
          return properties.getProperty(key);
      }
}
