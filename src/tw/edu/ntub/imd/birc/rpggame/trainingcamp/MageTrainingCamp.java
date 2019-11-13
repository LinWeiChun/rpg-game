package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Career;
import tw.edu.ntub.imd.birc.rpggame.character.Mage;

public class MageTrainingCamp implements TrainingCamp {

	@Override
	public Career train() {
		Mage mage = new Mage();
		mage.setHealthPoint(124);
		mage.setMagicPoint(263);
		mage.setAttack(5);
		mage.setMagicAttack(20);
		mage.setDefence(10);
		mage.setMagicDefence(10);
		return mage;
	}
}
