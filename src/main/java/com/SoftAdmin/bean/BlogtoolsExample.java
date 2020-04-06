package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class BlogtoolsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogtoolsExample() {
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

        public Criteria andWebnameIsNull() {
            addCriterion("webname is null");
            return (Criteria) this;
        }

        public Criteria andWebnameIsNotNull() {
            addCriterion("webname is not null");
            return (Criteria) this;
        }

        public Criteria andWebnameEqualTo(String value) {
            addCriterion("webname =", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotEqualTo(String value) {
            addCriterion("webname <>", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThan(String value) {
            addCriterion("webname >", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThanOrEqualTo(String value) {
            addCriterion("webname >=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThan(String value) {
            addCriterion("webname <", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThanOrEqualTo(String value) {
            addCriterion("webname <=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLike(String value) {
            addCriterion("webname like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotLike(String value) {
            addCriterion("webname not like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameIn(List<String> values) {
            addCriterion("webname in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotIn(List<String> values) {
            addCriterion("webname not in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameBetween(String value1, String value2) {
            addCriterion("webname between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotBetween(String value1, String value2) {
            addCriterion("webname not between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWeburlIsNull() {
            addCriterion("weburl is null");
            return (Criteria) this;
        }

        public Criteria andWeburlIsNotNull() {
            addCriterion("weburl is not null");
            return (Criteria) this;
        }

        public Criteria andWeburlEqualTo(String value) {
            addCriterion("weburl =", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotEqualTo(String value) {
            addCriterion("weburl <>", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlGreaterThan(String value) {
            addCriterion("weburl >", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlGreaterThanOrEqualTo(String value) {
            addCriterion("weburl >=", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLessThan(String value) {
            addCriterion("weburl <", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLessThanOrEqualTo(String value) {
            addCriterion("weburl <=", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLike(String value) {
            addCriterion("weburl like", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotLike(String value) {
            addCriterion("weburl not like", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlIn(List<String> values) {
            addCriterion("weburl in", values, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotIn(List<String> values) {
            addCriterion("weburl not in", values, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlBetween(String value1, String value2) {
            addCriterion("weburl between", value1, value2, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotBetween(String value1, String value2) {
            addCriterion("weburl not between", value1, value2, "weburl");
            return (Criteria) this;
        }

        public Criteria andWebdisIsNull() {
            addCriterion("webdis is null");
            return (Criteria) this;
        }

        public Criteria andWebdisIsNotNull() {
            addCriterion("webdis is not null");
            return (Criteria) this;
        }

        public Criteria andWebdisEqualTo(String value) {
            addCriterion("webdis =", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisNotEqualTo(String value) {
            addCriterion("webdis <>", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisGreaterThan(String value) {
            addCriterion("webdis >", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisGreaterThanOrEqualTo(String value) {
            addCriterion("webdis >=", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisLessThan(String value) {
            addCriterion("webdis <", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisLessThanOrEqualTo(String value) {
            addCriterion("webdis <=", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisLike(String value) {
            addCriterion("webdis like", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisNotLike(String value) {
            addCriterion("webdis not like", value, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisIn(List<String> values) {
            addCriterion("webdis in", values, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisNotIn(List<String> values) {
            addCriterion("webdis not in", values, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisBetween(String value1, String value2) {
            addCriterion("webdis between", value1, value2, "webdis");
            return (Criteria) this;
        }

        public Criteria andWebdisNotBetween(String value1, String value2) {
            addCriterion("webdis not between", value1, value2, "webdis");
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