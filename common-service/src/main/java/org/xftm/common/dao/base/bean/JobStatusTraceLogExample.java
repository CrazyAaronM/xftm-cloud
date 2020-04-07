package org.xftm.common.dao.base.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobStatusTraceLogExample {
    /**
     * JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    protected String orderByClause;

    /**
     * JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    protected boolean distinct;

    /**
     * JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public JobStatusTraceLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdIsNull() {
            addCriterion("original_task_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdIsNotNull() {
            addCriterion("original_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdEqualTo(String value) {
            addCriterion("original_task_id =", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdNotEqualTo(String value) {
            addCriterion("original_task_id <>", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdGreaterThan(String value) {
            addCriterion("original_task_id >", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("original_task_id >=", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdLessThan(String value) {
            addCriterion("original_task_id <", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdLessThanOrEqualTo(String value) {
            addCriterion("original_task_id <=", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdLike(String value) {
            addCriterion("original_task_id like", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdNotLike(String value) {
            addCriterion("original_task_id not like", value, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdIn(List<String> values) {
            addCriterion("original_task_id in", values, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdNotIn(List<String> values) {
            addCriterion("original_task_id not in", values, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdBetween(String value1, String value2) {
            addCriterion("original_task_id between", value1, value2, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginalTaskIdNotBetween(String value1, String value2) {
            addCriterion("original_task_id not between", value1, value2, "originalTaskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdIsNull() {
            addCriterion("slave_id is null");
            return (Criteria) this;
        }

        public Criteria andSlaveIdIsNotNull() {
            addCriterion("slave_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlaveIdEqualTo(String value) {
            addCriterion("slave_id =", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdNotEqualTo(String value) {
            addCriterion("slave_id <>", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdGreaterThan(String value) {
            addCriterion("slave_id >", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdGreaterThanOrEqualTo(String value) {
            addCriterion("slave_id >=", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdLessThan(String value) {
            addCriterion("slave_id <", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdLessThanOrEqualTo(String value) {
            addCriterion("slave_id <=", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdLike(String value) {
            addCriterion("slave_id like", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdNotLike(String value) {
            addCriterion("slave_id not like", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdIn(List<String> values) {
            addCriterion("slave_id in", values, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdNotIn(List<String> values) {
            addCriterion("slave_id not in", values, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdBetween(String value1, String value2) {
            addCriterion("slave_id between", value1, value2, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdNotBetween(String value1, String value2) {
            addCriterion("slave_id not between", value1, value2, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeIsNull() {
            addCriterion("execution_type is null");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeIsNotNull() {
            addCriterion("execution_type is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeEqualTo(String value) {
            addCriterion("execution_type =", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeNotEqualTo(String value) {
            addCriterion("execution_type <>", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeGreaterThan(String value) {
            addCriterion("execution_type >", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("execution_type >=", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeLessThan(String value) {
            addCriterion("execution_type <", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeLessThanOrEqualTo(String value) {
            addCriterion("execution_type <=", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeLike(String value) {
            addCriterion("execution_type like", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeNotLike(String value) {
            addCriterion("execution_type not like", value, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeIn(List<String> values) {
            addCriterion("execution_type in", values, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeNotIn(List<String> values) {
            addCriterion("execution_type not in", values, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeBetween(String value1, String value2) {
            addCriterion("execution_type between", value1, value2, "executionType");
            return (Criteria) this;
        }

        public Criteria andExecutionTypeNotBetween(String value1, String value2) {
            addCriterion("execution_type not between", value1, value2, "executionType");
            return (Criteria) this;
        }

        public Criteria andShardingItemIsNull() {
            addCriterion("sharding_item is null");
            return (Criteria) this;
        }

        public Criteria andShardingItemIsNotNull() {
            addCriterion("sharding_item is not null");
            return (Criteria) this;
        }

        public Criteria andShardingItemEqualTo(String value) {
            addCriterion("sharding_item =", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemNotEqualTo(String value) {
            addCriterion("sharding_item <>", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemGreaterThan(String value) {
            addCriterion("sharding_item >", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemGreaterThanOrEqualTo(String value) {
            addCriterion("sharding_item >=", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemLessThan(String value) {
            addCriterion("sharding_item <", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemLessThanOrEqualTo(String value) {
            addCriterion("sharding_item <=", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemLike(String value) {
            addCriterion("sharding_item like", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemNotLike(String value) {
            addCriterion("sharding_item not like", value, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemIn(List<String> values) {
            addCriterion("sharding_item in", values, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemNotIn(List<String> values) {
            addCriterion("sharding_item not in", values, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemBetween(String value1, String value2) {
            addCriterion("sharding_item between", value1, value2, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andShardingItemNotBetween(String value1, String value2) {
            addCriterion("sharding_item not between", value1, value2, "shardingItem");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 07 11:46:40 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JOB_STATUS_TRACE_LOG
     *
     * @mbg.generated Tue Apr 07 11:46:40 CST 2020
     */
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