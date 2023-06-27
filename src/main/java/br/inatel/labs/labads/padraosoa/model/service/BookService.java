package br.inatel.labs.labads.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.inatel.labs.labads.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;

@Service
public class BookService {

	private List<Book> bookList = new ArrayList();
	
	@PostConstruct
	private void setup() {
		Book b1 = new Book(1L,"Delphin Blanco","Contos");
		Book b2 = new Book(2L,"Python com Matemática","Programação");
		Book b3 = new Book(3L,"Cozinha Mineral","Gastronomia");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
	}

	public List<Book> searchBook() {
		return bookList;
	}
}
