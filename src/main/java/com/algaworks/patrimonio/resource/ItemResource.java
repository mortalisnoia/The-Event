package com.algaworks.patrimonio.resource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.algaworks.patrimonio.model.Item;
import com.algaworks.patrimonio.repository.ItemRepository;

@RestController
@CrossOrigin("${origem-permitida}")
public class ItemResource {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/itens")
	public List<Item> listar(){
		return itemRepository.findAll();
	}
	
	@PostMapping("/itens")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Item adicionar(@RequestBody @Valid Item item){
		//URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(item.getId()).toUri();
		return itemRepository.save(item);
	}
	
	/*@DeleteMapping("/itens")
	public void remover(@PathVariable int id, Item item){
		
		
	}*/
	public void removerTodos(){
		itemRepository.deleteAll();
	}
	
}
