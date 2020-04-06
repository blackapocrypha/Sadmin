package com.SoftAdmin.bean;

import java.util.ArrayList;
import java.util.List;

public class SoftlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftlistExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSoftnameIsNull() {
            addCriterion("softname is null");
            return (Criteria) this;
        }

        public Criteria andSoftnameIsNotNull() {
            addCriterion("softname is not null");
            return (Criteria) this;
        }

        public Criteria andSoftnameEqualTo(String value) {
            addCriterion("softname =", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotEqualTo(String value) {
            addCriterion("softname <>", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameGreaterThan(String value) {
            addCriterion("softname >", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameGreaterThanOrEqualTo(String value) {
            addCriterion("softname >=", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLessThan(String value) {
            addCriterion("softname <", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLessThanOrEqualTo(String value) {
            addCriterion("softname <=", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLike(String value) {
            addCriterion("softname like", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotLike(String value) {
            addCriterion("softname not like", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameIn(List<String> values) {
            addCriterion("softname in", values, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotIn(List<String> values) {
            addCriterion("softname not in", values, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameBetween(String value1, String value2) {
            addCriterion("softname between", value1, value2, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotBetween(String value1, String value2) {
            addCriterion("softname not between", value1, value2, "softname");
            return (Criteria) this;
        }

        public Criteria andSofttypeIsNull() {
            addCriterion("softtype is null");
            return (Criteria) this;
        }

        public Criteria andSofttypeIsNotNull() {
            addCriterion("softtype is not null");
            return (Criteria) this;
        }

        public Criteria andSofttypeEqualTo(String value) {
            addCriterion("softtype =", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotEqualTo(String value) {
            addCriterion("softtype <>", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThan(String value) {
            addCriterion("softtype >", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThanOrEqualTo(String value) {
            addCriterion("softtype >=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThan(String value) {
            addCriterion("softtype <", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThanOrEqualTo(String value) {
            addCriterion("softtype <=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLike(String value) {
            addCriterion("softtype like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotLike(String value) {
            addCriterion("softtype not like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeIn(List<String> values) {
            addCriterion("softtype in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotIn(List<String> values) {
            addCriterion("softtype not in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeBetween(String value1, String value2) {
            addCriterion("softtype between", value1, value2, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotBetween(String value1, String value2) {
            addCriterion("softtype not between", value1, value2, "softtype");
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