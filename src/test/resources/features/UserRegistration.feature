# Autor: Julieth Aya

@stories
Feature: User Registration
  New users entering the Utest.com website have the option to register their data to create a user account and thus be able to access the desired tools.
  @scenario
  Scenario:Login to the Utest.com website
    Given Enter the registration option
    When Enter the form data
      |strFirstName|strlastName|strEmail                      |strMonth |strDay|strYear|strCity|strPostalCode|strCountry|strInputOs|strInputVersion|strInputLanguage|strInputMobileDevice|strInputModel|strOperatingSystem|strPassword   |strConfirmPassword|
      |Julieth     |Aya        |july-at@hotmail.com           |May      |05    |1994   |Pereira|660001       |Colombia  |Windows     |11           |English         |Samsung             |Galaxy A54   |Android 13        |0729LuchiJaidy|0729LuchiJaidy    |
    Then The user is created to be able to access the tools