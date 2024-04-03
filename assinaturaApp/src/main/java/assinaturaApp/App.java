package assinaturaApp;

import assinaturaApp.App;
import assinaturaApp.controller.*;
import assinaturaApp.model.domain.*;
import assinaturaApp.model.service.*;
import spark.Spark;

public class App {
	public static void main(String[] args) {
		//populando listas com objetos padrao para que não estejam vazias ao iniciar o projeto
		//para adicionar mais, usar a rota incluir no postman
		UsuarioService.incluir(new Usuario());
		EnderecoService.incluir(new Endereco());
		AssinaturaService.incluir(new Assinatura());
		RevistaService.incluir(new Revista());
		RevistaCienciaService.incluir(new RevistaCiencia());
		RevistaFofocaService.incluir(new RevistaFofoca());
	
		Spark.port(8080);

		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/index.html");
		}); // chama a tela index

		// usuario
		Spark.get("/usuario/lista", UsuarioController.obterLista);
		Spark.post("/usuario/incluir", UsuarioController.incluir);
		Spark.delete("/usuario/:id/excluir", UsuarioController.excluir);
		Spark.get("/usuario/:id", UsuarioController.obterPorId);

		// assinatura
		Spark.get("/assinatura/lista", AssinaturaController.obterLista);
		Spark.post("/assinatura/incluir", AssinaturaController.incluir);
		Spark.delete("/assinatura/:id/excluir", AssinaturaController.excluir);
		Spark.get("/assinatura/:id", AssinaturaController.obterPorId);

		// revista
		Spark.get("/revista/lista", RevistaController.obterLista);
		Spark.post("/revista/incluir", RevistaController.incluir);
		Spark.delete("/revista/:id/excluir", RevistaController.excluir);
		Spark.get("/revista/:id", RevistaController.obterPorId);

		// revistaCiencia
		Spark.get("/revista/ciencia/lista", RevistaCienciaController.obterLista);
		Spark.post("/revista/ciencia/incluir", RevistaCienciaController.incluir);
		Spark.delete("/revista/ciencia/:id/excluir", RevistaCienciaController.excluir);
		Spark.get("/revista/ciencia/:id", RevistaCienciaController.obterPorId);

		// revistaFofoca
		Spark.get("/revista/fofoca/lista", RevistaFofocaController.obterLista);
		Spark.post("/revista/fofoca/incluir", RevistaFofocaController.incluir);
		Spark.delete("/revista/fofoca/:id/excluir", RevistaFofocaController.excluir);
		Spark.get("/revista/fofoca/:id", RevistaFofocaController.obterPorId);
		
		// endereco
		Spark.post("/endereco/incluir", EnderecoController.incluir);
		Spark.delete("/endereco/:id/excluir", EnderecoController.excluir);
		Spark.get("/endereco/lista", EnderecoController.obterLista);
		Spark.get("/endereco/:id/lista", EnderecoController.obterPorId); //obtém um endereco CADASTRADO, presente na lista
		Spark.get("/endereco/:cep", EnderecoController.obterEndereco); //obtém um endereço, não necessariamente está na lista
		

	}
}
