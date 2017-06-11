package com.elastic.demo.movie;

/**
 * Created by Kinath on 6/11/2017.
 */

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL) @JsonPropertyOrder({"id", "name"})
public class Genre
{

    @JsonProperty("id") private Integer id;
    @JsonProperty("name") private String name;
    @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id") public Integer getId()
    {
        return id;
    }

    @JsonProperty("id") public void setId( Integer id )
    {
        this.id = id;
    }

    @JsonProperty("name") public String getName()
    {
        return name;
    }

    @JsonProperty("name") public void setName( String name )
    {
        this.name = name;
    }

    @JsonAnyGetter public Map<String, Object> getAdditionalProperties()
    {
        return this.additionalProperties;
    }

    @JsonAnySetter public void setAdditionalProperty( String name, Object value )
    {
        this.additionalProperties.put( name, value );
    }

}

