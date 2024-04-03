package assinaturaApp.controller;

import com.google.gson.Gson;

import assinaturaApp.model.domain.Endereco;
import assinaturaApp.model.service.EnderecoService;
import assinaturaApp.model.service.UsuarioService;
import spark.Request;
import spark.Response;
import spark.Route;

public class EnderecoController {
    public static Route obterEndereco = (Request req, Response res) -> {
        String cep = req.params("cep");

        try {
            Endereco endereco = EnderecoService.obterEnderecoPorCep(cep);
            return endereco;
        } catch (Exception e) {
            return "Erro ao obter dados de endereço para o CEP: " + cep;
        }
    };
    
    public static Route obterLista = (req, res) -> {
		return EnderecoService.obterLista();
	};

	public static Route incluir = (req, res) -> {

		Endereco endereco = new Gson().fromJson(req.body(), Endereco.class);

		EnderecoService.incluir(endereco);

		return "Usuario incluido com sucesso: " + endereco + "!";
	};

	public static Route excluir = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Endereco endereco = EnderecoService.obterPorId(index);
		EnderecoService.excluir(index);
		return "Exclusão realizada com sucesso: " + endereco;
	};
	
	public static Route obterPorId = (req, res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Endereco endereco = EnderecoService.obterPorId(index);
		return "Recuperação realizada com sucesso: " + endereco;
	};
}
