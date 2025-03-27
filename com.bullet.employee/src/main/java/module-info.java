module com.bullet.employee {
    exports com.bullet.employee;
    exports com.bullet.employee.strategy;

    requires com.bullet.person;
    requires com.bullet.validate;
    requires com.bullet.names;
    requires com.bullet.utils;
    requires com.bullet.address;
}