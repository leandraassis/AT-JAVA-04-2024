package assinaturaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import assinaturaApp.model.domain.Revista;

public class RevistaService {
	private static Map<Integer, Revista> revistas = new HashMap<Integer, Revista>();

	private static Integer id = 0;

	public static void incluir(Revista revista) {
		revista.setId(++id);
		revistas.put(revista.getId(), revista);
	}

	public static void excluir(Integer id) {
		revistas.remove(id);
	}

	public static Collection<Revista> obterLista() {
		return revistas.values();
	}

	public static Revista obterPorId(Integer id) {
		return revistas.get(id);
	}
}
