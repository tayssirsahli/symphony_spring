package com.tayssir.cosmetique.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource; 
import com.tayssir.cosmetique.entities.Article;
import com.tayssir.cosmetique.entities.Classification;

@RepositoryRestResource(path = "rest")
public interface CosmetiqueRepository extends JpaRepository<Article, Long> {

    List<Article> findByNomarticle(String nomarticle);

    List<Article> findByNomarticleContains(String nomarticle);

   /*
     @Query("select A from Article A where A.nomarticle like %:nom and A.prixarticle > :prix")   
     List<Article> findByNomPrix(@Param("nom") String nom,@Param("prix") Double prix);
*/
	@Query("select A from Article A where A.classification = ?1")
	List<Article> findByClassification (Classification classification);


	List<Article> findByClassification_IdClas(long idClas);
	
	List<Article> findByOrderByNomarticleAsc();
	
	@Query("select a from Article a order by a.nomarticle ASC, a.prixarticle DESC")//si un article a le m^ nom il passe a tester les prix 
	List<Article> trierArticleNomsPrix ();
	
	
	


	
	

	
}

