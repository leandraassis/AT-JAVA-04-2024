package assinaturaApp.controller;

import com.google.gson.Gson;

import assinaturaApp.model.domain.Assinatura;
import assinaturaApp.model.service.AssinaturaService;
import spark.Route;

public class AssinaturaController {
	
public static Route obterLista = (req, res) -> {
		return AssinaturaService.obterLista();
	};
	
public static Route incluir = (req, res) -> {
		
	Assinatura assinatura = new Gson().fromJson(req.body(), Assinatura.class);

		
		AssinaturaService.incluir(assinatura);
		
		return "Assinatura incluida com sucesso: " + assinatura + "!";
	};
	
public static Route excluir = (req, res) -> {
	Integer index = Integer.valueOf(req.params("id"));
	Assinatura assinatura = AssinaturaService.obterPorId(index);
	AssinaturaService.excluir(index);
		return "Exclusão realizada com sucesso: " + assinatura;
	};
	
public static Route obterPorId = (req, res) -> {
	Integer index = Integer.valueOf(req.params("id"));
	Assinatura assinatura = AssinaturaService.obterPorId(index);
	return "Recuperação realizada com sucesso: " + assinatura;
	};
}
