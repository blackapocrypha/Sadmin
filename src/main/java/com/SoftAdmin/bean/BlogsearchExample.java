package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class BlogsearchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogsearchExample() {
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

        public Criteria andBlogidIsNull() {
            addCriterion("blogid is null");
            return (Criteria) this;
        }

        public Criteria andBlogidIsNotNull() {
            addCriterion("blogid is not null");
            return (Criteria) this;
        }

        public Criteria andBlogidEqualTo(Integer value) {
            addCriterion("blogid =", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotEqualTo(Integer value) {
            addCriterion("blogid <>", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThan(Integer value) {
            addCriterion("blogid >", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogid >=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThan(Integer value) {
            addCriterion("blogid <", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThanOrEqualTo(Integer value) {
            addCriterion("blogid <=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidIn(List<Integer> values) {
            addCriterion("blogid in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotIn(List<Integer> values) {
            addCriterion("blogid not in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidBetween(Integer value1, Integer value2) {
            addCriterion("blogid between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("blogid not between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogwebIsNull() {
            addCriterion("blogweb is null");
            return (Criteria) this;
        }

        public Criteria andBlogwebIsNotNull() {
            addCriterion("blogweb is not null");
            return (Criteria) this;
        }

        public Criteria andBlogwebEqualTo(String value) {
            addCriterion("blogweb =", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebNotEqualTo(String value) {
            addCriterion("blogweb <>", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebGreaterThan(String value) {
            addCriterion("blogweb >", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebGreaterThanOrEqualTo(String value) {
            addCriterion("blogweb >=", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebLessThan(String value) {
            addCriterion("blogweb <", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebLessThanOrEqualTo(String value) {
            addCriterion("blogweb <=", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebLike(String value) {
            addCriterion("blogweb like", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebNotLike(String value) {
            addCriterion("blogweb not like", value, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebIn(List<String> values) {
            addCriterion("blogweb in", values, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebNotIn(List<String> values) {
            addCriterion("blogweb not in", values, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebBetween(String value1, String value2) {
            addCriterion("blogweb between", value1, value2, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlogwebNotBetween(String value1, String value2) {
            addCriterion("blogweb not between", value1, value2, "blogweb");
            return (Criteria) this;
        }

        public Criteria andBlognameIsNull() {
            addCriterion("blogname is null");
            return (Criteria) this;
        }

        public Criteria andBlognameIsNotNull() {
            addCriterion("blogname is not null");
            return (Criteria) this;
        }

        public Criteria andBlognameEqualTo(String value) {
            addCriterion("blogname =", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotEqualTo(String value) {
            addCriterion("blogname <>", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameGreaterThan(String value) {
            addCriterion("blogname >", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameGreaterThanOrEqualTo(String value) {
            addCriterion("blogname >=", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameLessThan(String value) {
            addCriterion("blogname <", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameLessThanOrEqualTo(String value) {
            addCriterion("blogname <=", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameLike(String value) {
            addCriterion("blogname like", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotLike(String value) {
            addCriterion("blogname not like", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameIn(List<String> values) {
            addCriterion("blogname in", values, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotIn(List<String> values) {
            addCriterion("blogname not in", values, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameBetween(String value1, String value2) {
            addCriterion("blogname between", value1, value2, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotBetween(String value1, String value2) {
            addCriterion("blogname not between", value1, value2, "blogname");
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