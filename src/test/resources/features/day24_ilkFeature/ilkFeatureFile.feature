Feature: US001 Amazon Sayfasi Testi
  @hero1
  Scenario: TC01 Arama Kutusunda iphone aratilir
    Given kullanici amazon anasayfasinda
    Then kullanici iphone icin arama yapar
    And Sayfayi kapatir
    @hero
    Scenario: TC02 Arama Kutusunda samsung aratilir
      Given kullanici amazon anasayfasinda
      Then arama kutusunda samsung aratir
      And Sayfayi kapatir