module br.com.joaocarloslima {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens br.com.joaocarloslima to javafx.fxml;
    exports br.com.joaocarloslima;
}
