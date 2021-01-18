package application;

public class Program {

	public static void main(String[] args) {
		String [] vect = new String[] {"Maria","Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {//padrão
			System.out.println(vect[i]);
		}
		
		System.out.println("------------");//com a coleção
		
		for (String obj : vect) {//para cada obj dentro do vect
			System.out.println(obj);
		}
	}

}
