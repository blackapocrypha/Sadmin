package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class TsupportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsupportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNull() {
            addCriterion("ttype is null");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNotNull() {
            addCriterion("ttype is not null");
            return (Criteria) this;
        }

        public Criteria andTtypeEqualTo(String value) {
            addCriterion("ttype =", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotEqualTo(String value) {
            addCriterion("ttype <>", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThan(String value) {
            addCriterion("ttype >", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ttype >=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThan(String value) {
            addCriterion("ttype <", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThanOrEqualTo(String value) {
            addCriterion("ttype <=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLike(String value) {
            addCriterion("ttype like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotLike(String value) {
            addCriterion("ttype not like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeIn(List<String> values) {
            addCriterion("ttype in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotIn(List<String> values) {
            addCriterion("ttype not in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeBetween(String value1, String value2) {
            addCriterion("ttype between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotBetween(String value1, String value2) {
            addCriterion("ttype not between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypetwoIsNull() {
            addCriterion("ttypetwo is null");
            return (Criteria) this;
        }

        public Criteria andTtypetwoIsNotNull() {
            addCriterion("ttypetwo is not null");
            return (Criteria) this;
        }

        public Criteria andTtypetwoEqualTo(String value) {
            addCriterion("ttypetwo =", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoNotEqualTo(String value) {
            addCriterion("ttypetwo <>", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoGreaterThan(String value) {
            addCriterion("ttypetwo >", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoGreaterThanOrEqualTo(String value) {
            addCriterion("ttypetwo >=", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoLessThan(String value) {
            addCriterion("ttypetwo <", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoLessThanOrEqualTo(String value) {
            addCriterion("ttypetwo <=", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoLike(String value) {
            addCriterion("ttypetwo like", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoNotLike(String value) {
            addCriterion("ttypetwo not like", value, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoIn(List<String> values) {
            addCriterion("ttypetwo in", values, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoNotIn(List<String> values) {
            addCriterion("ttypetwo not in", values, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoBetween(String value1, String value2) {
            addCriterion("ttypetwo between", value1, value2, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTtypetwoNotBetween(String value1, String value2) {
            addCriterion("ttypetwo not between", value1, value2, "ttypetwo");
            return (Criteria) this;
        }

        public Criteria andTurlIsNull() {
            addCriterion("turl is null");
            return (Criteria) this;
        }

        public Criteria andTurlIsNotNull() {
            addCriterion("turl is not null");
            return (Criteria) this;
        }

        public Criteria andTurlEqualTo(String value) {
            addCriterion("turl =", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotEqualTo(String value) {
            addCriterion("turl <>", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlGreaterThan(String value) {
            addCriterion("turl >", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlGreaterThanOrEqualTo(String value) {
            addCriterion("turl >=", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLessThan(String value) {
            addCriterion("turl <", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLessThanOrEqualTo(String value) {
            addCriterion("turl <=", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLike(String value) {
            addCriterion("turl like", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotLike(String value) {
            addCriterion("turl not like", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlIn(List<String> values) {
            addCriterion("turl in", values, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotIn(List<String> values) {
            addCriterion("turl not in", values, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlBetween(String value1, String value2) {
            addCriterion("turl between", value1, value2, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotBetween(String value1, String value2) {
            addCriterion("turl not between", value1, value2, "turl");
            return (Criteria) this;
        }

        public Criteria andTdisIsNull() {
            addCriterion("tdis is null");
            return (Criteria) this;
        }

        public Criteria andTdisIsNotNull() {
            addCriterion("tdis is not null");
            return (Criteria) this;
        }

        public Criteria andTdisEqualTo(String value) {
            addCriterion("tdis =", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisNotEqualTo(String value) {
            addCriterion("tdis <>", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisGreaterThan(String value) {
            addCriterion("tdis >", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisGreaterThanOrEqualTo(String value) {
            addCriterion("tdis >=", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisLessThan(String value) {
            addCriterion("tdis <", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisLessThanOrEqualTo(String value) {
            addCriterion("tdis <=", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisLike(String value) {
            addCriterion("tdis like", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisNotLike(String value) {
            addCriterion("tdis not like", value, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisIn(List<String> values) {
            addCriterion("tdis in", values, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisNotIn(List<String> values) {
            addCriterion("tdis not in", values, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisBetween(String value1, String value2) {
            addCriterion("tdis between", value1, value2, "tdis");
            return (Criteria) this;
        }

        public Criteria andTdisNotBetween(String value1, String value2) {
            addCriterion("tdis not between", value1, value2, "tdis");
            return (Criteria) this;
        }

        public Criteria andTenglistIsNull() {
            addCriterion("tEnglist is null");
            return (Criteria) this;
        }

        public Criteria andTenglistIsNotNull() {
            addCriterion("tEnglist is not null");
            return (Criteria) this;
        }

        public Criteria andTenglistEqualTo(String value) {
            addCriterion("tEnglist =", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistNotEqualTo(String value) {
            addCriterion("tEnglist <>", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistGreaterThan(String value) {
            addCriterion("tEnglist >", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistGreaterThanOrEqualTo(String value) {
            addCriterion("tEnglist >=", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistLessThan(String value) {
            addCriterion("tEnglist <", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistLessThanOrEqualTo(String value) {
            addCriterion("tEnglist <=", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistLike(String value) {
            addCriterion("tEnglist like", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistNotLike(String value) {
            addCriterion("tEnglist not like", value, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistIn(List<String> values) {
            addCriterion("tEnglist in", values, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistNotIn(List<String> values) {
            addCriterion("tEnglist not in", values, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistBetween(String value1, String value2) {
            addCriterion("tEnglist between", value1, value2, "tenglist");
            return (Criteria) this;
        }

        public Criteria andTenglistNotBetween(String value1, String value2) {
            addCriterion("tEnglist not between", value1, value2, "tenglist");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}