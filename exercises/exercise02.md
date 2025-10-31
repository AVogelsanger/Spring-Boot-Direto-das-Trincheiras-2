# Exercise 2 - @RequestParam, @PathVariable

Crie uma classe chamada Anime, dentro do pacote chamdo domain, com os seguintes atributos: long id,
String name. Crie um método dentro da classe Anime que retorne uma lista "hardcoded" de animes. 
Atualize a AnimeController para retornar uma lista de anime, em seguida, crie outros dois métodos, 
um para filtrar pelo nome, usando @RequestParam, e o segundo, para retornar um Anime pelo id, usando
@PathVariable