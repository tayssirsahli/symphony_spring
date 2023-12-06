package com.tayssir.cosmetique.service;

import java.util.List;

//import org.springframework.data.repository.query.Param;

import com.tayssir.cosmetique.entities.Article;
import com.tayssir.cosmetique.entities.Classification;

public interface CosmetiqueService {

	Article saveCosmetique(Article A);
	Article updateCosmetique(Article A);
	void deleteCosmetique(Article A);
	void deleteCosmetiqueById(Long id);
	Article getCosmetique(Long id);
	List<Article> getAllCosmetique();
	List<Article> findByNomarticle(String nomarticle);
	List<Article> findByNomarticleContains(String nomarticle);
	//List<Article> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);
	List<Article> findByClassification(Classification classification);
	List<Article> findByClassification_IdClas(long idClas);
	List<Article> findByOrderByNomarticleAsc();
	List<Article> trierArticleNomsPrix();
}
