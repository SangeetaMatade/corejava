package com.xworkz.db.scammer;

import java.sql.SQLException;

import com.xworkz.db.TrainDao;
import com.xworkz.db.DTO.TrainDto;

public class TrainScammer {

	public static void main(String[] args) throws SQLException {
	TrainDto train = new TrainDto(4, "132114", "manglore", "Dharwad", 12, 30, "shatabdi");
	
	
	TrainDao dao = new TrainDao();
	
	//dao.save(train);
//	dao.deleteByTrainNoAndTid("132114", 4);
	//dao.deleteByTrainNo("132114");
	//dao.updateDestinationByTrainNO("bijapur", "757488");
     // dao.getByTrainNo("757488");
      dao.getAll();
     // dao.deleteByTrainNoAndTrainId("132114", 4)
     // dao.updateDestinationByTrainNo("kodagu", "132114");
      dao.getMinPrice();
      dao.getMaxPrice();
      dao.updateDestinationAndBoardingByTrainNo("delhi", "mumbai", "132114");
      dao.getTotal();
	}

}
