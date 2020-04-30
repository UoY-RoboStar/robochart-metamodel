package circus.robocalc.robochart.impl;

public class RangeExpImplCustom extends RangeExpImpl {
	@Override
	public String getLinterval() {
		if (linterval == null) return "(";
		else return linterval;
	}
}
