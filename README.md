 #Test-Framework
  Extends the future of data provider supported byt Testng. <br/>
 #Future
support csv file format <br/>
support json file format <br/>

#usage
#####1. add depencey <br/>
<dependency>   <br/>
<groupId>com.github.superproxy</groupId>  <br/>
<artifactId>test-data-provider</artifactId>  <br/>
<version>0.1.0</version>  <br/>
</dependency>  <br/>

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
