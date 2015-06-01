package com.jamindy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jamindy.mongo.ObjectIdAdaptor;
import org.bson.types.ObjectId;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Created by admin on 15-5-31.
 */
public class Model {
    @JsonProperty("_id")
    protected ObjectId id;

    @SuppressWarnings("restriction")
    @XmlJavaTypeAdapter(ObjectIdAdaptor.class)
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
