module com.jxtttt.java_design {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jxtttt.java_design to javafx.fxml;
    exports com.jxtttt.java_design;
}