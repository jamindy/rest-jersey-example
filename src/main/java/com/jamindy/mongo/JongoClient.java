package com.jamindy.mongo;

import com.mongodb.Mongo;
import org.jongo.Jongo;

/**
 * Created by admin on 15-5-31.
 */
public class JongoClient {

    private static Jongo jongo;

    private static final String SERVER_ADDRESS = "127.0.0.1";

    private static final int SERVER_PORT = 27017;

    private static final String DB_NAME = "test";

    static {
        try {
            Mongo mongo = new Mongo(SERVER_ADDRESS,SERVER_PORT);
            jongo = new Jongo(mongo.getDB(DB_NAME));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Jongo getInstance(){
        return jongo;
    }
}
