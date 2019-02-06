# Git - Comandos Básicos

Está é uma lista de comandos git bastante utilizados

Para mais informações sobre git:
- [Vídeo de introdução à tecnologia](teste.com)
- [Documentação oficial](teste.com)

### 1. Configuração do GIT 

1.1. Verificar a versão instalada 

    git --version

1.2. Configurar o seu nome de usuário globalmente ([git doc](https://git-scm.com/docs/git-config))

    git config --global user.name [username]

1.3. Configurar o seu email globalmente ([git doc](https://git-scm.com/docs/git-config))

    git config --global user.email [user email]

1.4. Listar variáveis do arquivo de configuração ([git doc](https://git-scm.com/docs/git-config))

    git config --list

### 2. Clonando e criando novos projetos

2.1. Iniciando um repositório git ([git doc](https://git-scm.com/docs/git-init))

    git init

2.2. Criando uma cópia local de um repositório remoto já existente ([git doc](https://git-scm.com/docs/git-clone))

    git clone [url do repositório]

### 3. Ações Rápidas

3.1. Obter informações gerais sobre status do projeto ([git doc](https://git-scm.com/docs/git-status))

    git status

3.2. Adiciona um arquivos à *staging area* ([git doc](https://git-scm.com/docs/git-add))

    git add [path do arquivo ou pasta]

3.3. Adiciona todos os arquivos modificados à *staging area* ([git doc](https://git-scm.com/docs/git-add))

    git add .
    
3.4. Faz o *commit* de todas as alterações na *staging area* ([git doc](https://git-scm.com/docs/git-commit))

    git commit -m [mensagem]

3.5. Visualizar lista de *commits* realizados até o momento ([git doc](https://git-scm.com/docs/git-log))

    git log https://git-scm.com/docs/git-log

3.6. Visualizar alterações feitas no arquivo antes de fazer o *commit* ([git doc](https://git-scm.com/docs/git-diff))

    git diff [path do arquivo]

### 4. *Branches* e *Merges*

4.1. Lista as *Branches* do projeto ([git doc](https://git-scm.com/docs/git-branch))

    git branch

4.2. Lista todos as *branches* do projeto (locais e remotas) ([git doc](https://git-scm.com/docs/git-branch))

    git branch -a

4.3. Cria uma nova *branch* ([git doc](https://git-scm.com/docs/git-branch))

    git branch [nome da branch]

4.4. Deleta uma *branch* ([git doc](https://git-scm.com/docs/git-branch))

    git branch -d [nome da branch]
    git branch -D [nome da branch]

4.5. Cria uma nova branch e faz dela a *branch* atual ([git doc](https://git-scm.com/docs/git-checkout))

    git checkout -b [nome da branch]

4.6. Altera a branch em que se está trabalhando ([git doc](https://git-scm.com/docs/git-checkout))

    git checkout [branch name]

4.7. Descarta as alterações feitas em um arquivo ([git doc](https://git-scm.com/docs/git-checkout))

    git checkout -- [path do arquivo]

4.8. Faz o *Merge* de uma *branch* na branch atual ([git doc](https://git-scm.com/docs/git-merge))

    git merge [nome da branch]

4.9. Faz o *merge* de uma *branch* em uma outra *branch* ([git doc](https://git-scm.com/docs/git-merge))

    gir merge [nome da branch] [nome da outra branch]
    
### 5. Trabalhando com repositórios remotos

5.1. Faz o *push* da *branch* atual em uma branch no repositório remoto ([git doc](https://git-scm.com/docs/git-push))

    git push origin [nome da branch remota]

5.2. *Push* da *branch* atual em uma branch no repositório remoto, estabelecendo *tracking conection* entre elas ([git doc](https://git-scm.com/docs/git-push))

    git push -u origin [nome da branch remota]

5.3. Faz o *push* da *branch* atual na sua respectiva branch no repositório remoto ([git doc](https://git-scm.com/docs/git-push))

    git push

5.4. Deleta uma *branch* remota ([git doc](https://git-scm.com/docs/git-push))

    git push origin --delete [nome da branch remota] 

5.5. Atualiza o repositório local de acordo com o repositótio remoto ([git doc](https://git-scm.com/docs/git-pull))

    git pull

5.6. Atualiza uma *branch* específica de acordo com o repositório remoto ([git doc](https://git-scm.com/docs/git-pull))

    git pull origin [nome da branch]






