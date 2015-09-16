package com.markinster.services.repositories;

import java.util.ArrayList;
import java.util.List;

import com.markinster.services.models.Color;

public class Colors {
	
	private List<Color> colors;

	public Colors() {
		colors = new ArrayList<Color>();
		
		colors.add(new Color("blue", "Azul"));
		colors.add(new Color("red", "Vermelho"));
		colors.add(new Color("green", "Verde"));
		colors.add(new Color("yellow", "Amarelo"));
		colors.add(new Color("gray", "Cinza"));
		colors.add(new Color("black", "Preto"));
		colors.add(new Color("white", "Branco"));
	}
	
	public List<Color> all() {
		return colors;
	}
	
	public Color byId(String id) {
		Color toReturn = null;
		
		for (Color color : colors) {
			if (color.getId().equals(id)) {
				toReturn = color;
				break;
			}				
		}
		
		return toReturn;
	}

}
