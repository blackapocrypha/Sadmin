package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class UfaverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UfaverExample() {
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

        public Criteria andUsernamerIsNull() {
            addCriterion("usernamer is null");
            return (Criteria) this;
        }

        public Criteria andUsernamerIsNotNull() {
            addCriterion("usernamer is not null");
            return (Criteria) this;
        }

        public Criteria andUsernamerEqualTo(String value) {
            addCriterion("usernamer =", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerNotEqualTo(String value) {
            addCriterion("usernamer <>", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerGreaterThan(String value) {
            addCriterion("usernamer >", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerGreaterThanOrEqualTo(String value) {
            addCriterion("usernamer >=", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerLessThan(String value) {
            addCriterion("usernamer <", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerLessThanOrEqualTo(String value) {
            addCriterion("usernamer <=", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerLike(String value) {
            addCriterion("usernamer like", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerNotLike(String value) {
            addCriterion("usernamer not like", value, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerIn(List<String> values) {
            addCriterion("usernamer in", values, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerNotIn(List<String> values) {
            addCriterion("usernamer not in", values, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerBetween(String value1, String value2) {
            addCriterion("usernamer between", value1, value2, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUsernamerNotBetween(String value1, String value2) {
            addCriterion("usernamer not between", value1, value2, "usernamer");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTimIsNull() {
            addCriterion("tim is null");
            return (Criteria) this;
        }

        public Criteria andTimIsNotNull() {
            addCriterion("tim is not null");
            return (Criteria) this;
        }

        public Criteria andTimEqualTo(String value) {
            addCriterion("tim =", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotEqualTo(String value) {
            addCriterion("tim <>", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimGreaterThan(String value) {
            addCriterion("tim >", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimGreaterThanOrEqualTo(String value) {
            addCriterion("tim >=", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimLessThan(String value) {
            addCriterion("tim <", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimLessThanOrEqualTo(String value) {
            addCriterion("tim <=", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimLike(String value) {
            addCriterion("tim like", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotLike(String value) {
            addCriterion("tim not like", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimIn(List<String> values) {
            addCriterion("tim in", values, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotIn(List<String> values) {
            addCriterion("tim not in", values, "tim");
            return (Criteria) this;
        }

        public Criteria andTimBetween(String value1, String value2) {
            addCriterion("tim between", value1, value2, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotBetween(String value1, String value2) {
            addCriterion("tim not between", value1, value2, "tim");
            return (Criteria) this;
        }

        public Criteria andDisIsNull() {
            addCriterion("dis is null");
            return (Criteria) this;
        }

        public Criteria andDisIsNotNull() {
            addCriterion("dis is not null");
            return (Criteria) this;
        }

        public Criteria andDisEqualTo(String value) {
            addCriterion("dis =", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotEqualTo(String value) {
            addCriterion("dis <>", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisGreaterThan(String value) {
            addCriterion("dis >", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisGreaterThanOrEqualTo(String value) {
            addCriterion("dis >=", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLessThan(String value) {
            addCriterion("dis <", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLessThanOrEqualTo(String value) {
            addCriterion("dis <=", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLike(String value) {
            addCriterion("dis like", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotLike(String value) {
            addCriterion("dis not like", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisIn(List<String> values) {
            addCriterion("dis in", values, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotIn(List<String> values) {
            addCriterion("dis not in", values, "dis");
            return (Criteria) this;
        }

        public Criteria andDisBetween(String value1, String value2) {
            addCriterion("dis between", value1, value2, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotBetween(String value1, String value2) {
            addCriterion("dis not between", value1, value2, "dis");
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