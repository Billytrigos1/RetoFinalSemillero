Feature: Create User

  Scenario: Create user successfully.
    When I consume the endpoint  and the user sent data
    Then I cant validate server response

  Scenario: Edit user successfully.
    When I consume the endpoint  and the user sent edit data
    Then I cant validate server response whit statu

  Scenario: Delete user successfully.
    When I consume the endpoint  and Delete the user
    Then I cant validate the number Phone