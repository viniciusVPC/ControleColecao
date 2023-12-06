# 📚📚CRUD de Coleção de Livros📚📚
## Sistema criado para auxiliar nas operações de Registro, Controle e Empréstimo de livros de uma coleção.
Este projeto está sendo desenvolvido como recreação para facilitar dois principais processos: Organizar minha coleção de Livros, Mangás e HQs e Emprestar e Cobrar os livros da coleção para outras pessoas.
O sistema será desenvolvido em **Linguagem Java** e contará com acesso à banco de dados à partir do **Sistema MySQL**. As informações serão apresentadas ao usuário através de **JFrames**.  
## Pacotes e Classes:
O projeto se divide em três Pacotes. DTO, DAO e VIEW, cada um com suas classes:
###Pacote DTO
- LivroDTO:
  - Atributos: Título, Autor, Data de Aquisição.
- MangaDTO (Herda Livro):
  - Atributos: Volume.
- HQDTO (Herda Livro):
  - Atributos: Série, Volume.
- PessoaDTO:
  - Atributos: Nome, Telefone para Contato, Cor Favorita.
- EmpréstimoDTO:
  - Atributos: Pessoa, Livro.
- ControleColecaoLivrosDTO:
  - Métodos: AddLivro (adiciona livros à coleção), GetLivro (Retorna um ou mais livros de acordo com diversos filtros. Titulo/Autor/Data de aquisição), RemoveLivro (remove um livro da coleção).

  
## O sistema ainda está no início de desenvolvimento, porém contará com as seguintes funcionalidades **(atualizadas conforme o progresso do projeto)**:

### Livros:
- [ ] _Adicionar_ Livros à coleção.
- [ ] _Listar_ os Livros da coleção seguindo diversos _Filtros de Pesquisa_.
- [ ] _Editar_ informações de Livros adicionados.
- [ ] _Remover_ Livros da coleção.

### Pessoas:
- [ ] _Adicionar_ Pessoas ao registro.
- [ ] _Listar_ Pessoas seguindo diversos _Filtros de Pesquisa_.
- [ ] _Editar_ informações das Pessoas registradas.
- [ ] _Remover_ Pessoas do registro.

### Empréstimos:
- [ ] _Criar_ registros de empréstimos, _relacionando Pessoa com Livros alugados_.
- [ ] _Listar_ Pessoas seguindo diversos _Filtros de Pesquisa_.
- [ ] _Alterar_ informações dos Empréstimos, assim como seu _Status_.
- [ ] _Remover_ Empréstimos quando atingido seu período de empréstimo.

## Sistema:
- [ ] _Tratamento de Excessões_ completas e Validação de _Regras de Negócio_.
- [ ] _Criação do Banco de Dados_ na máquina.
- [ ] _Integração_ completa com _MySQL_.
- [ ] Criação de uma _Interface Visual_ intuitiva e atraente para facilitar a experiência do usuário.

## Funcionalidades extra:
- [ ] _API_  para facilitar _acesso ao sistema de dispositivos móveis_.
- [ ] Sistema de _automação de mensagens_ para cobrança dos empréstimos em certos períodos (semana/dias restantes).
- [ ] Criação de um _Executável_ para que o Sistema possa ser utilizado por qualquer um que baixá-lo.
