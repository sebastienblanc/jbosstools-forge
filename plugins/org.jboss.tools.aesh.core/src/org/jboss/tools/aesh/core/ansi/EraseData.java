package org.jboss.tools.aesh.core.ansi;


public class EraseData extends ControlSequence {

	public EraseData(String controlSequenceString) {
		super(controlSequenceString);
	}

	@Override
	public ControlSequenceType getType() {
		return ControlSequenceType.ERASE_DATA;
	}

}
