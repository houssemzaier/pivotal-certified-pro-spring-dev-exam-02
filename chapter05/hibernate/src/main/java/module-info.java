/**
 * @author Iuliana Cosmina
 * @since 1.0
 */
module com.apress.cems.hib {
    requires com.apress.cems.dao;
    requires com.apress.cems.repos;
    requires com.apress.cems.aop;

    requires org.hibernate.orm.core;

    requires org.apache.commons.lang3;
    requires java.sql;
    requires org.slf4j;
    requires java.naming;
    requires java.annotation;

    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.jdbc;
    requires spring.tx;
    requires spring.orm;
    requires kotlin.stdlib;
}