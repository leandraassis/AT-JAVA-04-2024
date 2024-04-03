package assinaturaApp.controller;

import com.google.gson.Gson;
import assinaturaApp.model.domain.RevistaCiencia;
import assinaturaApp.model.service.RevistaCienciaService;
import spark.Route;

public class RevistaCienciaController {
	public static Route obterLista = (req, res) -> {
		return RevistaCienciaService.obterLista();
	};

	public static Route incluir = (req, res) -> {

		RevistaCiencia revistaCiencia = new Gson().fromJson(req.body(), RevistaCiencia.class);

		RevistaCienciaService.incluir(revistaCiencia);

		return "Revista ciência incluida com sucesso: " + revistaCiencia + "!";
	};

	public static Route excluir = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		RevistaCiencia revistaCiencia = RevistaCienciaService.obterPorId(index);
		RevistaCienciaService.excluir(index);
		return "Exclusão realizada com sucesso: " + revistaCiencia;
	};

	public static Route obterPorId = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		RevistaCiencia revistaCiencia = RevistaCienciaService.obterPorId(index);
		return "Recuperação realizada com sucesso: " + revistaCiencia;
	};
}
