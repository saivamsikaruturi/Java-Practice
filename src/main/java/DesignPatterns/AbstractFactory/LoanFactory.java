package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.exception.ObjectCreationException;
import DesignPatterns.AbstractFactory.loan.*;

public class LoanFactory implements AbstractFactory<Loan, LoanType>{
    @Override
    public Loan create(LoanType type) {
        switch (type){
            case PERSONAL: return new PersonalLoan();
            case HOME: return new HomeLoan();
            case EDUCATIONAL: return new EducationalLoan();
            default: throw new ObjectCreationException(type.toString());
        }
    }
}