package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class UdetilsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UdetilsExample() {
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

        public Criteria andUdidIsNull() {
            addCriterion("udid is null");
            return (Criteria) this;
        }

        public Criteria andUdidIsNotNull() {
            addCriterion("udid is not null");
            return (Criteria) this;
        }

        public Criteria andUdidEqualTo(Integer value) {
            addCriterion("udid =", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotEqualTo(Integer value) {
            addCriterion("udid <>", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThan(Integer value) {
            addCriterion("udid >", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("udid >=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThan(Integer value) {
            addCriterion("udid <", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThanOrEqualTo(Integer value) {
            addCriterion("udid <=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidIn(List<Integer> values) {
            addCriterion("udid in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotIn(List<Integer> values) {
            addCriterion("udid not in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidBetween(Integer value1, Integer value2) {
            addCriterion("udid between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotBetween(Integer value1, Integer value2) {
            addCriterion("udid not between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andUfnameIsNull() {
            addCriterion("ufname is null");
            return (Criteria) this;
        }

        public Criteria andUfnameIsNotNull() {
            addCriterion("ufname is not null");
            return (Criteria) this;
        }

        public Criteria andUfnameEqualTo(String value) {
            addCriterion("ufname =", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotEqualTo(String value) {
            addCriterion("ufname <>", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameGreaterThan(String value) {
            addCriterion("ufname >", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameGreaterThanOrEqualTo(String value) {
            addCriterion("ufname >=", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameLessThan(String value) {
            addCriterion("ufname <", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameLessThanOrEqualTo(String value) {
            addCriterion("ufname <=", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameLike(String value) {
            addCriterion("ufname like", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotLike(String value) {
            addCriterion("ufname not like", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameIn(List<String> values) {
            addCriterion("ufname in", values, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotIn(List<String> values) {
            addCriterion("ufname not in", values, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameBetween(String value1, String value2) {
            addCriterion("ufname between", value1, value2, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotBetween(String value1, String value2) {
            addCriterion("ufname not between", value1, value2, "ufname");
            return (Criteria) this;
        }

        public Criteria andUmailIsNull() {
            addCriterion("umail is null");
            return (Criteria) this;
        }

        public Criteria andUmailIsNotNull() {
            addCriterion("umail is not null");
            return (Criteria) this;
        }

        public Criteria andUmailEqualTo(String value) {
            addCriterion("umail =", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotEqualTo(String value) {
            addCriterion("umail <>", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailGreaterThan(String value) {
            addCriterion("umail >", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailGreaterThanOrEqualTo(String value) {
            addCriterion("umail >=", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailLessThan(String value) {
            addCriterion("umail <", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailLessThanOrEqualTo(String value) {
            addCriterion("umail <=", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailLike(String value) {
            addCriterion("umail like", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotLike(String value) {
            addCriterion("umail not like", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailIn(List<String> values) {
            addCriterion("umail in", values, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotIn(List<String> values) {
            addCriterion("umail not in", values, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailBetween(String value1, String value2) {
            addCriterion("umail between", value1, value2, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotBetween(String value1, String value2) {
            addCriterion("umail not between", value1, value2, "umail");
            return (Criteria) this;
        }

        public Criteria andUsexIsNull() {
            addCriterion("usex is null");
            return (Criteria) this;
        }

        public Criteria andUsexIsNotNull() {
            addCriterion("usex is not null");
            return (Criteria) this;
        }

        public Criteria andUsexEqualTo(String value) {
            addCriterion("usex =", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotEqualTo(String value) {
            addCriterion("usex <>", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThan(String value) {
            addCriterion("usex >", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThanOrEqualTo(String value) {
            addCriterion("usex >=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThan(String value) {
            addCriterion("usex <", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThanOrEqualTo(String value) {
            addCriterion("usex <=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLike(String value) {
            addCriterion("usex like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotLike(String value) {
            addCriterion("usex not like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexIn(List<String> values) {
            addCriterion("usex in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotIn(List<String> values) {
            addCriterion("usex not in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexBetween(String value1, String value2) {
            addCriterion("usex between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotBetween(String value1, String value2) {
            addCriterion("usex not between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUageIsNull() {
            addCriterion("uage is null");
            return (Criteria) this;
        }

        public Criteria andUageIsNotNull() {
            addCriterion("uage is not null");
            return (Criteria) this;
        }

        public Criteria andUageEqualTo(Integer value) {
            addCriterion("uage =", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotEqualTo(Integer value) {
            addCriterion("uage <>", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThan(Integer value) {
            addCriterion("uage >", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThanOrEqualTo(Integer value) {
            addCriterion("uage >=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThan(Integer value) {
            addCriterion("uage <", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThanOrEqualTo(Integer value) {
            addCriterion("uage <=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageIn(List<Integer> values) {
            addCriterion("uage in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotIn(List<Integer> values) {
            addCriterion("uage not in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageBetween(Integer value1, Integer value2) {
            addCriterion("uage between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotBetween(Integer value1, Integer value2) {
            addCriterion("uage not between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUdisIsNull() {
            addCriterion("udis is null");
            return (Criteria) this;
        }

        public Criteria andUdisIsNotNull() {
            addCriterion("udis is not null");
            return (Criteria) this;
        }

        public Criteria andUdisEqualTo(String value) {
            addCriterion("udis =", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisNotEqualTo(String value) {
            addCriterion("udis <>", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisGreaterThan(String value) {
            addCriterion("udis >", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisGreaterThanOrEqualTo(String value) {
            addCriterion("udis >=", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisLessThan(String value) {
            addCriterion("udis <", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisLessThanOrEqualTo(String value) {
            addCriterion("udis <=", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisLike(String value) {
            addCriterion("udis like", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisNotLike(String value) {
            addCriterion("udis not like", value, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisIn(List<String> values) {
            addCriterion("udis in", values, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisNotIn(List<String> values) {
            addCriterion("udis not in", values, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisBetween(String value1, String value2) {
            addCriterion("udis between", value1, value2, "udis");
            return (Criteria) this;
        }

        public Criteria andUdisNotBetween(String value1, String value2) {
            addCriterion("udis not between", value1, value2, "udis");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
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