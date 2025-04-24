import java.lang.Math;
public class Ponto{
	double x;
	double y;

	// Constructor Ponto
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double Distancia(Ponto p2){
		distancia = Math.sqrt( Math.pow((x - p2.x),2) + Math.pow((y - p2.y),2) )

		return distancia
}