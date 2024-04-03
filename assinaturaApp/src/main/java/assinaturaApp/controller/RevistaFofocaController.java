package assinaturaApp.controller;

import com.google.gson.Gson;

import assinaturaApp.model.domain.RevistaCiencia;
import assinaturaApp.model.domain.RevistaFofoca;
import assinaturaApp.model.service.RevistaFofocaService;
import spark.Route;

public class RevistaFofocaController {
	public static Route obterLista = (req, res) -> {
		return RevistaFofocaService.obterLista();
	};

	public static Route incluir = (req, res) -> {

		RevistaFofoca revistaFofoca = new Gson().fromJson(req.body(), RevistaFofoca.class);

		RevistaFofocaService.incluir(revistaFofoca);

		return "Revista fofoca incluida com sucesso: " + revistaFofoca + "!";
	};

	public static Route excluir = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		RevistaFofoca revistaFofoca = RevistaFofocaService.obterPorId(index);
		RevistaFofocaService.excluir(index);
		return "Exclusão realizada com sucesso: " + revistaFofoca;
	};

	public static Route obterPorId = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		RevistaFofoca revistaFofoca = RevistaFofocaService.obterPorId(index);
		return "Recuperação realizada com sucesso: " + revistaFofoca;
	};
}
