 ###Test-Framework
  Extends the future of data provider supported byt Testng.    
 ###Future
####support csv file format   
####support json file format   

####usage
#####1. add depencey   
<pre>
<dependency>     
<groupId>com.github.superproxy</groupId>    
<artifactId>test-data-provider</artifactId>    
<version>0.1.0</version>    
</dependency>    
</pre>

####2. design use case and input the test data into a csv file or a json file. <br/>
age,expected  <br/>
9,0  <br/>
10,1  <br/>
20,2   <br/>
30,3  <br/>
100,3   <br/>

####3. add annotion on a test  
   @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class) <br/>
    @Csv("/service/UserService/testCalRank.csv") <br/>
    public void testCalRank(String age, int expected) throws Exception { <br/>
        User user = new User(); <br/>
        user.setAge(Integer.parseInt(age)); <br/>
        assertEquals(userService.calRank(user), expected); <br/>
    } <br/>
