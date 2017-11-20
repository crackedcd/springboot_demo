package com.cc_testj.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc_testj.demo.mybatis.dao.WordsMapper;
import com.cc_testj.demo.mybatis.model.Words;
import com.cc_testj.demo.mybatis.model.WordsExample;

@Service
public class WordService {

	@Autowired
	WordsMapper wordsMapper;
	
	public List<Words> queryAllWords(){
		return wordsMapper.selectByExample(null);
	}
	
	public List<Words> queryByWord(String word){
		WordsExample example = new WordsExample();
		example.createCriteria().andWordEqualTo(word);
		return wordsMapper.selectByExample(example);
	}
}
