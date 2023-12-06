package com.tayssir.cosmetique.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tayssir.cosmetique.entities.Article;
import com.tayssir.cosmetique.service.CosmetiqueService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticleRESTController {

	@Autowired
	CosmetiqueService cosmetiqueService;

	public @RequestMapping(path="all",method = RequestMethod.GET)
	List<Article> getAllCosmetique() {
		return cosmetiqueService.getAllCosmetique();
	}
	
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Article getCosmetiqueById(@PathVariable("id") Long id) {
		
		return cosmetiqueService.getCosmetique(id);
	 }
	
	
	
	@RequestMapping(path="/addcos",method = RequestMethod.POST)
	public Article createArticle(@RequestBody Article article) {
		return cosmetiqueService.saveCosmetique(article);
	}
	
	@RequestMapping(path="/updatecos",method = RequestMethod.PUT)
	public Article updateArticle(@RequestBody Article article) {
		
		return cosmetiqueService.updateCosmetique(article);
	}

	@RequestMapping(value="/delcos/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") Long id)
	{
		cosmetiqueService.deleteCosmetiqueById(id);
	}

	@RequestMapping(value="/cosmetiqueClas/{idClas}",method = RequestMethod.GET)
	public List<Article> getCosmetiqueByClasId(@PathVariable("idClas") Long idClas) {
		
		return cosmetiqueService.findByClassification_IdClas(idClas);
	}
	
	@RequestMapping(value="/cosmetiqueByName/{nom}",method = RequestMethod.GET)
	public List<Article> findByNomArticleContains(@PathVariable("nom") String nom) {
	return cosmetiqueService.findByNomarticleContains(nom);
	}
	

}
