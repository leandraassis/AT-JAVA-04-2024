package assinaturaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import assinaturaApp.model.domain.RevistaCiencia;

public class RevistaCienciaService {
	private static Map<Integer, RevistaCiencia> revistasCiencia = new HashMap<Integer, RevistaCiencia>();

	private static Integer id = 0;

	public static void incluir(RevistaCiencia revistaCiencia) {
		revistaCiencia.setId(++id);
		revistasCiencia.put(revistaCiencia.getId(), revistaCiencia);
	}

	public static void excluir(Integer id) {
		revistasCiencia.remove(id);
	}

	public static Collection<RevistaCiencia> obterLista() {
		return revistasCiencia.values();
	}

	public static RevistaCiencia obterPorId(Integer id) {
		return revistasCiencia.get(id);
	}
}
