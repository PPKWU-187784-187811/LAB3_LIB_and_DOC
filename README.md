Documentacja API

  
1.) public String readFile(String file, Callback callback);

Metoda "readFile" wczytuje z pliku, wskazanego przez parametr file, jego zawarto�� i go zwraca.
Je�eli odczyt pliku nie powi�d� si� to Callback zwr�ci wartosc "FAILTURE", je�eli si� powiedzie "SUCCESS",
za� w przypadku progresu "PROGRESS_%".

- String file - nazwa pliku,

- Callback callback - obiekt informuj�cy o stanie pracy metody.

