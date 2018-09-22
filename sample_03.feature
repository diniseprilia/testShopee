@Sample03 @runthis
Feature: Gist
  Create These Scenarios for Shopee

    @CreateNewGits
    Scenario: Create New Public Gits
      Given User open Gist with this URL "https://gist.github.com/"
      And User Sign in to Gist
      And User Enter Username : "Enter your username here" to Gist
      And User Enter Password : "Enter your password here" to Gist
      And User Click Sign in Button to Gist
      Given User Create New Gist
      And User Enter Description : "Enter Description here"
      And User Enter Filename Including Extension : "Enter your Filename and Extension here"
      #And User Enter File Body: "QA Test for Shopee"
      #And User Click Create Public Gist Button to Gist
      And User See All Gits
      And User Open : "test.txt"
      And User Click Edit Button

    @SeeAllGits
    Scenario: See All Gits
      Given User open Gist with this URL "https://gist.github.com/"
      And User Sign in to Gist
      And User Enter Username : "Enter your username here" to Gist
      And User Enter Password : "Enter your password here" to Gist
      And User Click Sign in Button to Gist
      Given User Create New Gist
      And User See All Gits
      And User Open : "test.txt"
      And User Click Edit Button

    @EditGits
      Scenario: Edit Gits
        Given User open Gist with this URL "https://gist.github.com/"
        And User Sign in to Gist
        And User Enter Username : "Enter your username here" to Gist
        And User Enter Password : "Enter your password here" to Gist
        And User Click Sign in Button to Gist
        Given User Create New Gist
        And User Enter Description : "Gist QA Scenario"
        And User Enter Filename Including Extension : "Gist.txt"
        And User See All Gits
        And User Open : "test.txt"
        And User Click Edit Button

    @DeleteGits
    Scenario: Delete Gits
      Given User open Gist with this URL "https://gist.github.com/"
      And User Sign in to Gist
      And User Enter Username : "Enter your username here" to Gist
      And User Enter Password : "Enter your password here" to Gist
      And User Click Sign in Button to Gist
      Given User Create New Gist
      And User Enter Description : "Enter Description here"
      And User Enter Filename Including Extension : "Enter your Filename and Extension here"
      And User See All Gits
      And User Open : "Enter your Filename and Extension Here"
      And User Click Delete Button









