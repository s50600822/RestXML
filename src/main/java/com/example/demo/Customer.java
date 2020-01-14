package com.example.demo;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
public class Customer {
	static final XmlMapper xmlMapper = new XmlMapper();
    static final ObjectMapper jsonMapper = new ObjectMapper();
    private int custNo;
    private String name;
    //@JacksonXmlText
    //@JacksonXmlElementWrapper()
    @XmlElement(name="country")
    private JsonNode country;
    public Customer() {

    }
//    public Customer(int custNumber, String name, String country) {
//        this.custNo = custNumber;
//        this.name = name;
//        this.country = country;
//    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        try {
			return xmlMapper.writeValueAsString(country);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "con cac";
		}
    }

    public void setCountry(JsonNode country) {
        this.country = country;
    }

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", name=" + getName() + ", country=" + getCountry() +"]";
	}
}
