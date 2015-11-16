### Test-Data-Provider
  Extends the feture of data provider supported by Testng.    
### Feture
* Support csv file format   
* Support json file format   

#### Usage
#####1. Add the dependency   
```
<dependency>     
    <groupId>com.github.superproxy</groupId>    
    <artifactId>test-data-provider</artifactId>    
    <version>0.1.0</version>    
</dependency>    
```

####2. Design a use case and input the following test data into a csv file or a json file. <br/>
```
age,expected
9,0 
10,1 
20,2  
30,3
100,3
```

####3. Add the @Csv annotion on a test  and set dataProviderClass=CommonDataProvider.class and set dataProvider= genData
  ```
    @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class) 
    @Csv("/service/UserService/testCalRank.csv")  
    public void testCalRank(String age, int expected) throws Exception { 
        User user = new User();  
        user.setAge(Integer.parseInt(age));  
        assertEquals(userService.calRank(user), expected);  
    }  
```
