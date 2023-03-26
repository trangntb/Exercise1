package controller;

import java.util.List;

import model.Building;
import model.BuildingSearchInput;
import model.BuildingSearchOutput;
import service.BuildingSERVICEInterface;

public class BuildingController {
	
	public List<BuildingSearchOutput> selectBy(BuildingSearchInput buildingSearchInput) {
		List<BuildingSearchOutput> results = BuildingSERVICEInterface.getInstance().selectBy(buildingSearchInput);
		return results;
	}
}
