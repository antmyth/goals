package com.apn.goals
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json._

class GoalsServicesServlet extends ScalatraServlet with JacksonJsonSupport {
  before(){
    contentType = formats("json")
  }
  get("/goal") {
    List(Goal("name1",10,1,5),Goal("name2",1000,10,15),Goal("name3",100,10,50))
  }
  protected implicit lazy val jsonFormats: Formats = DefaultFormats
}
case class Goal(name:String,start:Int, objective:Int, current:Int)