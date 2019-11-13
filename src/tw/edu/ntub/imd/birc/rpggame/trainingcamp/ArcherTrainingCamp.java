package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Archer;
import tw.edu.ntub.imd.birc.rpggame.character.Career;

public class ArcherTrainingCamp implements TrainingCamp {
	@Override
	public Career train() {
		Archer archer = new Archer();
		archer.setHealthPoint(165);
		archer.setMagicPoint(79);
		archer.setAttack(65);
		archer.setMagicAttack(20);
		archer.setDefence(10);
		archer.setMagicDefence(10);
		return archer;
	}
}