package com.qiang.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceIsNull() {
            addCriterion("shop_introduce is null");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceIsNotNull() {
            addCriterion("shop_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceEqualTo(String value) {
            addCriterion("shop_introduce =", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotEqualTo(String value) {
            addCriterion("shop_introduce <>", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceGreaterThan(String value) {
            addCriterion("shop_introduce >", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("shop_introduce >=", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceLessThan(String value) {
            addCriterion("shop_introduce <", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceLessThanOrEqualTo(String value) {
            addCriterion("shop_introduce <=", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceLike(String value) {
            addCriterion("shop_introduce like", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotLike(String value) {
            addCriterion("shop_introduce not like", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceIn(List<String> values) {
            addCriterion("shop_introduce in", values, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotIn(List<String> values) {
            addCriterion("shop_introduce not in", values, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceBetween(String value1, String value2) {
            addCriterion("shop_introduce between", value1, value2, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotBetween(String value1, String value2) {
            addCriterion("shop_introduce not between", value1, value2, "shopIntroduce");
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

        public Criteria andShopPriceEqualTo(Double value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(Double value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(Double value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(Double value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(Double value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<Double> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<Double> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(Double value1, Double value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(Double value1, Double value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNull() {
            addCriterion("shop_image is null");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNotNull() {
            addCriterion("shop_image is not null");
            return (Criteria) this;
        }

        public Criteria andShopImageEqualTo(String value) {
            addCriterion("shop_image =", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotEqualTo(String value) {
            addCriterion("shop_image <>", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThan(String value) {
            addCriterion("shop_image >", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThanOrEqualTo(String value) {
            addCriterion("shop_image >=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThan(String value) {
            addCriterion("shop_image <", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThanOrEqualTo(String value) {
            addCriterion("shop_image <=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLike(String value) {
            addCriterion("shop_image like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotLike(String value) {
            addCriterion("shop_image not like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageIn(List<String> values) {
            addCriterion("shop_image in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotIn(List<String> values) {
            addCriterion("shop_image not in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageBetween(String value1, String value2) {
            addCriterion("shop_image between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotBetween(String value1, String value2) {
            addCriterion("shop_image not between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopCountIsNull() {
            addCriterion("shop_count is null");
            return (Criteria) this;
        }

        public Criteria andShopCountIsNotNull() {
            addCriterion("shop_count is not null");
            return (Criteria) this;
        }

        public Criteria andShopCountEqualTo(Integer value) {
            addCriterion("shop_count =", value, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountNotEqualTo(Integer value) {
            addCriterion("shop_count <>", value, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountGreaterThan(Integer value) {
            addCriterion("shop_count >", value, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_count >=", value, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountLessThan(Integer value) {
            addCriterion("shop_count <", value, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountLessThanOrEqualTo(Integer value) {
            addCriterion("shop_count <=", value, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountIn(List<Integer> values) {
            addCriterion("shop_count in", values, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountNotIn(List<Integer> values) {
            addCriterion("shop_count not in", values, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountBetween(Integer value1, Integer value2) {
            addCriterion("shop_count between", value1, value2, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_count not between", value1, value2, "shopCount");
            return (Criteria) this;
        }

        public Criteria andShopDateIsNull() {
            addCriterion("shop_date is null");
            return (Criteria) this;
        }

        public Criteria andShopDateIsNotNull() {
            addCriterion("shop_date is not null");
            return (Criteria) this;
        }

        public Criteria andShopDateEqualTo(String value) {
            addCriterion("shop_date =", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateNotEqualTo(String value) {
            addCriterion("shop_date <>", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateGreaterThan(String value) {
            addCriterion("shop_date >", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateGreaterThanOrEqualTo(String value) {
            addCriterion("shop_date >=", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateLessThan(String value) {
            addCriterion("shop_date <", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateLessThanOrEqualTo(String value) {
            addCriterion("shop_date <=", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateLike(String value) {
            addCriterion("shop_date like", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateNotLike(String value) {
            addCriterion("shop_date not like", value, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateIn(List<String> values) {
            addCriterion("shop_date in", values, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateNotIn(List<String> values) {
            addCriterion("shop_date not in", values, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateBetween(String value1, String value2) {
            addCriterion("shop_date between", value1, value2, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopDateNotBetween(String value1, String value2) {
            addCriterion("shop_date not between", value1, value2, "shopDate");
            return (Criteria) this;
        }

        public Criteria andShopTypeidIsNull() {
            addCriterion("shop_typeId is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeidIsNotNull() {
            addCriterion("shop_typeId is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeidEqualTo(Integer value) {
            addCriterion("shop_typeId =", value, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidNotEqualTo(Integer value) {
            addCriterion("shop_typeId <>", value, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidGreaterThan(Integer value) {
            addCriterion("shop_typeId >", value, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_typeId >=", value, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidLessThan(Integer value) {
            addCriterion("shop_typeId <", value, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("shop_typeId <=", value, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidIn(List<Integer> values) {
            addCriterion("shop_typeId in", values, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidNotIn(List<Integer> values) {
            addCriterion("shop_typeId not in", values, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidBetween(Integer value1, Integer value2) {
            addCriterion("shop_typeId between", value1, value2, "shopTypeid");
            return (Criteria) this;
        }

        public Criteria andShopTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_typeId not between", value1, value2, "shopTypeid");
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