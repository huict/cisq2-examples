# Workshop Generics en Streams

## Collections met generics

### 1. Je gebruikt al generics
``List<String> list = new ArrayList<>();``

In javadoc wordt de ArrayList zo gedefinieerd:
``Class ArrayList<E>``

``E`` is een generieke typeparameter. Dit betekent dat je bij het aanroepen van de constructor van de ArrayList een type moet opgeven. Dit kan bijvoorbeeld ``String`` zijn, maar ook ``Integer`` of een zelf gedefinieerde klasse.

Als je schrijft:
``List<String> voorbeeld = new ArrayList<>();``

Dan zeg je dat de parameter "voorbeeld" van het type ``List`` is en dat de elementen van het type ``String`` zijn. Dit betekent dat je alleen Strings in de lijst kunt stoppen. Als je een Integer probeert toe te voegen, krijg je een compileerfout.

### 2. De kracht van generics
