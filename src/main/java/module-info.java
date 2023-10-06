module com.cosminmanu.ebanking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cosminmanu.ebanking to javafx.fxml;
    exports com.cosminmanu.ebanking;
}