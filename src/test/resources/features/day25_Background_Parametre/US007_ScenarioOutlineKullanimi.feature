
  Feature: US007 Google Testi
    @ksm
    Scenario Outline: TC01 Google Sayfasinda Arama Yapilir
      Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
      Then arama kutusunda scenarioOutline ile "<araclari>" aratir
      When kullanici "<araclari>" ile basarili bir kayit yapildigini dogrular
      And kullanici 2 saniye bekler
      And Sayfayi kapatir
      Examples:
        | araclari |
        | volco |
        | audi |
        | ford |