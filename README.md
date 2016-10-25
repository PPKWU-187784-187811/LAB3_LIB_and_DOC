Documentacja API

  
1.) public String readFile(String file, Callback callback);

Metoda "readFile" wczytuje z pliku, wskazanego przez parametr file, jego zawartoœæ i go zwraca.
Je¿eli odczyt pliku nie powiód³ siê to Callback zwróci wartosc "FAILTURE", je¿eli siê powiedzie "SUCCESS",
zaœ w przypadku progresu "PROGRESS_%".

- String file - nazwa pliku,

- Callback callback - obiekt informuj¹cy o stanie pracy metody.


2.) public writeFile(String file, String text, Callback callback);

Metoda "writeFile" zapisuje do pliku, wskazanego przez parametr file, wartoœæ parametru text.
Je¿eli zapis pliku nie powiód³ siê, lub plik ju¿ istnieje, to Callback zwróci wartosc "FAILTURE", je¿eli siê powiedzie "SUCCESS",
zaœ w przypadku progresu "PROGRESS_%".

- String file - nazwa pliku,

- String text - zawartoœæ do zapisu,

- Callback callback - obiekt informuj¹cy o stanie pracy metody.
