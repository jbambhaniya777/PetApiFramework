Feature: PetStore API
@post
  Scenario: Adding a new pet
    Given I have base URI
    When I post the API to add the pet
    Then I should get the status code 200

  @get
Scenario: getting the existing pet
  Given I have base URI
  When I post the API to get the pet
  Then I should get the status code 404

    @delete
  Scenario: Delete the existting pet
    Given I have base URI
    When I delete the pet
    Then I should get the status code 200

