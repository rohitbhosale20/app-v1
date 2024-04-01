package app.vectordbv1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mytable")
public class DataModel {
    
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "pid")
	    private Long pid;
	    
	    @Column(name = "First_Name") // Specify column name
	    private String firstName;
	    
	    @Column(name = "last_name") // Specify column name
	    private String lastName;
	    
	    @Column(name = "email_address") // Specify column name
	    private String emailAddress;
	    
	    @Column(name = "company_name") // Specify column name
	    private String companyName;
	    
	    @Column(name = "company_domain") // Specify column name
	    private String companyDomain;
	    
	    @Column(name = "job_title") // Specify column name
	    private String jobTitle;
	    
	    @Column(name = "job_function") // Specify column name
	    private String jobFunction;
	    
	    @Column(name = "job_level") // Specify column name
	    private String jobLevel;
	    
	    @Column(name = "Company_Address") // Specify column name
	    private String companyAddress;
	    
	    @Column(name = "city") // Specify column name
	    private String city;
	    
	    @Column(name = "State") // Specify column name
	    private String state;
	    
	    @Column(name = "Zip_Code") // Specify column name
	    private String zipCode;
	    
	    @Column(name = "country") // Specify column name
	    private String country;
	    
	    @Column(name = "Telephone_Number") // Specify column name
	    private String telephoneNumber;
	    
	    @Column(name = "Employee_Size") // Specify column name
	    private String employeeSize;
	    
	    @Column(name = "Industry") // Specify column name
	    private String industry;
	    
	    @Column(name = "Company_Link") // Specify column name
	    private String companyLink;
	    
	    @Column(name = "Prospect_Link") // Specify column name
	    private String prospectLink;
    // Getters and setters
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDomain() {
        return companyDomain;
    }

    public void setCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobFunction() {
        return jobFunction;
    }

    public void setJobFunction(String jobFunction) {
        this.jobFunction = jobFunction;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmployeeSize() {
        return employeeSize;
    }

    public void setEmployeeSize(String employeeSize) {
        this.employeeSize = employeeSize;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCompanyLink() {
        return companyLink;
    }

    public void setCompanyLink(String companyLink) {
        this.companyLink = companyLink;
    }

    public String getProspectLink() {
        return prospectLink;
    }

    public void setProspectLink(String prospectLink) {
        this.prospectLink = prospectLink;
    }
}
