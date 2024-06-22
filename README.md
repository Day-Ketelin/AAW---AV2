# AAW---AV2

#

**Github:** **[@Day-Ketelin](https://github.com/Day-Ketelin)**

**Email:** **dayaneketelin@hotmail.com**

**Linkked-in:** **[Dayane Ketelin](https://www.linkedin.com/in/dayane-ketelin)**


#

# Sistema de Autenticação e Autorização

Projeto acadêmico criado para avaliação junto à disciplina de Arquitetura de Aplicações Web - professor João Paulo Aramuni,do Centro Universitário Newton Paiva, produzido em Java e com a compilação pela plataforma IntelliJ IDEA.

A aplicação criada é um sistema de autenticação, onde os usuários podem acessar o site e realizar seu login, mas somente os usuários com os roles específicos possuem permissão para acesso à determinados métodos.

Assim, é possível implementar um sistema de autenticação e autorização de usuário utilizando Java, MongoDB e JWT (JSON Web Token).

***Link do Projeto:*** **<https://github.com/Day-Ketelin/AAW---AV2>**
#


# Diagrama Lógico

Diagrama com os pacotes, endpoints, dependências e organização dos arquivos utilizados na construção do projeto, de modo a prover maior segurança e praticidade dos métodos utilizados:

![](https://github.com/Day-Ketelin/AAW---AV2/blob/cd70f9f98297a42ecdf9579a70d04ae50661553a/Imagens/Diagrama%20-%20Figma.png)

**URL Figma:** *[Diagrama da Aplicação](https://www.figma.com/board/bI5zRlVWnypTae4HvHkitR/Architecture-Diagram-Example---Multiplayer-(Community)?node-id=0-1&t=lguz5nAd9rqA8KxG-0)*

##


##  Implementação de Autenticação com JWT

|Requisitos|    Descrição         |
|---------:|--------------------- |
|     1    | Cadastro de Usuário  |
|     2    | Login Seguro         |
|     3    | Geração de Token JWT |

**Cadastro de Usuário**
Os usuários podem se cadastrar na plataforma fornecendo informações como nome de usuário, senha e tipo de conta, com os roles: USER, ADMIN ou GESTOR. 

*-*

**Login Seguro**
O sistema de login é seguro e os usuários podem entrar na plataforma fornecendo suas credenciais (nome de usuário e senha). As credenciais são então verificadas em relação às informações armazenadas no banco de dados para permitir ou não o acesso.

*-*

**Geração de Token JWT**
Após um login bem-sucedido, é gerado um token JWT (JSON Web Token) para o usuário autenticado. Este token contém informações sobre o usuário, como seu ID e tipo de conta.


 
## Implementação de Autorização com JWT

|Requisitos|    Descrição          |
|---------:|-----------------------|
|     1    | Níveis de Acesso      |
|     2    | Restrição de Acess    |
|     3    |Validação do Token JWT |


**Níveis de Acesso**

Há três variáveis de acesso para os usuários: usuário comum (USER), administrador (ADMIN) e gestor (GESTOR), de modo que cada tipo de conta possui permissões diferentes dentro da plataforma.

*-*

**Restrição de Acesso**
Com base no tipo de conta e nas permissões associadas, o acesso a certas partes da plataforma é restringido. Por exemplo, apenas administradores
possuem permissão para criar ou excluir conteúdo, enquanto usuários comuns só podem visualizar.

*-*

**Validação do Token JWT**
Antes de permitir o acesso a um recurso protegido, é validado o token JWT enviado pelo cliente para garantir sua autenticidade e verificar se o usuário tem permissão para acessar o recurso solicitado ou não.

#



#

# Funcionamento da aplicação e verificação das requisições:
![](https://github.com/Day-Ketelin/AAW---AV2/blob/main/Imagens/Trabalho%20AV2%20-%20Prova.gif)


### Linguagem utilizada: JAVA

---
>**Bibliotecas Necessárias**
---
>spring-boot-starter-web: Para criar uma aplicação web usando Spring Boot.
>
>spring-boot-starter-data-mongodb: Para integração com o MongoDB.
>
>Para inplementação das configurações de segurança.
>
>jjwt: Para geração e validação de JWTs.

---

## Prints do Projeto

![](https://github.com/Day-Ketelin/Prova-AV2---40/blob/main/Imagens/JwtUtil.png)

###

![](https://github.com/Day-Ketelin/AAW---AV2/blob/main/Imagens/Autentica%C3%A7%C3%A3o.png)
#



#

⚠️🛠️🛠️🛠️⭐⭐⭐🛠️🛠️🛠️⚠️


