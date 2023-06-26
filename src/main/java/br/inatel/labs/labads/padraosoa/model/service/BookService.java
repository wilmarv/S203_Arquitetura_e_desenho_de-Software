package br.inatel.labs.labads.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.inatel.labs.labads.padraosoa.model.entity.Book;

@Service
public class BookService {

	private List<Book> bookList = new ArrayList();

	public List<Book> searchBook() {
		return bookList;
	}
}
