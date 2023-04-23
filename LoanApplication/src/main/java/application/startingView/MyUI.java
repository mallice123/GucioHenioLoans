package application.startingView;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MyUI extends VerticalLayout {

    public MyUI() {
        Label greetingLabel = new Label("Hello, World!");
        Button button = new Button("Click me!", event -> {
            greetingLabel.setText("Button clicked!");
        });

        add(greetingLabel, button);
    }
}