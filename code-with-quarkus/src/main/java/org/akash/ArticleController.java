package org.akash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/article")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArticleController {
	
	@GET
    public Map<String, List<Article>> getArticle() {
        Article p = new Article(23L, "Eraser", 10.17);
        List<Article> list = new ArrayList<>();
        list.add(p);
        Map map = new HashMap<>();
        map.put("articles", list);
        return map;
    }
}
