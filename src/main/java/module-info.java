module com.example.lab9csc325 {
    requires javafx.controls;
    requires javafx.fxml;
    requires google.cloud.firestore;
    requires firebase.admin;
    requires com.google.auth.oauth2;
    requires java.logging;
    requires com.google.api.apicommon;
    requires com.google.auth;
    requires google.cloud.core;


    opens com.example.lab9csc325 to javafx.fxml;
    exports com.example.lab9csc325;
}