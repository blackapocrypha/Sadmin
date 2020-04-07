package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class BlogmusicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogmusicExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("appname is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("appname is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("appname =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("appname <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("appname >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appname >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("appname <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("appname <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("appname like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("appname not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("appname in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("appname not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("appname between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("appname not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppimgurlIsNull() {
            addCriterion("appimgurl is null");
            return (Criteria) this;
        }

        public Criteria andAppimgurlIsNotNull() {
            addCriterion("appimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andAppimgurlEqualTo(String value) {
            addCriterion("appimgurl =", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlNotEqualTo(String value) {
            addCriterion("appimgurl <>", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlGreaterThan(String value) {
            addCriterion("appimgurl >", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("appimgurl >=", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlLessThan(String value) {
            addCriterion("appimgurl <", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlLessThanOrEqualTo(String value) {
            addCriterion("appimgurl <=", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlLike(String value) {
            addCriterion("appimgurl like", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlNotLike(String value) {
            addCriterion("appimgurl not like", value, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlIn(List<String> values) {
            addCriterion("appimgurl in", values, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlNotIn(List<String> values) {
            addCriterion("appimgurl not in", values, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlBetween(String value1, String value2) {
            addCriterion("appimgurl between", value1, value2, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppimgurlNotBetween(String value1, String value2) {
            addCriterion("appimgurl not between", value1, value2, "appimgurl");
            return (Criteria) this;
        }

        public Criteria andAppdisIsNull() {
            addCriterion("appdis is null");
            return (Criteria) this;
        }

        public Criteria andAppdisIsNotNull() {
            addCriterion("appdis is not null");
            return (Criteria) this;
        }

        public Criteria andAppdisEqualTo(String value) {
            addCriterion("appdis =", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisNotEqualTo(String value) {
            addCriterion("appdis <>", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisGreaterThan(String value) {
            addCriterion("appdis >", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisGreaterThanOrEqualTo(String value) {
            addCriterion("appdis >=", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisLessThan(String value) {
            addCriterion("appdis <", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisLessThanOrEqualTo(String value) {
            addCriterion("appdis <=", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisLike(String value) {
            addCriterion("appdis like", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisNotLike(String value) {
            addCriterion("appdis not like", value, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisIn(List<String> values) {
            addCriterion("appdis in", values, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisNotIn(List<String> values) {
            addCriterion("appdis not in", values, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisBetween(String value1, String value2) {
            addCriterion("appdis between", value1, value2, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdisNotBetween(String value1, String value2) {
            addCriterion("appdis not between", value1, value2, "appdis");
            return (Criteria) this;
        }

        public Criteria andAppdownurlIsNull() {
            addCriterion("appdownurl is null");
            return (Criteria) this;
        }

        public Criteria andAppdownurlIsNotNull() {
            addCriterion("appdownurl is not null");
            return (Criteria) this;
        }

        public Criteria andAppdownurlEqualTo(String value) {
            addCriterion("appdownurl =", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlNotEqualTo(String value) {
            addCriterion("appdownurl <>", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlGreaterThan(String value) {
            addCriterion("appdownurl >", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlGreaterThanOrEqualTo(String value) {
            addCriterion("appdownurl >=", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlLessThan(String value) {
            addCriterion("appdownurl <", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlLessThanOrEqualTo(String value) {
            addCriterion("appdownurl <=", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlLike(String value) {
            addCriterion("appdownurl like", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlNotLike(String value) {
            addCriterion("appdownurl not like", value, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlIn(List<String> values) {
            addCriterion("appdownurl in", values, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlNotIn(List<String> values) {
            addCriterion("appdownurl not in", values, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlBetween(String value1, String value2) {
            addCriterion("appdownurl between", value1, value2, "appdownurl");
            return (Criteria) this;
        }

        public Criteria andAppdownurlNotBetween(String value1, String value2) {
            addCriterion("appdownurl not between", value1, value2, "appdownurl");
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