package view;

import java.util.List;

import controller.BuildingController;
import model.Base;
import model.Building;
import model.BuildingSearchInput;
import model.BuildingSearchOutput;

public class BuildingView {

	//list Building
	public static void buildingList() {
		BuildingSearchInput buildingSearchInput = new BuildingSearchInput("norch",null,null,null,null,"tang-tret,nguyen-can");
		
		BuildingController buildingController = new BuildingController();
		List<BuildingSearchOutput> buildings = buildingController.selectBy(buildingSearchInput);
		
		//in buildings
		//System.out.println(buildings);
		for(BuildingSearchOutput item:buildings)
			System.out.println(item.toString());
	}
}
