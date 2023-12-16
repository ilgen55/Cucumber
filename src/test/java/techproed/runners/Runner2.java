package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
        "html:target/default-cucumber-reports2.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber2.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        features = "src/test/resources/features", //features package'ının yolu (content root)
        glue = "techproed/stepDefinitions", //stepDefinitions package ismi
        tags = "@hera1", //Hangi scenarioları bu tag'ı belirtirsek o scenariolar çalışır
        dryRun = false, //true seçersek scenariolari kontrol eder browser'ı çalıştırmaz
        monochrome = false//-->true kullanırsak konsoldaki çıktıları tek renk(siyah) olarak verir
)


public class Runner2 {
}
