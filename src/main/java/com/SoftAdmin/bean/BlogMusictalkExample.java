package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class BlogMusictalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogMusictalkExample() {
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

        public Criteria andBtidIsNull() {
            addCriterion("btid is null");
            return (Criteria) this;
        }

        public Criteria andBtidIsNotNull() {
            addCriterion("btid is not null");
            return (Criteria) this;
        }

        public Criteria andBtidEqualTo(Integer value) {
            addCriterion("btid =", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotEqualTo(Integer value) {
            addCriterion("btid <>", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThan(Integer value) {
            addCriterion("btid >", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("btid >=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThan(Integer value) {
            addCriterion("btid <", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThanOrEqualTo(Integer value) {
            addCriterion("btid <=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidIn(List<Integer> values) {
            addCriterion("btid in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotIn(List<Integer> values) {
            addCriterion("btid not in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidBetween(Integer value1, Integer value2) {
            addCriterion("btid between", value1, value2, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotBetween(Integer value1, Integer value2) {
            addCriterion("btid not between", value1, value2, "btid");
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

        public Criteria andKissidIsNull() {
            addCriterion("kissid is null");
            return (Criteria) this;
        }

        public Criteria andKissidIsNotNull() {
            addCriterion("kissid is not null");
            return (Criteria) this;
        }

        public Criteria andKissidEqualTo(Integer value) {
            addCriterion("kissid =", value, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidNotEqualTo(Integer value) {
            addCriterion("kissid <>", value, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidGreaterThan(Integer value) {
            addCriterion("kissid >", value, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kissid >=", value, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidLessThan(Integer value) {
            addCriterion("kissid <", value, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidLessThanOrEqualTo(Integer value) {
            addCriterion("kissid <=", value, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidIn(List<Integer> values) {
            addCriterion("kissid in", values, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidNotIn(List<Integer> values) {
            addCriterion("kissid not in", values, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidBetween(Integer value1, Integer value2) {
            addCriterion("kissid between", value1, value2, "kissid");
            return (Criteria) this;
        }

        public Criteria andKissidNotBetween(Integer value1, Integer value2) {
            addCriterion("kissid not between", value1, value2, "kissid");
            return (Criteria) this;
        }

        public Criteria andTalktimeIsNull() {
            addCriterion("talktime is null");
            return (Criteria) this;
        }

        public Criteria andTalktimeIsNotNull() {
            addCriterion("talktime is not null");
            return (Criteria) this;
        }

        public Criteria andTalktimeEqualTo(String value) {
            addCriterion("talktime =", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeNotEqualTo(String value) {
            addCriterion("talktime <>", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeGreaterThan(String value) {
            addCriterion("talktime >", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeGreaterThanOrEqualTo(String value) {
            addCriterion("talktime >=", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeLessThan(String value) {
            addCriterion("talktime <", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeLessThanOrEqualTo(String value) {
            addCriterion("talktime <=", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeLike(String value) {
            addCriterion("talktime like", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeNotLike(String value) {
            addCriterion("talktime not like", value, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeIn(List<String> values) {
            addCriterion("talktime in", values, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeNotIn(List<String> values) {
            addCriterion("talktime not in", values, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeBetween(String value1, String value2) {
            addCriterion("talktime between", value1, value2, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalktimeNotBetween(String value1, String value2) {
            addCriterion("talktime not between", value1, value2, "talktime");
            return (Criteria) this;
        }

        public Criteria andTalkIsNull() {
            addCriterion("talk is null");
            return (Criteria) this;
        }

        public Criteria andTalkIsNotNull() {
            addCriterion("talk is not null");
            return (Criteria) this;
        }

        public Criteria andTalkEqualTo(String value) {
            addCriterion("talk =", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkNotEqualTo(String value) {
            addCriterion("talk <>", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkGreaterThan(String value) {
            addCriterion("talk >", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkGreaterThanOrEqualTo(String value) {
            addCriterion("talk >=", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkLessThan(String value) {
            addCriterion("talk <", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkLessThanOrEqualTo(String value) {
            addCriterion("talk <=", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkLike(String value) {
            addCriterion("talk like", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkNotLike(String value) {
            addCriterion("talk not like", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkIn(List<String> values) {
            addCriterion("talk in", values, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkNotIn(List<String> values) {
            addCriterion("talk not in", values, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkBetween(String value1, String value2) {
            addCriterion("talk between", value1, value2, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkNotBetween(String value1, String value2) {
            addCriterion("talk not between", value1, value2, "talk");
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