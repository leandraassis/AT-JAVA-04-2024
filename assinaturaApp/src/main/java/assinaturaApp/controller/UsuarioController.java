package assinaturaApp.controller;

import com.google.gson.Gson;

import assinaturaApp.model.domain.Usuario;
import assinaturaApp.model.service.UsuarioService;
import spark.Route;

public class UsuarioController {
	
	public static Route obterLista = (req, res) -> {
		return UsuarioService.obterLista();
	};

	public static Route incluir = (req, res) -> {

		Usuario usuario = new Gson().fromJson(req.body(), Usuario.class);

		UsuarioService.incluir(usuario);

		return "Usuario incluido com sucesso: " + usuario + "!";
	};

	public static Route excluir = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Usuario usuario = UsuarioService.obterPorId(index);
		UsuarioService.excluir(index);
		return "Exclusão realizada com sucesso: " + usuario;
	};

	public static Route obterPorId = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Usuario usuario = UsuarioService.obterPorId(index);
		return "Recuperação realizada com sucesso: " + usuario;
	};
}
