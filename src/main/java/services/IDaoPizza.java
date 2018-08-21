package services;

import model.Client;
import model.Emprunt;
import model.Livre;

public interface IDaoPizza {
	Livre find(int id);
	Livre findByTitle(String title);
	Emprunt searchEmprunt(int id);
	Client searchEmpruntToClient(String name);
}
