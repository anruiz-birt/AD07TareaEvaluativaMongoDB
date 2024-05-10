package eus.birt.dam.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"documentname",
	"documentdescription",
	"templatetype",
	"locality",
	"marks",
	"physical",
	"visual",
	"auditive",
	"intellectual",
	"organic",
	"naturetype",
	"municipality",
	"municipalitycode",
	"territory",
	"territorycode",
	"country",
	"countrycode",
	"friendlyurl",
	"physicalurl",
	"dataxml",
	"metadataxml",
	"zipfile"
})

@Data
@NoArgsConstructor
public class Properties {
	
	@JsonProperty("documentname")
	private String documentname;
	@JsonProperty("documentdescription")
	private String documentdescription;
	@JsonProperty("templatetype")
	private String templatetype;
	@JsonProperty("locality")
	private String locality;
	@JsonProperty("marks")
	private String marks;
	@JsonProperty("physical")
	private String physical;
	@JsonProperty("visual")
	private String visual;
	@JsonProperty("auditive")
	private String auditive;
	@JsonProperty("intellectual")
	private String intellectual;
	@JsonProperty("organic")
	private String organic;
	@JsonProperty("naturetype")
	private String naturetype;
	@JsonProperty("municipality")
	private String municipality;
	@JsonProperty("municipalitycode")
	private String municipalitycode;
	@JsonProperty("territory")
	private String territory;
	@JsonProperty("territorycode")
	private String territorycode;
	@JsonProperty("country")
	private String country;
	@JsonProperty("countrycode")
	private String countrycode;
	@JsonProperty("friendlyurl")
	private String friendlyurl;
	@JsonProperty("physicalurl")
	private String physicalurl;
	@JsonProperty("dataxml")
	private String dataxml;
	@JsonProperty("metadataxml")
	private String metadataxml;
	@JsonProperty("zipfile")
	private String zipfile;
}