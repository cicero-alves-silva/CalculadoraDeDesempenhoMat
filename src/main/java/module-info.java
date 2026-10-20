module com.example.calculadoradedesempenhomat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoradedesempenhomat to javafx.fxml;
    exports com.example.calculadoradedesempenhomat;
}