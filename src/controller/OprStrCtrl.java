package controller;
import com.destny.PilhaString.PilhaString;

public class OprStrCtrl {
	public OprStrCtrl() {
		// TODO Auto-generated constructor stub
	}
	
	public static void operacoes() {
		PilhaString pilha = new PilhaString();
		//montar a pilha apresentada
		pilha.Push("W"); pilha.Push("L"); pilha.Push("H"); pilha.Push("B"); pilha.Push("R"); pilha.Push("G"); pilha.Push("J");
		PilhaString pilhaAux = new PilhaString();
		//invertendo a pilha com a ajuda de uma auxiliar
		for(int i=0; i<7; i++) {
			try {
				pilhaAux.Push(pilha.Pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			try {
			System.out.println(pilhaAux.Pop());
			pilha.Push(pilhaAux.Pop());
			pilha.Pop();
			pilha.Push(pilhaAux.Pop());
			pilhaAux.Pop();
			System.out.println(pilhaAux.Pop());
			pilha.Push("M");
			pilha.Push(pilhaAux.Pop());
			pilhaAux.Pop();
			pilha.Push("K");
			}
			catch(Exception err) {
				System.err.println(err.getLocalizedMessage());
			}
	}
}
