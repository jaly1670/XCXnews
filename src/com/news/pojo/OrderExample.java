package com.news.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopUserIsNull() {
            addCriterion("shop_user is null");
            return (Criteria) this;
        }

        public Criteria andShopUserIsNotNull() {
            addCriterion("shop_user is not null");
            return (Criteria) this;
        }

        public Criteria andShopUserEqualTo(String value) {
            addCriterion("shop_user =", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserNotEqualTo(String value) {
            addCriterion("shop_user <>", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserGreaterThan(String value) {
            addCriterion("shop_user >", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserGreaterThanOrEqualTo(String value) {
            addCriterion("shop_user >=", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserLessThan(String value) {
            addCriterion("shop_user <", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserLessThanOrEqualTo(String value) {
            addCriterion("shop_user <=", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserLike(String value) {
            addCriterion("shop_user like", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserNotLike(String value) {
            addCriterion("shop_user not like", value, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserIn(List<String> values) {
            addCriterion("shop_user in", values, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserNotIn(List<String> values) {
            addCriterion("shop_user not in", values, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserBetween(String value1, String value2) {
            addCriterion("shop_user between", value1, value2, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopUserNotBetween(String value1, String value2) {
            addCriterion("shop_user not between", value1, value2, "shopUser");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(String value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(String value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(String value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(String value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(String value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(String value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLike(String value) {
            addCriterion("shop_price like", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotLike(String value) {
            addCriterion("shop_price not like", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<String> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<String> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(String value1, String value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(String value1, String value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("shopId like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("shopId not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRelateNameIsNull() {
            addCriterion("relate_name is null");
            return (Criteria) this;
        }

        public Criteria andRelateNameIsNotNull() {
            addCriterion("relate_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelateNameEqualTo(String value) {
            addCriterion("relate_name =", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameNotEqualTo(String value) {
            addCriterion("relate_name <>", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameGreaterThan(String value) {
            addCriterion("relate_name >", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameGreaterThanOrEqualTo(String value) {
            addCriterion("relate_name >=", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameLessThan(String value) {
            addCriterion("relate_name <", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameLessThanOrEqualTo(String value) {
            addCriterion("relate_name <=", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameLike(String value) {
            addCriterion("relate_name like", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameNotLike(String value) {
            addCriterion("relate_name not like", value, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameIn(List<String> values) {
            addCriterion("relate_name in", values, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameNotIn(List<String> values) {
            addCriterion("relate_name not in", values, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameBetween(String value1, String value2) {
            addCriterion("relate_name between", value1, value2, "relateName");
            return (Criteria) this;
        }

        public Criteria andRelateNameNotBetween(String value1, String value2) {
            addCriterion("relate_name not between", value1, value2, "relateName");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
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