package com.mql.web;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mql.entities.Article;
import com.mql.entities.Chair;
import com.mql.metier.IArticleMetier;
import com.mql.metier.IChairMetier;
@Controller
public class ChairController {
	@Autowired
	private IChairMetier icm;
	@Autowired
	private IArticleMetier artm;
	@RequestMapping("/listchair")
	public ModelAndView getAll() {
		List<Chair> list = icm.findAllChair();
		return new ModelAndView("listchair", "list", list);

	}
	@GetMapping (value="/consultChair")
	public String consultChair(Long idChair ,Model model) {
		
		Chair chair=icm.findOne(idChair);
		List<Article> list=artm.listarticles();
		ChairDto chairDto=new ChairDto(chair);
		/////chairDto.setArticles(list);
		model.addAttribute("chairDto", chairDto);
		model.addAttribute("articles", list);
	
		return "consultChair";
		
	}
	@RequestMapping (value="/addNote",method=RequestMethod.POST)
	public String editsave(@Valid ChairDto chairDto,BindingResult result) {	
	System.out.println("àààààààààààààààààààààààààààààààààà================"
			+ "àààààààààààààààààààààà"+chairDto.getIdChair());
	Article ar=artm.getArticle(chairDto.getIdArticle());
	Chair chair=icm.findOne(chairDto.getIdChair());
	ar.setChair(chair);
	ar.setNotechair(chairDto.getNote());
	
		//articleRepositoy.save(ar);
	   return "redirect:viewArticlelist";
	}

}