package control;
import java.util.Scanner;

public class GrupoDeTenis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vitorias = 0;
		System.out.println("Digite o resultado de seus jogos (V=venceu e P=perdeu):");
		
		for(int i = 0 ; i < 6 ;  i++) {
			if (sc.nextLine().toUpperCase().equals("V")){
				vitorias += 1;
			}
		}
		System.out.println(calculaGrupo(vitorias));
		sc.close();
		
	}
	public static int calculaGrupo(int vitorias) {
		
		switch ((vitorias+1)/2) {
		case(1):
			return 3;
		case(2):
			return 2;
		case(3):
			return 1;
		default:
			return -1;
		}		
	}
}


