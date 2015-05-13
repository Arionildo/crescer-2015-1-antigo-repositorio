package filmator;

import java.util.ArrayList;
import java.util.HashMap;

public class Netflox {
	private static HashMap<Genero,Integer> relatorio = new HashMap<>();
	private Genero genero;
	private ArrayList<Filme> acervo = new ArrayList<Filme>();
	
	public String reproduzirFilme(Filme filme) {
		String log = "";
		
		if (acervo.contains(filme)) {
			log = "Reproduzindo o filme "+ filme;
		} else {
			log = "O filme "+ filme +" n�o est� no nosso acervo ainda";
		}
		
		gerarRelatorio(filme);
		
		return log;
	}
	
	private void gerarRelatorio(Filme filme) {
		genero = filme.getGenero();
		int visto = relatorio.get(genero).intValue();
		int visualizado = visto >= 0 ? visto++ : 0;
		relatorio.put(genero, visualizado);
	}
	
	private HashMap<Genero,Integer> verRelatorio(){
		return relatorio;
	}
	
	public void setAcervo(Filme filme) {
		this.acervo.add(filme);
	}
}