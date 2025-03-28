package com.bullet.employee.strategy;

public interface PaymentTypeStrategy {
        /*
         *   We could have called it SalaryTypeStrategy, but then realized that
         *   there are others like contractors, who we might service, but do not
         *   get a salary, but rather a payment in general
         *
         * */
        double calculateBasicSalary();  //by basic salary we mean excluding overtime worked,
        // which will be calculated separately as a benefit.
        String getPaymentDetails();

}
