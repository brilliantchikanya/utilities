module com.bullet.streams {
    requires com.bullet.employee;
    requires com.bullet.person;
    requires com.bullet.names;
    requires com.bullet.utils;
    requires java.sql;


    exports com.bullet.streams;
    exports com.bullet.io;
    exports com.bullet.model;
}