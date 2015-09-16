package com.markinster.services.repositories;

import java.util.ArrayList;
import java.util.List;

import com.markinster.services.models.PhoneOperator;

public class Operators {
	private List<PhoneOperator> operators;

	public Operators() {
		operators = new ArrayList<PhoneOperator>();
		operators.add(new PhoneOperator("31", "Embratel", "Celular", 1.0));
		operators.add(new PhoneOperator("14", "Oi", "Celular", 1.5));
		operators.add(new PhoneOperator("15", "Vivo", "Celular", 1.25));
		operators.add(new PhoneOperator("41", "Tim", "Celular", 1.75));
	}

	public List<PhoneOperator> all() {
		return operators;
	}

	public PhoneOperator byId(String id) {
		PhoneOperator toReturn = null;

		for (PhoneOperator obj : operators) {
			if (obj.getId().equals(id)) {
				toReturn = obj;
				break;
			}
		}

		return toReturn;
	}
}
