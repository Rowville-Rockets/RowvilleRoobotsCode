/*
ControllerButtons.java
Written by CoPokBl

This contains the IDs for each action.
If you want to change control method you can change each reference to
JoystickButtons to ControllerButtons and vice versa.

Add any new actions to this class with their respective binding.
*/

package com.disastrousdata;

import com.disastrousdata.controllers.Controller;
import com.disastrousdata.controllers.JoystickButtons;

public enum Keybinds {
    INTAKE_TOGGLE(JoystickButtons.TRIGGER),
    INTAKE_READY(JoystickButtons.SIDE_BUTTON),
    ROLLER_CLAW_UP(JoystickButtons.TOP_LEFT_5),
    ROLLER_CLAW_DOWN(JoystickButtons.BOTTOM_LEFT_3);

    public final int buttonId;

    Keybinds(Controller button) {
        this.buttonId = button.getButtonId();
    }
}
