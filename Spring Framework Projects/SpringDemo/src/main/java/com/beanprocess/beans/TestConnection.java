package com.beanprocess.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestConnection
{
    private HttpURLConnection connection;
    private String url;
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl()
    {
        return url;
    }
    @PostConstruct
    public void init(){
        System.out.println("Inside init() method...");
        URL obj;
        try {
            obj = new URL(this.url);
//initialize http connection here
            this.connection = (HttpURLConnection)
                    obj.openConnection();
        } catch (MalformedURLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();}
    }
    @PreDestroy
    public void destroy(){
        try{
            System.out.println("Inside destroy() method...");
            if(this.connection != null) {
                connection.disconnect();
            }
        }catch(Exception ex){
        }}
    public void readData(){
        try {
            int responseCode = this.connection.getResponseCode();
            System.out.println("Responsing: "+responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }}}

