# language: pt

Funcionalidade: Realizar requisições apis

  @TestePost
  Cenario: Retorna status 200 e token QpwL5tke4Pnpja7X4
    Dado que eu possua uma uri
    Quando informo email
    E senha
    Entao deve ser retornado o status '200'
    E o token "QpwL5tke4Pnpja7X4"

  @TesteGet
  Cenario: Verifica se possui first_name Michael e Rachel
    Dado que eu possua uma uri get
    Quando informo a pagina 2
    Entao deve ser retornado o first_name "Michael" e "Rachel"
