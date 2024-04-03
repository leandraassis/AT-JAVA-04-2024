package assinaturaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import assinaturaApp.model.domain.RevistaFofoca;

public class RevistaFofocaService {
	private static Map<Integer, RevistaFofoca> revistasFofoca = new HashMap<Integer, RevistaFofoca>();

	private static Integer id = 0;

	public static void incluir(RevistaFofoca revistaFofoca) {
		revistaFofoca.setId(++id);
		revistasFofoca.put(revistaFofoca.getId(), revistaFofoca);
	}

	public static void excluir(Integer id) {
		revistasFofoca.remove(id);
	}

	public static Collection<RevistaFofoca> obterLista() {
		return revistasFofoca.values();
	}

	public static RevistaFofoca obterPorId(Integer id) {
		return revistasFofoca.get(id);
	}
}
