/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.google.gson.JsonObject;


public class Message {
    
    
    private int id;
    private String name;
    private String message;
    private String created_at;

    public Message(int id, String name, String message, String created_at) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.created_at = created_at;
    }
    
    public Message(String name, String message, String created_at) {
        this.name = name;
        this.message = message;
        this.created_at = created_at;
    }
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    
    public JsonObject getJsonObject(){
        JsonObject jo = new JsonObject();
        
        jo.addProperty("id", this.getId());
        jo.addProperty("name", this.getName());
        jo.addProperty("message", this.getMessage());
        jo.addProperty("created_at", this.getCreated_at());
        
        return jo;
    }
    
   
    
}
