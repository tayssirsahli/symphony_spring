package com.tayssir.cosmetique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tayssir.cosmetique.entities.Article;
import com.tayssir.cosmetique.entities.Classification;
import com.tayssir.cosmetique.repos.CosmetiqueRepository;

@Service
public class CosmetiqueServiceImp implements  CosmetiqueService{

	
	@Autowired
	CosmetiqueRepository cosmetiqueRepository;
	
	
	@Override
	public Article saveCosmetique(Article A) {
		return cosmetiqueRepository.save(A);
	}

	@Override
	public Article updateCosmetique(Article A) {
		return cosmetiqueRepository.save(A);
	}

	@Override
	public void deleteCosmetique(Article A) {
		cosmetiqueRepository.delete(A);
		
	}

	@Override
	public void deleteCosmetiqueById(Long id) {
		cosmetiqueRepository.deleteById(id);
		
	}

	@Override
	public Article getCosmetique(Long id) {
		
		return cosmetiqueRepository.findById(id).get();

	}

	@Override
	public List<Article> getAllCosmetique() {
		
		return cosmetiqueRepository.findAll();
	}

	@Override
	public List<Article> findByNomarticle(String nomarticle) {

		return cosmetiqueRepository.findByNomarticleContains(nomarticle);
	}

	@Override
	public List<Article> findByNomarticleContains(String nomarticle) {
		return cosmetiqueRepository.findByNomarticleContains(nomarticle);
	}

	/*
	 * @Override public List<Article> findByNomPrix(String nom, Double prix) {
	 * 
	 * return cosmetiqueRepository.findByNomPrix(nom, prix); }
	 */

	@Override
	public List<Article> findByClassification(Classification classification) {
	
		return cosmetiqueRepository.findByClassification(classification);
	}

	@Override
	public List<Article> findByClassification_IdClas(long idClas) {
		
		return cosmetiqueRepository.findByClassification_IdClas(idClas);
	}

	@Override
	public List<Article> findByOrderByNomarticleAsc() {
		
		return cosmetiqueRepository.findByOrderByNomarticleAsc();
	}

	@Override
	public List<Article> trierArticleNomsPrix() {
		
		return cosmetiqueRepository.trierArticleNomsPrix();
	}

}
