package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class Controller {
    public RadioButton rb1;
    public RadioButton rb2;
    public RadioButton rb3;
    public Label label;

    final ToggleGroup group = new ToggleGroup();


    public void handleCLICK(ActionEvent actionEvent) {
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        rb1.setUserData("Maczuga");
        rb2.setUserData("Pomarańcz");
        rb3.setUserData("Rower");

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            public void changed(ObservableValue<? extends Toggle> ov,
                                Toggle old_toggle, Toggle new_toggle) {
                if (group.getSelectedToggle() != null) {
                    label.setText(group.getSelectedToggle().getUserData().toString());

                }
            }
        });
    }
}
