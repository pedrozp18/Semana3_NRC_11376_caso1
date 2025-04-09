package caso2;

public class Conversor
{
 double g;
 float k;
 int s;
public Conversor(double g) 
{
	this.g = g;
}
public Conversor(float k) 
{
	this.k = k;
}
public Conversor(int s) 
{
	this.s = s;
}
 public double Convertir(double g) 
 {
	 return g*9/5+32;
 }
 public double Convertir(float k) 
 {
	 return k/1.609;
 }
 public int Convertir(int s) 
 {
	 return s/60;
 }
}
