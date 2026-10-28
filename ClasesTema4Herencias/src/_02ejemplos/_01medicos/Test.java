package _02ejemplos._01medicos;

public class Test {
	public static void main(String[] args) {
		Medico m = new Medico ("23487239M","Miguel López");
		
		System.out.println(m);
		
		MedicoCabecera mc = new MedicoCabecera("3413434h","Manuel Ruiz",true);
		System.out.println(mc);
		
		Especialista e = new Especialista("4384768T","Ramon","Cardiologia");
		System.out.println(e);

	}
}
