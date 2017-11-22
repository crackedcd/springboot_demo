package com.cc_testj.demo.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class WordsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public WordsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andNumIsNull() {
			addCriterion("num is null");
			return (Criteria) this;
		}

		public Criteria andNumIsNotNull() {
			addCriterion("num is not null");
			return (Criteria) this;
		}

		public Criteria andNumEqualTo(Integer value) {
			addCriterion("num =", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumNotEqualTo(Integer value) {
			addCriterion("num <>", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumGreaterThan(Integer value) {
			addCriterion("num >", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("num >=", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumLessThan(Integer value) {
			addCriterion("num <", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumLessThanOrEqualTo(Integer value) {
			addCriterion("num <=", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumIn(List<Integer> values) {
			addCriterion("num in", values, "num");
			return (Criteria) this;
		}

		public Criteria andNumNotIn(List<Integer> values) {
			addCriterion("num not in", values, "num");
			return (Criteria) this;
		}

		public Criteria andNumBetween(Integer value1, Integer value2) {
			addCriterion("num between", value1, value2, "num");
			return (Criteria) this;
		}

		public Criteria andNumNotBetween(Integer value1, Integer value2) {
			addCriterion("num not between", value1, value2, "num");
			return (Criteria) this;
		}

		public Criteria andWordIsNull() {
			addCriterion("word is null");
			return (Criteria) this;
		}

		public Criteria andWordIsNotNull() {
			addCriterion("word is not null");
			return (Criteria) this;
		}

		public Criteria andWordEqualTo(String value) {
			addCriterion("word =", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotEqualTo(String value) {
			addCriterion("word <>", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordGreaterThan(String value) {
			addCriterion("word >", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordGreaterThanOrEqualTo(String value) {
			addCriterion("word >=", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordLessThan(String value) {
			addCriterion("word <", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordLessThanOrEqualTo(String value) {
			addCriterion("word <=", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordLike(String value) {
			addCriterion("word like", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotLike(String value) {
			addCriterion("word not like", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordIn(List<String> values) {
			addCriterion("word in", values, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotIn(List<String> values) {
			addCriterion("word not in", values, "word");
			return (Criteria) this;
		}

		public Criteria andWordBetween(String value1, String value2) {
			addCriterion("word between", value1, value2, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotBetween(String value1, String value2) {
			addCriterion("word not between", value1, value2, "word");
			return (Criteria) this;
		}

		public Criteria andPhoneticIsNull() {
			addCriterion("phonetic is null");
			return (Criteria) this;
		}

		public Criteria andPhoneticIsNotNull() {
			addCriterion("phonetic is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneticEqualTo(String value) {
			addCriterion("phonetic =", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticNotEqualTo(String value) {
			addCriterion("phonetic <>", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticGreaterThan(String value) {
			addCriterion("phonetic >", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticGreaterThanOrEqualTo(String value) {
			addCriterion("phonetic >=", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticLessThan(String value) {
			addCriterion("phonetic <", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticLessThanOrEqualTo(String value) {
			addCriterion("phonetic <=", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticLike(String value) {
			addCriterion("phonetic like", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticNotLike(String value) {
			addCriterion("phonetic not like", value, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticIn(List<String> values) {
			addCriterion("phonetic in", values, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticNotIn(List<String> values) {
			addCriterion("phonetic not in", values, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticBetween(String value1, String value2) {
			addCriterion("phonetic between", value1, value2, "phonetic");
			return (Criteria) this;
		}

		public Criteria andPhoneticNotBetween(String value1, String value2) {
			addCriterion("phonetic not between", value1, value2, "phonetic");
			return (Criteria) this;
		}

		public Criteria andDefinitionIsNull() {
			addCriterion("definition is null");
			return (Criteria) this;
		}

		public Criteria andDefinitionIsNotNull() {
			addCriterion("definition is not null");
			return (Criteria) this;
		}

		public Criteria andDefinitionEqualTo(String value) {
			addCriterion("definition =", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionNotEqualTo(String value) {
			addCriterion("definition <>", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionGreaterThan(String value) {
			addCriterion("definition >", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionGreaterThanOrEqualTo(String value) {
			addCriterion("definition >=", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionLessThan(String value) {
			addCriterion("definition <", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionLessThanOrEqualTo(String value) {
			addCriterion("definition <=", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionLike(String value) {
			addCriterion("definition like", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionNotLike(String value) {
			addCriterion("definition not like", value, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionIn(List<String> values) {
			addCriterion("definition in", values, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionNotIn(List<String> values) {
			addCriterion("definition not in", values, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionBetween(String value1, String value2) {
			addCriterion("definition between", value1, value2, "definition");
			return (Criteria) this;
		}

		public Criteria andDefinitionNotBetween(String value1, String value2) {
			addCriterion("definition not between", value1, value2, "definition");
			return (Criteria) this;
		}

		public Criteria andEngSentenceIsNull() {
			addCriterion("eng_sentence is null");
			return (Criteria) this;
		}

		public Criteria andEngSentenceIsNotNull() {
			addCriterion("eng_sentence is not null");
			return (Criteria) this;
		}

		public Criteria andEngSentenceEqualTo(String value) {
			addCriterion("eng_sentence =", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceNotEqualTo(String value) {
			addCriterion("eng_sentence <>", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceGreaterThan(String value) {
			addCriterion("eng_sentence >", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceGreaterThanOrEqualTo(String value) {
			addCriterion("eng_sentence >=", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceLessThan(String value) {
			addCriterion("eng_sentence <", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceLessThanOrEqualTo(String value) {
			addCriterion("eng_sentence <=", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceLike(String value) {
			addCriterion("eng_sentence like", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceNotLike(String value) {
			addCriterion("eng_sentence not like", value, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceIn(List<String> values) {
			addCriterion("eng_sentence in", values, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceNotIn(List<String> values) {
			addCriterion("eng_sentence not in", values, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceBetween(String value1, String value2) {
			addCriterion("eng_sentence between", value1, value2, "engSentence");
			return (Criteria) this;
		}

		public Criteria andEngSentenceNotBetween(String value1, String value2) {
			addCriterion("eng_sentence not between", value1, value2, "engSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceIsNull() {
			addCriterion("chn_sentence is null");
			return (Criteria) this;
		}

		public Criteria andChnSentenceIsNotNull() {
			addCriterion("chn_sentence is not null");
			return (Criteria) this;
		}

		public Criteria andChnSentenceEqualTo(String value) {
			addCriterion("chn_sentence =", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceNotEqualTo(String value) {
			addCriterion("chn_sentence <>", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceGreaterThan(String value) {
			addCriterion("chn_sentence >", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceGreaterThanOrEqualTo(String value) {
			addCriterion("chn_sentence >=", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceLessThan(String value) {
			addCriterion("chn_sentence <", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceLessThanOrEqualTo(String value) {
			addCriterion("chn_sentence <=", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceLike(String value) {
			addCriterion("chn_sentence like", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceNotLike(String value) {
			addCriterion("chn_sentence not like", value, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceIn(List<String> values) {
			addCriterion("chn_sentence in", values, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceNotIn(List<String> values) {
			addCriterion("chn_sentence not in", values, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceBetween(String value1, String value2) {
			addCriterion("chn_sentence between", value1, value2, "chnSentence");
			return (Criteria) this;
		}

		public Criteria andChnSentenceNotBetween(String value1, String value2) {
			addCriterion("chn_sentence not between", value1, value2, "chnSentence");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table eng_exercise_t_words
	 * @mbg.generated  Mon Nov 20 17:31:01 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table eng_exercise_t_words
     *
     * @mbg.generated do_not_delete_during_merge Mon Nov 20 15:50:01 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}