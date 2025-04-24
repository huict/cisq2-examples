Explanation van de eerste test van Generics:
Je zal zien dat de eerste test niet slaagt. Dit komt omdat wanneer je de `List` gebruikt, er standaard een List<Object>
gemaakt wordt. IntelliJ raadt dit ook af.
Je hebt hier meerdere opties:

### Optie 1 met List<String>

 ```java

@Test
void listWithoutGenerics() {
    List<String> voorbeeld = new ArrayList();

    voorbeeld.add("Hallo");

    String hallo = voorbeeld.get(0);
}
```

### Optie 2 met List<Object> en cast

 ```java

@Test
void listWithoutGenerics() {
    List<Object> voorbeeld = new ArrayList();

    voorbeeld.add("Hallo");

    String hallo = (String) voorbeeld.get(0);
}
```

**
### Optie 3 met List<Object> en type verandering

 ```java

@Test
void listWithoutGenerics() {
    List<String> voorbeeld = new ArrayList();

    voorbeeld.add("Hallo");

    Object hallo = voorbeeld.get(0);
}
```

Welke optie kies jij als beste oplossing? En waarom? En werk je hier met generics?

```java

@Test
void listWithGenerics() {
    List<String> voorbeeld = new ArrayList<>();

    voorbeeld.add("Hallo");

    String hallo = voorbeeld.get(0);
}
```

**Je ziet** hier dat we kiezen voor het gebruik van een generic. Als je een ander antwoord had bij 1, waarom denk je dat
wij voor deze oplossing kiezen?

### Deze test (nummer 3) slaagt niet

````java

@Test
void declarerenGenericClass() {
    List<Song> songs = new ArrayList<>();
    songs.add(new Song("Hard to Handle", "Black Crowes"));

    List<Content> content = songs;
}
````

**Kan je** achterhalen waarom deze niet slaagt? En hoe zou je dit moeten verbeteren?

### Een oplossing?

````java

@Test
void declarerenGenericClass() {
    List<Song> songs = new ArrayList<>();
    songs.add(new Song("Hard to Handle", "Black Crowes"));

    List<Song> content = songs;
}
````

**Hier is** op de laatste regel de generic van List<T> ingevuld met Song in plaats van Content. Song is een
implementatie van de interface Content.
Hiermee test je eigenlijk niet meer Content, wat de test wel zou willen doen.
Zoek uit hoe je wel een implementatie van een interface zou kunnen testen. Hint: begin bij '?'

### Onderstaande test slaagt niet

```java

@Test
void sortAnObject() {
    List<Song> songs = MockContent.getPopularSongs();

    Collections.sort(songs);

    System.out.println(songs);
}
```

Als je deze vergelijkt met de test eronder, slaagt deze wel. Hoe kan dat?

````java

@Test
void sortAString() {
    List<String> strings = MockContent.getPopularArtists();

    Collections.sort(strings);
}
````

**Als je niet weet** waar het aan ligt, check dan de klasse String. In de klasdefinitie staat

```java
Comparable<String>
```

Waarmee wordt aangegeven dat een object te vergelijken is met een ander. En je kan inderdaad string inhoud danwel
referentie vergelijken met elkaar!

**Kan je** dit ook doen voor de klasse Song?