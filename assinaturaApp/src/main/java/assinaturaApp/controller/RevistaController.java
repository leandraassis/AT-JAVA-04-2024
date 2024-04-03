package assinaturaApp.controller;

import com.google.gson.Gson;

import assinaturaApp.model.domain.Revista;
import assinaturaApp.model.service.RevistaService;
import spark.Route;

public class RevistaController {
	public static Route obterLista = (req, res) -> {
		return RevistaService.obterLista();
	};

	public static Route incluir = (req, res) -> {

		Revista revista = new Gson().fromJson(req.body(), Revista.class);

		RevistaService.incluir(revista);

		return "Revista incluida com sucesso: " + revista + "!";
	};

	public static Route excluir = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Revista revista = RevistaService.obterPorId(index);
		RevistaService.excluir(index);
		return "Exclusão realizada com sucesso: " + revista;
	};

	public static Route obterPorId = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Revista revista = RevistaService.obterPorId(index);
		return "Recuperação realizada com sucesso: " + revista;
	};
}
