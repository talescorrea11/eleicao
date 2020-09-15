import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Voto;
import exceptions.VotoInvalidoException;

class TesteVoto {

	@Test
	void naoDeveAceitarVotoMaiorQue15() {
		
		Voto voto = new Voto("Maria",30);
		try {
			voto.setVoto(30);
			fail("Não Deve Aceitar Voto Maior Que 15");
		} catch (VotoInvalidoException e) {
			if(e.getMessage().equals("asdasda")) {
				int x = 0; 
				String aaa = null;
				
			}
		}
	}

}
