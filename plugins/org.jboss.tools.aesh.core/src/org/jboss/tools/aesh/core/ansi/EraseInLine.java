package org.jboss.tools.aesh.core.ansi;


public class EraseInLine extends ControlSequence {

	public EraseInLine(String controlSequenceString) {
		super(controlSequenceString);
	}

	@Override
	public ControlSequenceType getType() {
		return ControlSequenceType.ERASE_IN_LINE;
	}

}
