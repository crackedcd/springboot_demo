package com.cc_testj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc_testj.demo.mybatis.model.Words;
import com.cc_testj.demo.service.WordService;

@RestController
public class WordsController {

	@Autowired
	WordService wordService;
	
	@RequestMapping("/words/listAll")
	public List<Words> listAll(){
		return wordService.queryAllWords();
	}
	
	@RequestMapping("/words/query/{word}")
	public List<Words> queryByWord(@PathVariable String word){
		return wordService.queryByWord(word);
	}
}
