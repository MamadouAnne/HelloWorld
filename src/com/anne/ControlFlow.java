package com.anne;

public class ControlFlow {
    public static void main(String[] args) {
      // Comparison operator
        int x = 1;
        int y = 1;
        System.out.println(x==y);
      // logical operator

        int temp = 22;
        boolean isWarm = temp >20 && temp <30;
        System.out.println(isWarm);

      // OR operator

      boolean hasHighIncome = false;
      boolean hasGoodCredit = true;
      boolean hasCriminalRecord = false;
      boolean isEligibleForLoan = (hasGoodCredit || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligibleForLoan);
    }
}
