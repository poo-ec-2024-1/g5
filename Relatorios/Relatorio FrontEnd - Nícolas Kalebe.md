# Relatório de FrontEnd

Meu nome é Nícolas Kalebe e logo que foi passado o trabalho eu me dispus a realizar a parte de front end. Escolhi essa função por que era algo que a gente como estudantes ainda não tínhamos visto muito e era algo que eu queria muito aprender. Minha função no nosso projeto de app de materiais de construção era implementar a interface gráfica da loja em Java Fx e fazer ela conversar com o restante do código. 
# Primeira Etapa

Quando foram abertos os grupos no github já tínhamos dois códigos protótipos que o Pedro (BackEnd) e o Abner (Analista) tinham feito no bluej. Infelizmente não temos os commits dessa primeira versão do código, mas aqui temos a segunda versão dele que já tinha sido alterada por mim para implementar o javaFx:
#### Primeiro Commit
https://github.com/poo-ec-2024-1/g5/commit/322fcf4525fa377872a6bb9a827f413acc8e205c#diff-cc95fd51a7d4b7f41cdbd9fdbef3bdea8cd3b46da657266de83a32d4970d5513

Essa versão já não estava mais sendo desenvolvida no BlueJ. Para melhor implementação do código e melhora de produção optamos por mudar para a IDE InteliJ, que além de ser bem mais completa, nosso email institucional garante a versão paga da IDE, que mais pra frente se revelou muito útil para a parte de database.
Nessa versão o código ainda está bem cru, e muitas coisas foram colocadas como placeholder para serem implementadas no front no futuro, como por exemplo a logo e plano de fundo do app.
Uma coisa que me ajudou muito na implementação do front foi o SceneBuilder que apesar de ser bem simples ele é bem competente no que se propõem. Graças foi bem mais fácil montar as cenas e construir os esqueletos das classes controller.

# Segunda Etapa
#### Segundo Commit
https://github.com/poo-ec-2024-1/g5/commit/bbfa2bee3788eead9b94b4630f92d9ffee5979a2#diff-66087025b230bc198564717fa1bbc186d7e6cfb5a6b320dfe182671462ab5a78

Nesse commit eu atualizei mais um pouco a interface gráfica, agora substituindo as imagens de placeholder e deixando visualmente bem mais bonito. Os botões agora são coloridos, uma imagem de fundo foi adicionada, uma logo e um enfeite na tela inicial do projeto. Também foi adicionado um arquivo .css que conversa com os fxml para criar efeitos visuais nos botões quando o mouse passa por cima deles. Porém nessa fase do projeto só tínhamos as calculadoras de preço e a tela inicial, faltando assim o carrinho e a loja em si.
#### Terceiro Commit
https://github.com/poo-ec-2024-1/g5/commit/7a4fc7be54e0fb246e9c29e6a70bdfcaae05d0ec

Eu tenho outros commits com meu nome de correções de bugs de interface e apagando coisas que não eram mais necessárias, porém esse commit que foi feito pelo Pedro (BackEnd), foi feito em conjunto comigo pela função de codificar em grupo do InteliJ. Ele implementou a database no projeto e eu fiz ela conversar com a classe da loja e do carrinho. Fazendo com que o usuário possa colocar a quantidade desejada de produtos no carrinho, limpa-lo e efetuar a compra.

# Problemas e coisas que não foram implementadas no Front
Infelizmente tiveram coisas que eu não consegui implementar no front. A primeira delas foi colocar o design do botão que eu fiz em todas as telas, o que ia demandar muito tempo. Outra coisa foi um método de atualizar o carrinho automaticamente ao entrar na tela dele. Apesar disso ser um pouco de Back também eu e o Pedro não conseguimos implementar.

# O que aprendi

A principal coisa que eu aprendi com certeza foi o CRUD que é bem útil e pode ser usado em vários contextos diferentes. E com certeza assim como eu disse mais cedo aprender o front foi uma experiencia desafiadora e maravilhosa eu adorei trabalhar com o design e quero muito focar mais nisso no futuro.
