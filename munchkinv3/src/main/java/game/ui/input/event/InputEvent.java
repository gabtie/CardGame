package main.java.game.ui.input.event;

public abstract class InputEvent {
    public enum InputEventType {
        type1, type2, type3, ecc;
    }

    private InputEventType type;

    protected InputEvent(InputEventType type) {
        this.type = type;
    }


}
