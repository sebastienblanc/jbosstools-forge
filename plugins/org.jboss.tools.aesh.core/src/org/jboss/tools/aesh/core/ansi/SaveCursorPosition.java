package org.jboss.tools.aesh.core.ansi;


public class SaveCursorPosition extends ControlSequence {

	public SaveCursorPosition(String controlSequenceString) {
		super(controlSequenceString);
	}

	@Override
	public ControlSequenceType getType() {
		return ControlSequenceType.SAVE_CURSOR_POSITION;
	}

}
