package com.tayssir.cosmetique.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomarts", types = { Article.class })
public interface ArticleProjection{

	public String getNomArticle();

}
