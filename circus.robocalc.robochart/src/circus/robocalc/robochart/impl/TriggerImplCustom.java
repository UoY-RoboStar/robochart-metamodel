package circus.robocalc.robochart.impl;

import circus.robocalc.robochart.TriggerType;

public class TriggerImplCustom extends TriggerImpl {
	@Override
	public TriggerType get_type() {
		if (parameter == null && value == null) {
			if (event == null) return TriggerType.EMPTY;
			else return TriggerType.SIMPLE;
		} else return _type;
	}
}
