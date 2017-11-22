package com.cc_testj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cc_testj.demo.mybatis.model.Words;
import com.cc_testj.demo.service.WordService;

@Controller
public class WordsController {

	@Autowired
	WordService wordService;
	
	@RequestMapping("/words/listAll")
	@ResponseBody
	public List<Words> listAll(){
		return wordService.queryAllWords();
	}
	
	@RequestMapping("/words/query/{word}")
	@ResponseBody
	public List<Words> queryByWord(@PathVariable String word){
		return wordService.queryByWord(word);
	}
	
	@RequestMapping("/words/showWord/{wordParam}")
	public ModelAndView showWord(@PathVariable String wordParam) {
		ModelAndView mv = new ModelAndView("/words/showWord");
		Words word = wordService.queryByWord(wordParam).get(0);
		mv.addObject("word", word);
		return mv;
	}
	
	
	
	
	
}
