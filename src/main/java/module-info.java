module cz.klecansky.indexsequancefile {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens cz.klecansky.indexsequancefile to javafx.fxml;
    exports cz.klecansky.indexsequancefile;
}