package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.bank.Bank;
import DesignPatterns.AbstractFactory.bank.BankType;
import DesignPatterns.AbstractFactory.loan.Loan;
import DesignPatterns.AbstractFactory.loan.LoanType;

public class Driver {
    public static void main(String[] args) {
        AbstractFactory<Bank, BankType> bankTypeAbstractFactory = AbstractFactoryProvider.getFactory(ObjectType.BANK);
        Bank bank = bankTypeAbstractFactory.create(BankType.HDFC);
        System.out.println(bank.getBankName());

        AbstractFactory<Loan, LoanType> loanTypeAbstractFactory = AbstractFactoryProvider.getFactory(ObjectType.LOAN);
        Loan loan = loanTypeAbstractFactory.create(LoanType.PERSONAL);
        System.out.println(loan.getInterestRate());

    }
}