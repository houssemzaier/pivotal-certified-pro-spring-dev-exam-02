/**
 * @author Iuliana Cosmina
 * @since 1.0
 */
module com.apress.cems.pojos {
    requires com.apress.cems.dao;
    requires org.apache.commons.lang3;
    requires java.sql;
    requires kotlin.stdlib;

    exports com.apress.cems.pojos.repos;
}