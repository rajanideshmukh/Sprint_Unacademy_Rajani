Feature:Unacademy Profile Settings

Scenario Outline: Verify User is able to edit the data in username field
    Given Chrome is opened and Unacademy app is opened
    Then User navigate onto Unacademy landing page   
    When User clicks on login button
    Then User Navigates onto login page
    When User enters mobile number
    And Clicks on login button
    And User enter the OTP
    And User click on verify OTP button
    Then User Navigates on home page
    When User clicks on profile icon
    And User click on Setting option
    Then User should see current profile information:
    When User clicks on edit Username button
    And User edit the data in Username field "<Username>" 
    Then It shows the updated Username
    
     Examples: 
                  
      | Username         | 
      | rajanideshmukh   | 
            

#Scenario Outline: Verify User is able to edit the data in email field  
#   Given Chrome is opened and Unacademy app is opened
    #Then User navigate onto Unacademy landing page   
#    When User clicks on login button
#    Then User Navigates onto login page
#    When User enters mobile number
#    And Clicks on login button
#    And User enter the OTP
#    And User click on verify OTP button
    #Then User Navigates on home page
#    When User clicks on profile icon
    #And User click on Setting option
    #Then User should see current profile information:
    #When User clicks on edit Email button
    #When User enters the invalid data in email field"<email>"
    #Then It shows Email is not valid
    #
     #Examples: 
                  #
#      | Email                                | 
      #| rajanideshmukh2915@gmail.com.innnn   | 
            #
      