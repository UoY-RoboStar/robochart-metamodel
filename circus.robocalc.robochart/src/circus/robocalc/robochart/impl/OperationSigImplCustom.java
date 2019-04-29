package circus.robocalc.robochart.impl;

import circus.robocalc.robochart.OperationSig;
import circus.robocalc.robochart.Parameter;

public class OperationSigImplCustom extends OperationSigImpl {
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		else if (o instanceof OperationSig) {
			if (!((OperationSig) o).getName().equals(this.getName())) {
				return false;
			}
			if (((OperationSig) o).getParameters().size() != this.getParameters().size()) {
				return false;
			}
			for (int i = 0; i < this.getParameters().size(); i++) {
				Parameter p1 = this.getParameters().get(i);
				Parameter p2 = ((OperationSig) o).getParameters().get(i);
				if (!p1.getName().equals(p2.getName())) {
					return false;
				}
				// also need to check type
			}
			// not sure if terminates should affect this
			return true;
		} else {
			return super.equals(o);
		}
		
	}
}
