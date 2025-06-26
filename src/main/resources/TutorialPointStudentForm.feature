Feature: TutorialPointStudentForm

  Scenario: Student form - genger radiobutton check
    Given Uzivatel je na stranke tutorial point student form
    When Uzivatel zada svoje meno "Honza"
    And Uzivate zada svoj email "email@email.com"
    And Uzivatel klikne na pohlavie male
    Then Radiobutton mail je zaskrtnuty
    When Uzivatel klikne na pohlavie female
    Then Radiobutton mail je odskrtnuty
