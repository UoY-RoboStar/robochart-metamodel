package circus.robocalc.robochart.impl;

import circus.robocalc.robochart.OperationSig;
import circus.robocalc.robochart.Parameter;
import circus.robocalc.robochart.RCPackage;
import circus.robocalc.robochart.RangeExp;
import circus.robocalc.robochart.Trigger;
import circus.robocalc.robochart.Variable;

public class RoboChartFactoryImplCustom extends RoboChartFactoryImpl {

	@Override
	public Variable createVariable() {
		VariableImplCustom variable = new VariableImplCustom();
		return variable;
	}

	@Override
	public RCPackage createRCPackage() {
		RCPackageImplCustom o = new RCPackageImplCustom();
		return o;
	}

	@Override
	public OperationSig createOperationSig() {
		OperationSigImplCustom o = new OperationSigImplCustom();
		return o;
	}

	@Override
	public RangeExp createRangeExp() {
		RangeExpImplCustom o = new RangeExpImplCustom();
		return o;
	}

	@Override
	public Trigger createTrigger() {
		TriggerImplCustom o = new TriggerImplCustom();
		return o;
	}
	
	@Override
	public Parameter createParameter() {
		Parameter o = new ParameterImplCustom();
		return o;
	}
	
	

}
