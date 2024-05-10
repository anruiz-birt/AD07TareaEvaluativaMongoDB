//https://www.jsonschema2pojo.org/
package eus.birt.dam.domain;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"_id",
	"id",
	"type",
	"geometry",
	"properties"
})

@Data
@AllArgsConstructor
@Document(collection="espaciosnaturales")
public class EspacioNatural {
	
	@Id
	@JsonProperty("_id")	
	private String _id;	
	@JsonProperty("id")
	private BigInteger id;
	@JsonProperty("type")
	private String type;
	@JsonProperty("geometry")
	private Geometry geometry;
	@JsonProperty("properties")
	private Properties properties;
}