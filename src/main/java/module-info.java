module com.cosminmanu.ebanking {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.cosminmanu.ebanking to javafx.fxml;
    exports com.cosminmanu.ebanking;
    exports com.cosminmanu.ebanking.controllers;
    exports com.cosminmanu.ebanking.controllers.admin;
    exports com.cosminmanu.ebanking.controllers.client;
    exports com.cosminmanu.ebanking.models;
    exports com.cosminmanu.ebanking.views;
}