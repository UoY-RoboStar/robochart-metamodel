package circus.robocalc.robochart.impl;

import circus.robocalc.robochart.CommunicationType;

public class CommunicationImplCustom extends CommunicationImpl {
	@Override
	public CommunicationType get_type() {
		if (parameter == null && value == null && event != null) {
			return CommunicationType.SIMPLE;
		} else return _type;
	}
}
