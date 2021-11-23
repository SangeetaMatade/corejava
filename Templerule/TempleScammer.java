package com.xworkz.Templerule;

import com.xworkz.Templerule.inter.DevoteeRule;
import com.xworkz.Templerule.inter.PublicDevoteeRule;
import com.xworkz.Templerule.inter.TempleAssociation;

public class TempleScammer {

	public static void main(String[] args) {

		DevoteeRule devoteerule = new PublicDevoteeRule();
		TempleAssociation templeassociation = new TempleAssociation(devoteerule, "iskon");
		templeassociation.allowDevotees();

	}

}
