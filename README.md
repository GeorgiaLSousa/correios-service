# CORREIOS SERVICE 🚚💨


Bem-vindo(a) ao Correio Service! Esta é uma API REST desenvolvida em Java com Spring Boot, criada para resolver um desafio comum: consultar um endereço a partir de um CEP e calcular o valor do frete para aquela localidade.

O sistema foi construído com foco em boas práticas, como os princípios SOLID, para garantir um código limpo, organizado e fácil de manter.

Principais Funcionalidades ✨
Consulta de Endereço em Tempo Real: Integração com a API pública ViaCEP (Similar) para buscar informações de endereço sempre atualizadas.

Cálculo de Frete Dinâmico: Uma lógica de negócio própria que define o valor do frete de forma diferente para cada região do Brasil (Norte, Nordeste, Centro-Oeste, Sudeste e Sul).

Histórico de Consultas: Cada busca bem-sucedida é registrada em um banco de dados em memória (H2), permitindo auditoria e análise.

Tratamento de Erros: A API lida de forma inteligente com CEPs inválidos ou inexistentes, retornando respostas claras sem quebrar a aplicação.


## Tecnologias Utilizadas 🛠️
* *Java 21* 

* *Spring Boot (Web, Data JPA)* 

* *Maven (Gerenciador de dependências)* 

* *Banco de Dados H2 (Em memória)* 

* *Lombok (Para reduzir código boilerplate)* 

  
## Arquitetura do Projeto 🏛️


O projeto foi estruturado de forma a separar as responsabilidades, facilitando a manutenção e a escalabilidade:

ConsultaController: A porta de entrada da API. Expõe o endpoint REST e lida com as requisições e respostas HTTP.

ConsultaCEPService: Desenvolve a lógica de negócio, chamando outros serviços para buscar o endereço e calcular o frete.

CepClient: Um cliente HTTP, cuja única função é se comunicar com a API externa ViaCEP.

CalcularFreteService: Contém a lógica de negócio para o cálculo do valor do frete com base no estado (UF).

ConsultaLog: A entidade JPA que mapeia a tabela de logs no banco de dados.

DTOs (ConsultaFreteResponse, EnderecoResponse): Objetos simples que definem a estrutura dos dados que trafegam na aplicação.

## Como Executar o Projeto 🚀
É bem simples colocar a API para rodar na sua máquina.

Clone o repositório:

git clone https://github.com/GeorgiaLSousa/correios-service.git

Navegue até a pasta do projeto:

cd correios-service

Execute com o Maven:
(Você precisa ter o Java e o Maven instalados)

mvn spring-boot:run

Pronto! A API estará no ar, esperando por requisições em http://localhost:8080.

## Como Usar a API 🎯
O uso é bem direto através do endpoint principal.

Endpoint: GET /consulta/{cep}

Exemplo de Sucesso:
Faça uma requisição GET para: http://localhost:8080/consulta/01001000

A resposta será:

{
    "cep": "01001-000",
    "rua": "Praça da Sé",
    "bairro": "Sé",
    "cidade": "São Paulo",
    "estado": "SP",
    "valorFrete": 7.85
}

Exemplo de Erro (CEP não encontrado):
Faça uma requisição GET para: http://localhost:8080/consulta/99999999

A resposta será um status 404 Not Found.

Acessando o Banco de Dados 💾
O console do banco de dados H2 fica disponível enquanto a aplicação está rodando, permitindo que você visualize os logs das consultas.

URL do Console: http://localhost:8080/h2-console

JDBC URL (na tela de login): jdbc:h2:mem:correios

Usuário: sa

Senha: (deixe em branco)

Após conectar, você pode executar SELECT * FROM CONSULTA_LOG; para ver os registros.

Repositório: correios-service

<img width="891" height="573" alt="image" src="https://github.com/user-attachments/assets/e27f92ce-5745-414b-a026-8e476ec1d520" />

