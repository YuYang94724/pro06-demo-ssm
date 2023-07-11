package com.atguigu.imperial.court.entity;

public class Emp {

    public Emp() {
    }

    public Emp(Integer empId, String empName, String empPosition, String loginAccount, String loginPassword) {
        this.empId = empId;
        this.empName = empName;
        this.empPosition = empPosition;
        this.loginAccount = loginAccount;
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empPosition='" + empPosition + '\'' +
                ", loginAccount='" + loginAccount + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_id
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    private Integer empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_name
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_position
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    private String empPosition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.login_account
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    private String loginAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.login_password
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    private String loginPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_id
     *
     * @return the value of t_emp.emp_id
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_id
     *
     * @param empId the value for t_emp.emp_id
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_name
     *
     * @return the value of t_emp.emp_name
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_name
     *
     * @param empName the value for t_emp.emp_name
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_position
     *
     * @return the value of t_emp.emp_position
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public String getEmpPosition() {
        return empPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_position
     *
     * @param empPosition the value for t_emp.emp_position
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition == null ? null : empPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.login_account
     *
     * @return the value of t_emp.login_account
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.login_account
     *
     * @param loginAccount the value for t_emp.login_account
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.login_password
     *
     * @return the value of t_emp.login_password
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.login_password
     *
     * @param loginPassword the value for t_emp.login_password
     *
     * @mbggenerated Mon Jul 10 00:15:16 CST 2023
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }
}