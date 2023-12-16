Feature: US02 BlueRentalCar Login Test
  Scenario: TC01 BlueRentalCar Sayfasinda Login olunur
    Given kullanici bluerentalcar sayfasina gider
    Then kullanici login butonuna tiklar
    And kulanici adi ve password girer
    And Sayfayi kapatir

   @gr1
    Scenario: TC02 BlueRentalCar Sayfasinda Login olunur
      Given kullanici bluerentalcar sayfasina gider
      Then kullanici login butonuna tiklar
      And kulanici farkli mail ve password girer
      And Sayfayi kapatir
