package com.jamindy.mongo;

import org.bson.types.ObjectId;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by admin on 15-5-31.
 */
public class ObjectIdAdaptor extends XmlAdapter<String,ObjectId> {

    @Override
    public String marshal(ObjectId objectId) throws Exception {
        return objectId.toString();
    }

    @Override
    public ObjectId unmarshal(String s) throws Exception {
        return new ObjectId(s);
    }
}
