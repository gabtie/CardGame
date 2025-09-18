package main.java.game.ui.input;
import main.java.game.ui.input.event.InputEvent;

import java.util.List;
public interface InputProvider {
    List<InputEvent> pollEvents();
}