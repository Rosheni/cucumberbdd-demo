Feature: Product Checkout Feature

  Scenario Outline: Check the Product Cost
    Given the cost of "<product>" is <cost>
    When  I check  <quantity> of "<product>"
    Then  the total cost of "<product>" should be <total>

    Examples:
      |  product |  cost  |  quantity |  total  |
      |  mango   |   45   |   1       |  45     |
      |  mango   |   45   |   2       |  90     |
      |  orange  |   30   |   1       |  30     |
      |  orange  |   30   |   3       |  90     |
      |  berry   |   20   |   6       |  120    |