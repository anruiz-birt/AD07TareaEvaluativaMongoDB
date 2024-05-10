package eus.birt.dam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eus.birt.dam.domain.EspacioNatural;
import eus.birt.dam.repository.EspacioNaturalRepository;

@CrossOrigin (origins= {"http://localhost:4200"})
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EspaciosNaturalesController {

	
	@Autowired
	EspacioNaturalRepository espacioNaturalRepository;
	
	/**
	 * Endpoint principal de espacios naturales.
	 * @return
	 */
	@GetMapping("/espacios")
	public ResponseEntity<List<EspacioNatural>> index() {
	    try {
	        List<EspacioNatural> espacios = espacioNaturalRepository.findAll();
	        return new ResponseEntity<List<EspacioNatural>>(espacios, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<EspacioNatural>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@GetMapping("/espacios/{id}")
	public ResponseEntity<EspacioNatural> showById(@PathVariable("id") String id) {
	    try {
	        EspacioNatural espacio = espacioNaturalRepository.findById(id).orElse(null);	        
	        return new ResponseEntity<EspacioNatural>(espacio, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<EspacioNatural>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@GetMapping("/espacios/municipality/{municipality}")
	public List <EspacioNatural> showByMunicipality(@PathVariable("municipality") String municipality) {
		return espacioNaturalRepository.findByMunicipality(municipality);
	}
}