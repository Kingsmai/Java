package tut.d6classvar.demo01;

public class Main {

	public static void main(String[] args) {
		// ����һ��Ӣ�۶���
		Hero hero = new Hero();
		// ΪӢ������������������
		hero.setName("�ﳾ");
		hero.setAge(20);
		
		// ����һ����������
		Weapon weapon = new Weapon("��а��");
		// ΪӢ���䱸����
		hero.setWeapon(weapon);
		
		hero.attack();
		
		hero.setSkill(new SkillImplLotus()); // ʹ�õ��������ʵ����
		hero.useSkill();
		
		// �����Ըĳ�ʹ�������ڲ���
		Skill finger = new Skill() {
			
			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("��ɱ���������ָ��");
			}
		};
		hero.setSkill(finger);
		hero.useSkill();
		
		// ��һ���򻯣�ͬʱʹ�������ڲ������������
		hero.setSkill(new Skill() {
			
			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("��ɱ��������һ�ߣ�");
			}
		});
		hero.useSkill();
	}
}
