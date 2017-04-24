package com.myalice.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class QuestionOrder extends BaseDomain{
    
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.create_time
     *
     * @mbg.generated
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.solved_time
     *
     * @mbg.generated
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date solvedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.state
     *
     * @mbg.generated
     */
    private Byte state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.question_type
     *
     * @mbg.generated
     */
    private Byte questionType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.question_summary
     *
     * @mbg.generated
     */
    private String questionSummary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_order.question_content
     *
     * @mbg.generated
     */
    private String questionContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.id
     *
     * @return the value of question_order.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.id
     *
     * @param id the value for question_order.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.create_time
     *
     * @return the value of question_order.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.create_time
     *
     * @param createTime the value for question_order.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.create_user
     *
     * @return the value of question_order.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.create_user
     *
     * @param createUser the value for question_order.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.solved_time
     *
     * @return the value of question_order.solved_time
     *
     * @mbg.generated
     */
    public Date getSolvedTime() {
        return solvedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.solved_time
     *
     * @param solvedTime the value for question_order.solved_time
     *
     * @mbg.generated
     */
    public void setSolvedTime(Date solvedTime) {
        this.solvedTime = solvedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.state
     *
     * @return the value of question_order.state
     *
     * @mbg.generated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.state
     *
     * @param state the value for question_order.state
     *
     * @mbg.generated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.question_type
     *
     * @return the value of question_order.question_type
     *
     * @mbg.generated
     */
    public Byte getQuestionType() {
        return questionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.question_type
     *
     * @param questionType the value for question_order.question_type
     *
     * @mbg.generated
     */
    public void setQuestionType(Byte questionType) {
        this.questionType = questionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.question_summary
     *
     * @return the value of question_order.question_summary
     *
     * @mbg.generated
     */
    public String getQuestionSummary() {
        return questionSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.question_summary
     *
     * @param questionSummary the value for question_order.question_summary
     *
     * @mbg.generated
     */
    public void setQuestionSummary(String questionSummary) {
        this.questionSummary = questionSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_order.question_content
     *
     * @return the value of question_order.question_content
     *
     * @mbg.generated
     */
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_order.question_content
     *
     * @param questionContent the value for question_order.question_content
     *
     * @mbg.generated
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}