Feature: Stock

Scenario: TC003 - Successfully setting product stock
  Given I am successfully login i go to stock page
    | Email                          | Password       |
    | qa.rakamin.jubelio@gmail.com   | Jubelio123!    |
  When I click Penyesuaian Persediaan button
  And I choose product and fill product quantity
  And I click Simpan button
  Then I successfully setting product stock