Documentacja API

  
1.) public String readFile(String file, Callback callback);

Metoda "readFile" wczytuje z pliku, wskazanego przez parametr file, jego zawarto�� i go zwraca.
Je�eli odczyt pliku nie powi�d� si� to Callback zwr�ci wartosc "FAILTURE", je�eli si� powiedzie "SUCCESS",
za� w przypadku progresu "PROGRESS_%".

- String file - nazwa pliku,

- Callback callback - obiekt informuj�cy o stanie pracy metody.


2.) public writeFile(String file, String text, Callback callback);

Metoda "writeFile" zapisuje do pliku, wskazanego przez parametr file, warto�� parametru text.
Je�eli zapis pliku nie powi�d� si�, lub plik ju� istnieje, to Callback zwr�ci wartosc "FAILTURE", je�eli si� powiedzie "SUCCESS",
za� w przypadku progresu "PROGRESS_%".

- String file - nazwa pliku,

- String text - zawarto�� do zapisu,

- Callback callback - obiekt informuj�cy o stanie pracy metody.
