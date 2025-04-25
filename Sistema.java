import java.util.Scanner;
public class Sistema{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		Ponto pontoMaiorA, pontoMaiorB;
		double maiorDistance;

		double X = scanner.nextDouble();
		double Y = scanner.nextDouble(); 
		Ponto A = new Ponto(Xa,Ya);

		X = scanner.nextDouble();
		Y = scanner.nextDouble(); 
		Ponto B = new Ponto(Xb, Yb);

		maiorDistance = A.Distancia(B);
		
		while (A.x != 9999){

			X = scanner.nextDouble();
			Y = scanner.nextDouble();
			Ponto B = new Ponto(X, Y);

			if(A.Distancia(B) > maiorDistance){
				pontoMaiorA = A;
				pontoMaiorB = B;
			}


		}

}
