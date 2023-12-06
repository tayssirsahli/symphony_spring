package com.tayssir.cosmetique;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tayssir.cosmetique.entities.Article;
import com.tayssir.cosmetique.entities.Classification;
import com.tayssir.cosmetique.repos.CosmetiqueRepository;

@SpringBootTest
class CosmetiquesApplicationTests {

	@Autowired
	private CosmetiqueRepository cosmetiqueRepository;
	
	 @Test
	    public void testCreateCosmetique() {
	        Article article = new Article("SVR sebiaclear gel moussant 200 ml", 30.5, new Date());
	        cosmetiqueRepository.save(article);
	    }
	
	@Test
	public void testFindCosmetique()
	{
		Article A = cosmetiqueRepository.findById(1L).get(); 
		System.out.println(A);
	}
	
	@Test
	public void testUpdateCosmetique()
	{
		Article A = cosmetiqueRepository.findById(1L).get(); 
		A.setPrixarticle(2000.0);
		cosmetiqueRepository.save(A);
		System.out.println(A);
	}
	@Test
	public void testDeleteCosmetique()
	{
		cosmetiqueRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousCosmetique()
	{
		List<Article> arts = cosmetiqueRepository.findAll();
		for (Article A : arts)
		{
			System.out.println(A);
		}
	}
	
	@Test
	public void testFindCosmetiqueByNom()
	{
		List<Article> arts = cosmetiqueRepository.findByNomarticle("UN SECURE Blur SPF50");
		for (Article a : arts)
		{
			System.out.println(a);
		}
		
	}
	@Test
	public void testFindCosmetiqueByNomContains()
	{
		List<Article> arts = cosmetiqueRepository.findByNomarticleContains("SVR");
		for (Article a : arts)
		{
			System.out.println(a);
		}
		
	}

	/*@Test
	public void testfindByNomPrix() {
		System.out.println("Executing testfindByNomPrix");
	   List<Article> arts = cosmetiqueRepository.findByNomPrix("SUN SECURE Blur SPF50", 60.0);
		
	    for (Article a : arts) {
	        System.out.println(a);
	    }
	}*/
	 @Test
	 public void testfindByClassification()
	 {
		 Classification clas = new Classification();
		 clas.setIdClas(10L);
		 List<Article> arts = cosmetiqueRepository.findByClassification(clas);
		 for (Article A : arts)
		 {
			 System.out.println(A);
		 }
	 }
	 
	 @Test
	 public void testFindByClassificationIdClas() {
	     List<Article> arts = cosmetiqueRepository.findByClassification_IdClas(10L);

	     for (Article a : arts) {
	         System.out.println(a);
	     }
	 }
	 
	 @Test
	 public void testfindByOrderByNomArticleAsc()
	 {
		 List<Article> arts = cosmetiqueRepository.findByOrderByNomarticleAsc();
		 for (Article a : arts) {
	         System.out.println(a);
	     }
	 }
	
	 @Test
	 public void testTrierArticleNomsPrix()
	 {
		 List<Article> arts= cosmetiqueRepository.trierArticleNomsPrix();
		 for (Article a : arts) {
	         System.out.println(a);
	     }
	 }




}
