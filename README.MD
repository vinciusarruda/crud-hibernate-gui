Projeto Agenda - Hibernate & MySQL

📌 Descrição

Este projeto é um sistema de agenda desenvolvido em Java, seguindo o padrão MVC (Model-View-Controller), utilizando Hibernate como framework ORM e MySQL como banco de dados.

⚙️ Tecnologias Utilizadas

Java (versão utilizada no desenvolvimento)

Hibernate (para mapeamento objeto-relacional)

MySQL (banco de dados relacional)

JPA (Java Persistence API)

📂 Estrutura do Projeto

O projeto segue o padrão MVC e está organizado da seguinte forma:

/src

/controller   # Controladores que gerenciam a lógica do sistema

/dao          # Camada de acesso ao banco de dados (Data Access Object)

/factory      # Classe responsável por criar a conexão com o banco

/gui          # Interface gráfica (caso tenha)

/model        # Classes que representam os objetos do sistema

/META-INF     # Configuração do persistence.xml para o Hibernate

🛠️ Configuração do Banco de Dados

Antes de rodar o sistema, certifique-se de que o MySQL está instalado e configurado corretamente.

Criar o banco de dados no MySQL:

CREATE DATABASE agenda;

Configurar o usuário e permissões (se necessário):

GRANT ALL PRIVILEGES ON agenda.\* TO 'root'@'localhost' IDENTIFIED BY 'sua\_senha';

Verificar a configuração do arquivo persistence.xml localizado em src/META-INF/:

xml

<property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>

<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost/agenda"/>

<property name="javax.persistence.jdbc.user" value="root"/>

<property name="javax.persistence.jdbc.password" value=""/>

<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5InnoDBDialect"/>

<property name="hibernate.hbm2ddl.auto" value="update"/>

📌 OBS: Ajuste os valores conforme necessário.

▶️ Como Executar o Projeto

Importe o projeto na sua IDE (NetBeans, Eclipse, IntelliJ).

Certifique-se de que todas as dependências do Hibernate estão no classpath.

Compile e execute o programa.

📜 Licença

Este projeto é de código aberto e pode ser modificado conforme necessário.
