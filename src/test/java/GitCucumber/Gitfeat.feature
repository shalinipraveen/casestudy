Feature: Calculator Feature
This file describes calculator functionality

Scenario: Addition of two numbers
		Given I enter 45 for calculation
		And I press add
		And I again enter 65 for calculation
		When I press1 equal
		Then The result should be 110
		