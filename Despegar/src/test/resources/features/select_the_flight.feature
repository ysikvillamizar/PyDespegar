#Author: your.email@your.domain.com

@tag
Feature: Flight reserve
As a web user
She wants to reserve a flight
To do test using the programming Cucumber and Gherkin.

  @tag1
  Scenario: Successful search for a flight from the main Despegar website
    Given that Jessica wants to look for a one way flight 
    When She insert the data of the flight
    |originCity|destinationCity|departure date|return date|
    |Medellin  |		Bogota  	 |			10      |			15    |
    And She fill in her information
    Then She should see comprar on screen
    
    
   @tag2
   Scenario Outline: Error message when Jessica try validate flight to the Despegar website with blank destination
    Given that Jessica wants to look for a one way flight
    When she insert <originCity> and <date> of the flight
    Then validate the title Ingresa un destino on website
    Examples:
      | originCity  |   date  |
      | Medellin    |    10   | 
   
    
    ##senario outline
    ##verificar precio del vuelo
    
 ##  @tag2
  #Scenario Outline: Esta es una prueba de scenario outline "<destino>" y "<origen>" otro texto "<nombre>"
  #Examples:
  #|originCity|destinationCity|departure date|return date|
   # |Medellin  |		Bogota  	 |			10      |			15    |
  
 #   Given that Jessica wants to look for a one way flight 
  #  When She insert the data of the flight
    
   # And She fill in her information
    #Then She should see comprar on screen
    


