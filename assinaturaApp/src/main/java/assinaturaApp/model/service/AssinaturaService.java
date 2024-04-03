package assinaturaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import assinaturaApp.model.domain.Assinatura;

public class AssinaturaService {

	private static Map<Integer, Assinatura> assinaturas = new HashMap<Integer, Assinatura>();
	
	private static Integer id = 0;
	
	public static void incluir(Assinatura assinatura) {
		assinatura.setId(++id);
		assinaturas.put(assinatura.getId(), assinatura);
	}
	
	public static void excluir(Integer id) {
		assinaturas.remove(id);
	}
	
	public static Collection<Assinatura> obterLista() {
		return assinaturas.values();
	}
	
	public static Assinatura obterPorId(Integer id) {
		return assinaturas.get(id);
	}
	
}
