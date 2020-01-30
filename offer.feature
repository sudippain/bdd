Feature: Evalute Percentage

  Scenario: verify 10% offer
    Given Execute DiscountService Bussiness
    When If i will enter 5001
    Then we should get ten percentage discount

  Scenario: verify 15% offer
    Given Execute DiscountService Bussiness
    When If i will enter 10000
    Then we should get fifteen percentage discount

  Scenario: verify NO offer
    Given Execute DiscountService Bussiness
    When If i will enter 4000
    Then we should get NA percentage discount
