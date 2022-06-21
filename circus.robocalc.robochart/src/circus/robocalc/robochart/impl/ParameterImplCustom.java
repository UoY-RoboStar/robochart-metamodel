package circus.robocalc.robochart.impl;

import circus.robocalc.robochart.Variable;
import circus.robocalc.robochart.VariableList;
import circus.robocalc.robochart.VariableModifier;

public class ParameterImplCustom extends ParameterImpl {
	
	@Override
	public VariableModifier getModifier() {
		if (this.eContainer instanceof VariableList)
			return ((VariableList)this.eContainer).getModifier();
		else return VariableModifier.VAR;
	}
}
