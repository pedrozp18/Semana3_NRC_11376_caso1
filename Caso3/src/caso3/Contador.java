package caso3;

public class Contador 
{
 private String nom;
 private static int cont=0;
public Contador(String nom) 
{
	this.nom = nom;
	cont++;
}
public int Cantidad() {
	return cont;
}

}
