package ru.oschepkov.years;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceJson {

    @JacksonXmlProperty(isAttribute = true)
    private String currency;

    @JacksonXmlText
    private double value;
}


