Documentacja API

  
1.) public String readFile(String file, Callback callback);

Metoda "readFile" wczytuje z pliku, wskazanego przez parametr file, jego zawartoœæ i go zwraca.
Je¿eli odczyt pliku nie powiód³ siê to Callback zwróci wartosc "FAILTURE", je¿eli siê powiedzie "SUCCESS",
zaœ w przypadku progresu "PROGRESS_%".

- String file - nazwa pliku,

- Callback callback - obiekt informuj¹cy o stanie pracy metody.

