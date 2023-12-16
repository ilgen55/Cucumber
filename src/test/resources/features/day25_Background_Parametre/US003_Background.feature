
Feature: US003 Amazon Sayfasi Testi
  #Feature file daki scenario'larımızda ortak adımlarımız var ise bunun için Feature: anahtar kelimesinden sonra
#Background: anahtar kelimesini kullanabiliriz. Background @Before notasyonuna sahip bir method gibi
#scenario'lardan önce çalışır.

  Background: Ana Sayfaya Gider
    Given kullanici amazon anasayfasinda
    @iphone @samsung
    Scenario: TC01  arama kutusunda iphone aratilir
      * kullanici iphone icin arama yapar
     @samsung
      Scenario: TC02 arama kutusunda samsung aratilir
        * arama kutusunda samsung aratir
        * Sayfayi kapatir

        #Given,Then,When,And gibi anahtar kelimeleri ile stepDefinition class'ında oluşturduğumuz methodu
#tekrar farklı bir scenario da kullanmak istediğimizde bu anahtar kelimeler yerine *(yıldız) sembolu kullanabiliriz


