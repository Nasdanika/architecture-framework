package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.common.Context;
import org.nasdanika.html.emf.NcoreActionBuilder;

public class ModelElementActionBuilder<T extends ModelElement> extends NcoreActionBuilder<T> {
	
	public ModelElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}